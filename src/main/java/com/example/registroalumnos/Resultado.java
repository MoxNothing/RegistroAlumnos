package com.example.registroalumnos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Resultado {
    public Resultado(String montoAPagar) {
        Stage stage = new Stage();
        VBox layout = new VBox();
        layout.getChildren().add(new Label("Monto a Pagar: " + montoAPagar));

        Button salirButton = new Button("Salir");
        salirButton.setOnAction(e -> {
            stage.close();
        });
        layout.getChildren().add(salirButton);

        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}

