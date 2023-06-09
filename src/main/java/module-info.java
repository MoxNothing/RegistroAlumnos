module com.example.registroalumnos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.registroalumnos to javafx.fxml;
    exports com.example.registroalumnos;
}