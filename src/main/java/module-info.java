module eu.andreatt.ejerciciok_dein {
    requires javafx.controls; // Requerimientos de JavaFX
    requires javafx.fxml;

    // Exporta el paquete de la aplicación para que JavaFX pueda acceder a él
    exports eu.andreatt.ejerciciok_dein.application;
    exports eu.andreatt.ejerciciok_dein.controller; // Si tienes un controlador, también es recomendable exportarlo

    opens eu.andreatt.ejerciciok_dein.application to javafx.fxml;
    opens eu.andreatt.ejerciciok_dein.controller to javafx.fxml; // Esto permite la reflexión en FXML
}