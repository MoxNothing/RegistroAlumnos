package com.example.registroalumnos;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Resultado {
    public static void mostrarReporte(String nombre, String apellido, String genero, String grado, String modalidad, String monto, String duracion) {
        Stage stage = new Stage();
        VBox layout = new VBox();
        stage.setTitle("Reporte Detallado");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);


        Label nombreLabel = new Label("Nombre: ");
        Label apellidoLabel = new Label("Apellido: ");
        Label generoLabel = new Label("Género: ");
        Label gradoLabel = new Label("Grado: ");
        Label modalidadLabel = new Label("Modalidad: ");
        Label montoLabel = new Label("Monto a Pagar: ");
        Label duracionLabel = new Label("Duración del Semestre: ");


        Label nombreValueLabel = new Label(nombre);
        Label apellidoValueLabel = new Label(apellido);
        Label generoValueLabel = new Label(genero);
        Label gradoValueLabel = new Label(grado);
        Label modalidadValueLabel = new Label(modalidad);
        Label montoValueLabel = new Label(monto);
        Label duracionValueLabel = new Label(duracion);

        gridPane.add(nombreLabel, 0, 0);
        gridPane.add(nombreValueLabel, 1, 0);
        gridPane.add(apellidoLabel, 0, 1);
        gridPane.add(apellidoValueLabel, 1, 1);
        gridPane.add(generoLabel, 0, 2);
        gridPane.add(generoValueLabel, 1, 2);
        gridPane.add(gradoLabel, 0, 3);
        gridPane.add(gradoValueLabel, 1, 3);
        gridPane.add(modalidadLabel, 0, 4);
        gridPane.add(modalidadValueLabel, 1, 4);
        gridPane.add(montoLabel, 0, 5);
        gridPane.add(montoValueLabel, 1, 5);
        gridPane.add(duracionLabel, 0, 6);
        gridPane.add(duracionValueLabel, 1, 6);

        Button salirButton = new Button("Salir");
        salirButton.setAlignment(Pos.CENTER);
        salirButton.setOnAction(e -> {
            stage.close();
        });

        layout.getChildren().addAll(gridPane, salirButton);

        Scene scene = new Scene(layout, 400, 300);
        scene.getRoot().setStyle("-fx-background-color: rgba(0, 0, 255, 0.5);");
        stage.setScene(scene);
        stage.show();
    }
}