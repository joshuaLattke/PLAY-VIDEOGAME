package com.example.tareaintegradora3;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

        public class Game extends Application {

            private Stage primaryStage;
            private Scene scene1, scene2, scene3;

            @Override
            public void start(Stage primaryStage) {
                this.primaryStage = primaryStage;

                // Crear los tres escenarios
                createScene1();
                createScene2();
                createScene3();

                // Mostrar el escenario inicial
                primaryStage.setScene(scene1);
                primaryStage.setTitle("Juego con escenarios");
                primaryStage.show();
            }

            private void createScene1() {
                Text scene1Text = new Text("Escenario 1");
                scene1Text.setFont(Font.font(24));
                scene1Text.setFill(Color.WHITE);

                Button scene1Button = new Button("Ir al Escenario 2");
                scene1Button.setOnAction(e -> primaryStage.setScene(scene2));

                VBox scene1Layout = new VBox(20);
                scene1Layout.setAlignment(Pos.CENTER);
                scene1Layout.getChildren().addAll(scene1Text, scene1Button);

                scene1 = new Scene(scene1Layout, 800, 600, Color.BLACK);
            }

            private void createScene2() {
                Text scene2Text = new Text("Escenario 2");
                scene2Text.setFont(Font.font(24));
                scene2Text.setFill(Color.WHITE);

                Button scene2Button = new Button("Ir al Escenario 3");
                scene2Button.setOnAction(e -> primaryStage.setScene(scene3));

                VBox scene2Layout = new VBox(20);
                scene2Layout.setAlignment(Pos.CENTER);
                scene2Layout.getChildren().addAll(scene2Text, scene2Button);

                scene2 = new Scene(scene2Layout, 800, 600, Color.BLUE);
            }

            private void createScene3() {
                Text scene3Text = new Text("Escenario 3");
                scene3Text.setFont(Font.font(24));
                scene3Text.setFill(Color.WHITE);

                Button scene3Button = new Button("Regresar al Escenario 1");
                scene3Button.setOnAction(e -> primaryStage.setScene(scene1));

                VBox scene3Layout = new VBox(20);
                scene3Layout.setAlignment(Pos.CENTER);
                scene3Layout.getChildren().addAll(scene3Text, scene3Button);

                scene3 = new Scene(scene3Layout, 800, 600, Color.GREEN);
            }

            public static void main(String[] args) {
                launch(args);
            }
        }
