package com.example.tareaintegradora3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Enemy {
    private Random random = new Random();
    private int minEnemigos = 5;  // Número mínimo de enemigos
    private int maxEnemigos = 15; // Número máximo de enemigos

    private Label enemigosLabel;

    public static void main(String[] args) {
        launchApp(args);
    }

    private static void launchApp(String[] args) {
        Thread appThread = new Thread(() -> Application.launch(GeneradorEnemigosApplication.class, args));
        appThread.start();
    }

    public static class GeneradorEnemigosApplication extends Application {
        @Override
        public void start(Stage primaryStage) {
            Enemy generadorEnemigos = new Enemy();
            generadorEnemigos.start(primaryStage);
        }
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Generador de Enemigos");

        enemigosLabel = new Label("Número de enemigos: ");
        Button generarButton = new Button("Generar Enemigos");
        generarButton.setOnAction(event -> generarNumeroEnemigos());

        VBox root = new VBox(enemigosLabel, generarButton);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(event -> Platform.exit());
        primaryStage.show();
    }

    private void generarNumeroEnemigos() {
        int numeroEnemigos = random.nextInt(maxEnemigos - minEnemigos + 1) + minEnemigos;
        enemigosLabel.setText("Número de enemigos: " + numeroEnemigos);
    }
}
