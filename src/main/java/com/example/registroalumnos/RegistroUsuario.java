package com.example.registroalumnos;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class RegistroUsuario {
    private Main main;
    private TextField correoField;
    private PasswordField contraseñaField;

    public RegistroUsuario(Main main) {
        this.main = main;
    }

    public VBox getLayout() {
        VBox layout = new VBox();
        layout.setPadding(new Insets(20));
        layout.setSpacing(10);

        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Labels
        Label correoLabel = new Label("Correo:");
        Label contraseñaLabel = new Label("Contraseña:");

        // TextFields
        correoField = new TextField();
        contraseñaField = new PasswordField();

        // Button
        Button iniciarButton = new Button("Iniciar");
        iniciarButton.setOnAction(e -> main.showRegistroDatos());

        // Add elements to gridPane
        gridPane.add(correoLabel, 0, 0);
        gridPane.add(correoField, 1, 0);
        gridPane.add(contraseñaLabel, 0, 1);
        gridPane.add(contraseñaField, 1, 1);

        layout.getChildren().addAll(gridPane, iniciarButton);

        return layout;
    }

    public String getCorreo() {
        return correoField.getText();
    }

    public String getContraseña() {
        return contraseñaField.getText();
    }
}


