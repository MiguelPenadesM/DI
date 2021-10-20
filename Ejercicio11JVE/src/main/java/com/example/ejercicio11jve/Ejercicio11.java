//Jordi Vañó Enrique - 2DAM B

package com.example.ejercicio11jve;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PrintStream;

public class Ejercicio11 extends Application implements EventHandler<MouseEvent> {
    private Text texto = new Text();

    public Ejercicio11() {
    }

    public void start(Stage escacs) throws IOException {
        try {
            escacs.setTitle("Practica1.1: Escacs");
            Rectangle rectangle1 = this.rectanguloColor1(0, 0);
            Rectangle rectangle2 = this.rectanguloColor2(0, 50);
            Rectangle rectangle3 = this.rectanguloColor1(0, 100);
            Rectangle rectangle4 = this.rectanguloColor2(0, 150);
            Rectangle rectangle5 = this.rectanguloColor1(0, 200);
            Rectangle rectangle6 = this.rectanguloColor2(0, 250);
            Rectangle rectangle7 = this.rectanguloColor1(0, 300);
            Rectangle rectangle8 = this.rectanguloColor2(0, 350);
            Rectangle rectangle9 = this.rectanguloColor1(100, 0);
            Rectangle rectangle10 = this.rectanguloColor2(100, 50);
            Rectangle rectangle11 = this.rectanguloColor1(100, 100);
            Rectangle rectangle12 = this.rectanguloColor2(100, 150);
            Rectangle rectangle13 = this.rectanguloColor1(100, 200);
            Rectangle rectangle14 = this.rectanguloColor2(100, 250);
            Rectangle rectangle15 = this.rectanguloColor1(100, 300);
            Rectangle rectangle16 = this.rectanguloColor2(100, 350);
            Rectangle rectangle17 = this.rectanguloColor1(200, 0);
            Rectangle rectangle18 = this.rectanguloColor2(200, 50);
            Rectangle rectangle19 = this.rectanguloColor1(200, 100);
            Rectangle rectangle20 = this.rectanguloColor2(200, 150);
            Rectangle rectangle21 = this.rectanguloColor1(200, 200);
            Rectangle rectangle22 = this.rectanguloColor2(200, 250);
            Rectangle rectangle23 = this.rectanguloColor1(200, 300);
            Rectangle rectangle24 = this.rectanguloColor2(200, 350);
            Rectangle rectangle25 = this.rectanguloColor1(300, 0);
            Rectangle rectangle26 = this.rectanguloColor2(300, 50);
            Rectangle rectangle27 = this.rectanguloColor1(300, 100);
            Rectangle rectangle28 = this.rectanguloColor2(300, 150);
            Rectangle rectangle29 = this.rectanguloColor1(300, 200);
            Rectangle rectangle30 = this.rectanguloColor2(300, 250);
            Rectangle rectangle31 = this.rectanguloColor1(300, 300);
            Rectangle rectangle32 = this.rectanguloColor2(300, 350);
            Rectangle rectangle33 = this.rectanguloColor2(50, 0);
            Rectangle rectangle34 = this.rectanguloColor1(50, 50);
            Rectangle rectangle35 = this.rectanguloColor2(50, 100);
            Rectangle rectangle36 = this.rectanguloColor1(50, 150);
            Rectangle rectangle37 = this.rectanguloColor2(50, 200);
            Rectangle rectangle38 = this.rectanguloColor1(50, 250);
            Rectangle rectangle39 = this.rectanguloColor2(50, 300);
            Rectangle rectangle40 = this.rectanguloColor1(50, 350);
            Rectangle rectangle41 = this.rectanguloColor2(150, 0);
            Rectangle rectangle42 = this.rectanguloColor1(150, 50);
            Rectangle rectangle43 = this.rectanguloColor2(150, 100);
            Rectangle rectangle44 = this.rectanguloColor1(150, 150);
            Rectangle rectangle45 = this.rectanguloColor2(150, 200);
            Rectangle rectangle46 = this.rectanguloColor1(150, 250);
            Rectangle rectangle47 = this.rectanguloColor2(150, 300);
            Rectangle rectangle48 = this.rectanguloColor1(150, 350);
            Rectangle rectangle49 = this.rectanguloColor2(250, 0);
            Rectangle rectangle50 = this.rectanguloColor1(250, 50);
            Rectangle rectangle51 = this.rectanguloColor2(250, 100);
            Rectangle rectangle52 = this.rectanguloColor1(250, 150);
            Rectangle rectangle53 = this.rectanguloColor2(250, 200);
            Rectangle rectangle54 = this.rectanguloColor1(250, 250);
            Rectangle rectangle55 = this.rectanguloColor2(250, 300);
            Rectangle rectangle56 = this.rectanguloColor1(250, 350);
            Rectangle rectangle57 = this.rectanguloColor2(350, 0);
            Rectangle rectangle58 = this.rectanguloColor1(350, 50);
            Rectangle rectangle59 = this.rectanguloColor2(350, 100);
            Rectangle rectangle60 = this.rectanguloColor1(350, 150);
            Rectangle rectangle61 = this.rectanguloColor2(350, 200);
            Rectangle rectangle62 = this.rectanguloColor1(350, 250);
            Rectangle rectangle63 = this.rectanguloColor2(350, 300);
            Rectangle rectangle64 = this.rectanguloColor1(350, 350);
            this.texto.setX(0.0D);
            this.texto.setY(415.0D);
            Group root = new Group(new Node[]{this.texto, rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6, rectangle7, rectangle8, rectangle9, rectangle10, rectangle11, rectangle12, rectangle13, rectangle14, rectangle15, rectangle16, rectangle17, rectangle18, rectangle19, rectangle20, rectangle21, rectangle22, rectangle23, rectangle24, rectangle25, rectangle26, rectangle27, rectangle28, rectangle29, rectangle30, rectangle31, rectangle32, rectangle33, rectangle34, rectangle35, rectangle36, rectangle37, rectangle38, rectangle39, rectangle40, rectangle41, rectangle42, rectangle43, rectangle44, rectangle45, rectangle46, rectangle47, rectangle48, rectangle49, rectangle50, rectangle51, rectangle52, rectangle53, rectangle54, rectangle55, rectangle56, rectangle57, rectangle58, rectangle59, rectangle60, rectangle61, rectangle62, rectangle63, rectangle64});
            Scene theScene = new Scene(root, 400.0D, 420.0D);
            escacs.setScene(theScene);
            escacs.show();
        } catch (Exception var68) {
            System.out.println(var68.getMessage());
        }

    }

