package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Se crea un botón que irá en la región norte (arriba)
        Button botonN = new Button("Boton norte");
        // Se crea un botón que irá en la región sur (abajo)
        Button botonS = new Button("Boton sur");
        // Se crea un botón que irá en la región este (derecha)
        Button botonE = new Button("Boton este");
        // Se crea un botón que irá en la región oeste (izquierda)
        Button botonO = new Button("Boton oeste");
        // Se crea un botón que irá en la región centro
        Button botonC = new Button("Boton centro");

        // Se crea un panel de tipo BorderPane (distribución en 5 zonas: norte, sur, este, oeste, centro)
        BorderPane borderPane = new BorderPane();
        // Se coloca el botón norte en la parte superior
        borderPane.setTop(botonN);
        // Se coloca el botón sur en la parte inferior
        borderPane.setBottom(botonS);
        // Se coloca el botón este en el lateral derecho
        borderPane.setRight(botonE);
        // Se coloca el botón oeste en el lateral izquierdo
        borderPane.setLeft(botonO);
        // Se coloca el botón centro en el medio del panel
        borderPane.setCenter(botonC);

        // Se crea la escena con el BorderPane como raíz, de 300x300 píxeles
        Scene scene = new Scene(borderPane, 300, 300);

        // Se asigna el título "Botones cardinales" a la ventana principal
        primaryStage.setTitle("Botones cardinales");
        // Se asigna la escena a la ventana
        primaryStage.setScene(scene);
        // Se hace visible la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}