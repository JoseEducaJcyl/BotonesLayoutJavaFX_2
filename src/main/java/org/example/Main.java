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
        Button botonN = new Button("Boton norte");
        Button botonS = new Button("Boton sur");
        Button botonE = new Button("Boton este");
        Button botonO = new Button("Boton oeste");
        Button botonC = new Button("Boton centro");

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(botonN);
        borderPane.setBottom(botonS);
        borderPane.setLeft(botonE);
        borderPane.setRight(botonO);
        borderPane.setCenter(botonC);

        Scene scene = new Scene(borderPane, 300, 300);

        primaryStage.setTitle("Botones cardinales");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
