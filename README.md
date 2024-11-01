# Proyecto de Reloj Digital en JavaFX - ejercicioK_DEIN

    Este proyecto es una aplicación de reloj digital desarrollada en JavaFX que muestra la hora actual utilizando imágenes para representar cada dígito en la hora, minutos y segundos. Las imágenes se actualizan cada segundo para reflejar el tiempo en tiempo real.

## Características

    Reloj digital que utiliza imágenes para representar cada dígito de la hora, minuto y segundo.
    Se actualiza automáticamente cada segundo usando Timer y TimerTask.
    La interfaz está diseñada utilizando un archivo FXML (K.fxml) que define la disposición del reloj y los elementos gráficos.

## Estructura del Proyecto

El proyecto tiene las siguientes carpetas y archivos principales:

### Directorio src/main/java/eu/andreatt/ejerciciok_dein

    application/HelloApplication.java: Clase principal que inicia la aplicación JavaFX y carga el archivo FXML.
    controller/KController.java: Controlador que gestiona la visualización del reloj, incluyendo la lógica de actualización de imágenes.

### Directorio src/main/resources/eu/andreatt/ejerciciok_dein

    fxml/K.fxml: Archivo FXML que define la disposición gráfica del reloj digital en una cuadrícula (GridPane).
    images/: Carpeta que contiene las imágenes de los dígitos (ZERO.png a NINE.png) y la imagen de fondo (fondoReloj.png), utilizadas para representar cada componente del tiempo.

## Configuración

    Asegúrate de tener JavaFX configurado en tu entorno de desarrollo.
    Verifica que las imágenes necesarias están en la ruta correcta (src/main/resources/eu/andreatt/ejerciciok_dein/images/).

