package com.example.registroalumnos;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Reporte {
    private Main main;
    private ChoiceBox<String> modalidadChoiceBox;
    private Label montoValueLabel;
    private Label duracionValueLabel;

    public Reporte(Main main) {
        this.main = main;
    }

    public GridPane getLayout(String nombre, String apellido, String genero, String grado) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Labels
        Label nombreLabel = new Label("Nombre: ");
        Label apellidoLabel = new Label("Apellido: ");
        Label generoLabel = new Label("Género: ");
        Label gradoLabel = new Label("Grado: ");
        Label modalidadLabel = new Label("Modalidad: ");
        Label montoLabel = new Label("Monto a Pagar: ");
        Label duracionLabel = new Label("Duración del Semestre: ");

        // Values
        Label nombreValueLabel = new Label(nombre);
        Label apellidoValueLabel = new Label(apellido);
        Label generoValueLabel = new Label(genero);
        Label gradoValueLabel = new Label(grado);
        montoValueLabel = new Label();
        duracionValueLabel = new Label();

        // ChoiceBox
        modalidadChoiceBox = new ChoiceBox<>();
        modalidadChoiceBox.getItems().addAll("Presencial", "Semipresencial", "A distancia");
        modalidadChoiceBox.setOnAction(e -> mostrarMontoYDuracion());

        gridPane.add(nombreLabel, 0, 0);
        gridPane.add(nombreValueLabel, 1, 0);
        gridPane.add(apellidoLabel, 0, 1);
        gridPane.add(apellidoValueLabel, 1, 1);
        gridPane.add(generoLabel, 0, 2);
        gridPane.add(generoValueLabel, 1, 2);
        gridPane.add(gradoLabel, 0, 3);
        gridPane.add(gradoValueLabel, 1, 3);
        gridPane.add(modalidadLabel, 0, 4);
        gridPane.add(modalidadChoiceBox, 1, 4);
        gridPane.add(montoLabel, 0, 5);
        gridPane.add(montoValueLabel, 1, 5);
        gridPane.add(duracionLabel, 0, 6);
        gridPane.add(duracionValueLabel, 1, 6);

        // Button
        Button calcularButton = new Button("Calcular");
        calcularButton.setOnAction(e -> main.showResultado(montoValueLabel.getText()));
        gridPane.add(calcularButton, 0, 7);

        return gridPane;
    }

    private void mostrarMontoYDuracion() {
        String modalidad = modalidadChoiceBox.getValue();
        double monto = obtenerMontoPorModalidad(modalidad);
        int duracion = obtenerDuracionPorModalidad(modalidad);

        montoValueLabel.setText("$" + monto);
        duracionValueLabel.setText(duracion + " semanas");
    }

    private double obtenerMontoPorModalidad(String modalidad) {
        switch (modalidad) {
            case "Presencial":
                return 140.0;
            case "Semipresencial":
                return 100.0;
            case "A distancia":
                return 80.0;
            default:
                return 0.0;
        }
    }

    private int obtenerDuracionPorModalidad(String modalidad) {
        switch (modalidad) {
            case "Presencial":
            case "Semipresencial":
                return 16;
            case "A distancia":
                return 8;
            default:
                return 0;
        }
    }
}