    private Rectangle rectanguloColor1(int X, int Y) {
        Rectangle rectangle = new Rectangle(50.0D, 50.0D);
        rectangle.setX((double)X);
        rectangle.setY((double)Y);
        rectangle.setFill(Color.BLACK);
        rectangle.setOnMouseClicked(this);
        return rectangle;
    }

    private Rectangle rectanguloColor2(int X, int Y) {
        Rectangle rectangle = new Rectangle(50.0D, 50.0D);
        rectangle.setX((double)X);
        rectangle.setY((double)Y);
        rectangle.setFill(Color.WHITE);
        rectangle.setOnMouseClicked(this);
        return rectangle;
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }

    public void handle(MouseEvent mouseEvent) {
        Rectangle rectangle = (Rectangle)mouseEvent.getSource();
        Text var10000 = this.texto;
        int var10001 = (int)(rectangle.getX() / 50.0D + 1.0D);
        var10000.setText("He pulsado en el rectángulo de la columna " + var10001 + " y de la fila " + (int)(rectangle.getY() / 50.0D + 1.0D) + ".");
        PrintStream var3 = System.out;
        var10001 = (int)(rectangle.getX() / 50.0D + 1.0D);
        var3.println("He pulsado en el rectángulo de la columna " + var10001 + " y de la fila " + (int)(rectangle.getY() / 50.0D + 1.0D) + ".");
    }
}
