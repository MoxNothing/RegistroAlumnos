package com.example.registroalumnos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;
    private RegistroUsuario registroUsuario;
    private RegistroDatos registroDatos;
    private Reporte reporte;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        registroUsuario = new RegistroUsuario(this);
        registroDatos = new RegistroDatos(this);
        reporte = new Reporte(this);

        showRegistroUsuario();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void showRegistroUsuario() {
        VBox layout = registroUsuario.getLayout();
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registro de Usuario");
        primaryStage.show();
    }

    public void showRegistroDatos() {
        GridPane layout = registroDatos.getLayout();
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registro de Datos");
        primaryStage.show();
    }

    public void showReporte() {
        String nombre = registroDatos.getNombre();
        String apellido = registroDatos.getApellido();
        String genero = registroDatos.getGenero();
        String grado = registroDatos.getGrado();

        GridPane reporteLayout = reporte.getLayout(nombre, apellido, genero, grado);
        Scene scene = new Scene(reporteLayout, 400, 300);
        Stage reporteStage = new Stage();
        reporteStage.setScene(scene);
        reporteStage.setTitle("Reporte");
        reporteStage.initOwner(primaryStage);
        reporteStage.show();
    }

    public void showResultado(String montoAPagar) {
        // Código para mostrar la ventana Resultado con el monto a pagar
        Resultado resultado = new Resultado(montoAPagar);
        // Aquí debes implementar el código necesario para mostrar la ventana Resultado
    }

}
















