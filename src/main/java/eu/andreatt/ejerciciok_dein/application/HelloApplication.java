package eu.andreatt.ejerciciok_dein.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX que inicializa y muestra la interfaz.
 * Extiende {@link Application} para gestionar el ciclo de vida de JavaFX.
 */
public class HelloApplication extends Application {

    /**
     * Inicia la aplicación cargando la interfaz desde un archivo FXML.
     *
     * @param stage La ventana principal (escenario) de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Cargar el archivo FXML que define la interfaz de usuario
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/eu/andreatt/ejerciciok_dein/fxml/K.fxml"));

        // Crear una escena a partir del archivo FXML cargado
        Scene scene = new Scene(fxmlLoader.load());

        // Establecer el título de la ventana principal
        stage.setTitle("RELOJ");

        // Asignar la escena al escenario y mostrar la ventana
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal de la aplicación que lanza la interfaz JavaFX.
     *
     * @param args Argumentos de línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        launch(); // Lanza la aplicación JavaFX
    }
}
