//Jordi Vañó Enrique - 2DAM B

package com.example.ejercicio12jve;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PrintStream;

public class Ejercicio12 extends Application implements EventHandler<MouseEvent> {
    private Text texto = new Text();

    public Ejercicio12() {
    }
//Como creé todos los rectangulos del ejercicio1.1, no les he cambiado el nombre a los círculos porque al fin y al cabo es lo mismo, nombrar un objeto.
    public void start(Stage cercles) throws IOException {
        try {
            cercles.setTitle("Practica1.2: Circulos");
            Circle rectangle1 = this.circuloColor(25, 375);
            Circle rectangle2 = this.circuloColor(75, 375);
            Circle rectangle3 = this.circuloColor(125, 375);
            Circle rectangle4 = this.circuloColor(175, 375);
            Circle rectangle5 = this.circuloColor(225, 375);
            Circle rectangle6 = this.circuloColor(275, 375);
            Circle rectangle7 = this.circuloColor(325, 375);
            Circle rectangle8 = this.circuloColor(375, 375);
            Circle rectangle9 = this.circuloColor(50, 325);
            Circle rectangle10 = this.circuloColor(100, 325);
            Circle rectangle11 = this.circuloColor(150, 325);
            Circle rectangle12 = this.circuloColor(200, 325);
            Circle rectangle13 = this.circuloColor(250, 325);
            Circle rectangle14 = this.circuloColor(300, 325);
            Circle rectangle15 = this.circuloColor(350, 325);
            Circle rectangle16 = this.circuloColor(75, 275);
            Circle rectangle17 = this.circuloColor(125, 275);
            Circle rectangle18 = this.circuloColor(175, 275);
            Circle rectangle19 = this.circuloColor(225, 275);
            Circle rectangle20 = this.circuloColor(275, 275);
            Circle rectangle21 = this.circuloColor(325, 275);
            Circle rectangle22 = this.circuloColor(100, 225);
            Circle rectangle23 = this.circuloColor(150, 225);
            Circle rectangle24 = this.circuloColor(200, 225);
            Circle rectangle25 = this.circuloColor(250, 225);
            Circle rectangle26 = this.circuloColor(300, 225);
            Circle rectangle27 = this.circuloColor(125, 175);
            Circle rectangle28 = this.circuloColor(175, 175);
            Circle rectangle29 = this.circuloColor(225, 175);
            Circle rectangle30 = this.circuloColor(275, 175);
            Circle rectangle31 = this.circuloColor(150, 125);
            Circle rectangle32 = this.circuloColor(200, 125);
            Circle rectangle33 = this.circuloColor(250, 125);
            Circle rectangle34 = this.circuloColor(175, 75);
            Circle rectangle35 = this.circuloColor(225, 75);
            Circle rectangle36 = this.circuloColor(200, 25);
            this.texto.setX(0.0D);
            this.texto.setY(430.0D);
            Group root = new Group(new Node[]{this.texto, rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6, rectangle7, rectangle8, rectangle9, rectangle10, rectangle11, rectangle12, rectangle13, rectangle14, rectangle15, rectangle16, rectangle17, rectangle18, rectangle19, rectangle20, rectangle21, rectangle22, rectangle23, rectangle24, rectangle25, rectangle26, rectangle27, rectangle28, rectangle29, rectangle30, rectangle31, rectangle32, rectangle33, rectangle34, rectangle35, rectangle36});
            Scene theScene = new Scene(root, 435.0D, 435.0D);
            cercles.setScene(theScene);
            cercles.show();
        } catch (Exception var40) {
            System.out.println(var40.getMessage());
        }

    }

    private Circle circuloColor(double X, double Y) {
        Circle circulo = new Circle(20.0D);
        circulo.setStyle("-fx-stroke-width:3;-fx-stroke: red;");
        circulo.setCenterX(X);
        circulo.setCenterY(Y);
        circulo.setFill(Color.BLUE);
        circulo.setOnMouseClicked(this);
        return circulo;
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }

    public void handle(MouseEvent mouseEvent) {
        Circle circulo = (Circle)mouseEvent.getSource();
        Text var10000;
        int var10001;
        PrintStream var3;
        if ((int)(circulo.getCenterY() / 50.0D) + 1 != 7 && (int)(circulo.getCenterY() / 50.0D) + 1 != 6) {
            if ((int)(circulo.getCenterY() / 50.0D) + 1 != 4 && (int)(circulo.getCenterY() / 50.0D) + 1 != 5) {
                if ((int)(circulo.getCenterY() / 50.0D) + 1 != 2 && (int)(circulo.getCenterY() / 50.0D) + 1 != 3) {
                    if ((int)(circulo.getCenterY() / 50.0D) + 1 == 1) {
                        var10000 = this.texto;
                        var10001 = (int)(circulo.getCenterX() / 50.0D - 3.0D);
                        var10000.setText("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
                        var3 = System.out;
                        var10001 = (int)(circulo.getCenterX() / 50.0D - 3.0D);
                        var3.println("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
                    } else {
                        var10000 = this.texto;
                        var10001 = (int)(circulo.getCenterX() / 50.0D + 1.0D);
                        var10000.setText("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
                        var3 = System.out;
                        var10001 = (int)(circulo.getCenterX() / 50.0D + 1.0D);
                        var3.println("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
                    }
                } else {
                    var10000 = this.texto;
                    var10001 = (int)(circulo.getCenterX() / 50.0D - 2.0D);
                    var10000.setText("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
                    var3 = System.out;
                    var10001 = (int)(circulo.getCenterX() / 50.0D - 2.0D);
                    var3.println("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
                }
            } else {
                var10000 = this.texto;
                var10001 = (int)(circulo.getCenterX() / 50.0D - 1.0D);
                var10000.setText("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
                var3 = System.out;
                var10001 = (int)(circulo.getCenterX() / 50.0D - 1.0D);
                var3.println("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
            }
        } else {
            var10000 = this.texto;
            var10001 = (int)(circulo.getCenterX() / 50.0D);
            var10000.setText("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
            var3 = System.out;
            var10001 = (int)(circulo.getCenterX() / 50.0D);
            var3.println("He pulsado en el círculo de la columna " + var10001 + " y de la fila " + (int)(circulo.getCenterY() / 50.0D + 1.0D) + ".");
        }

    }
}
