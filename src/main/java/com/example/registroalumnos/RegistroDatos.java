package com.example.registroalumnos;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class RegistroDatos {
    private Main main;
    private TextField nombreField;
    private TextField apellidoField;
    private ChoiceBox<String> generoChoiceBox;
    private TextField gradoField;

    public RegistroDatos(Main main) {
        this.main = main;
    }

    public GridPane getLayout() {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Labels
        Label nombreLabel = new Label("Nombre:");
        Label apellidoLabel = new Label("Apellido:");
        Label generoLabel = new Label("Género:");
        Label gradoLabel = new Label("Grado:");

        // TextFields
        nombreField = new TextField();
        apellidoField = new TextField();
        generoChoiceBox = new ChoiceBox<>();
        generoChoiceBox.getItems().addAll("Masculino", "Femenino");
        gradoField = new TextField();

        // Button
        Button generarReporteButton = new Button("Generar Reporte");
        generarReporteButton.setOnAction(e -> main.showReporte());

        // Add elements to gridPane
        gridPane.add(nombreLabel, 0, 0);
        gridPane.add(nombreField, 1, 0);
        gridPane.add(apellidoLabel, 0, 1);
        gridPane.add(apellidoField, 1, 1);
        gridPane.add(generoLabel, 0, 2);
        gridPane.add(generoChoiceBox, 1, 2);
        gridPane.add(gradoLabel, 0, 3);
        gridPane.add(gradoField, 1, 3);
        gridPane.add(generarReporteButton, 0, 4);

        return gridPane;
    }

    public String getNombre() {
        return nombreField.getText();
    }

    public String getApellido() {
        return apellidoField.getText();
    }

    public String getGenero() {
        return generoChoiceBox.getValue();
    }

    public String getGrado() {
        return gradoField.getText();
    }
}

