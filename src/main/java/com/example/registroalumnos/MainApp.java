package com.example.registroalumnos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;


public class MainApp extends Application {

    private TextField nombreField;
    private TextField apellidoField;
    private ChoiceBox<String> generoChoiceBox;
    private TextField gradoField;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cuotas y Matrícula");

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
        Button generarReporteButton = new Button("Agregar Alumno");
        generarReporteButton.setOnAction(e -> generarReporte());

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

        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void generarReporte() {
        // Obtener los datos del formulario
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String genero = generoChoiceBox.getValue();
        String grado = gradoField.getText();

        // Realizar los cálculos de cuotas y matrícula según tus reglas de negocio

        // Generar el reporte utilizando una biblioteca de generación de informes
        // Aquí puedes agregar el código necesario para generar el reporte en PDF o Excel
    }

    public static void main(String[] args) {
        launch(args);
    }
}