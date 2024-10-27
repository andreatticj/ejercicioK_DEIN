package eu.andreatt.ejerciciok_dein.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Controlador para gestionar la visualización de un reloj digital utilizando imágenes para cada dígito.
 * Actualiza la hora cada segundo utilizando {@link Timer} y {@link TimerTask}.
 */
public class KController {

    // Declaración de los ImageView que se usarán para mostrar las imágenes de los dígitos de la hora, minuto y segundo
    @FXML
    private ImageView imagenHoraIzquierda;   // Imagen de la decena de horas
    @FXML
    private ImageView imagenHoraDerecha;     // Imagen de la unidad de horas
    @FXML
    private ImageView imagenMinutoIzquierda; // Imagen de la decena de minutos
    @FXML
    private ImageView imagenMinutoDerecha;   // Imagen de la unidad de minutos
    @FXML
    private ImageView imagenSegundoIzquierda; // Imagen de la decena de segundos
    @FXML
    private ImageView imagenSegundoDerecha;   // Imagen de la unidad de segundos

    // Array que contiene los nombres de las imágenes para los números del 0 al 9
    private final String[] numbers = {
            "ZERO.png", "ONE.png", "TWO.png", "THREE.png", "FOUR.png",
            "FIVE.png", "SIX.png", "SEVEN.png", "EIGHT.png", "NINE.png"
    };

    /**
     * Método que se llama al inicializar el controlador.
     * Configura un {@link Timer} para actualizar la hora cada segundo.
     */
    public void initialize() {
        // Crear un Timer para actualizar el reloj cada segundo
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateClock(); // Llamada a updateClock para actualizar las imágenes
            }
        }, 0, 1000); // Ejecutar inmediatamente y luego cada 1000 ms (1 segundo)
    }

    /**
     * Actualiza las imágenes de los ImageView en función de la hora actual.
     */
    private void updateClock() {
        // Obtener la hora actual
        LocalDateTime time = LocalDateTime.now();
        int hours = time.getHour();     // Extraer horas
        int minutes = time.getMinute(); // Extraer minutos
        int seconds = time.getSecond(); // Extraer segundos

        // Descomponer las horas, minutos y segundos en dígitos individuales
        int hourLeft = hours / 10;   // Decena de horas
        int hourRight = hours % 10;  // Unidad de horas
        int minuteLeft = minutes / 10; // Decena de minutos
        int minuteRight = minutes % 10; // Unidad de minutos
        int secondLeft = seconds / 10; // Decena de segundos
        int secondRight = seconds % 10; // Unidad de segundos

        // Actualizar las imágenes correspondientes a cada ImageView según el dígito
        imagenHoraIzquierda.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciok_dein/images/" + numbers[hourLeft])));
        imagenHoraDerecha.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciok_dein/images/" + numbers[hourRight])));
        imagenMinutoIzquierda.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciok_dein/images/" + numbers[minuteLeft])));
        imagenMinutoDerecha.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciok_dein/images/" + numbers[minuteRight])));
        imagenSegundoIzquierda.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciok_dein/images/" + numbers[secondLeft])));
        imagenSegundoDerecha.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciok_dein/images/" + numbers[secondRight])));
    }
}
