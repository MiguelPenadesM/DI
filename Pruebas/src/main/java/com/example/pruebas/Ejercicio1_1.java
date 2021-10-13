//Activitat 1.1. Crea un tauler d’escacs com el que es mostra en la pantalla.
//Tens més informació sobre l’activitat en el moodle.
//Amb el que s'ha vist fins al moment en classe, has de crear una aplicació que ens dibuixe un tauler d'escacs.
//Per aquesta tasca l'únic que necessitem és saber crear una escena i afegir-li rectangles.
//Pots ajudar-te de l'exemple que s'ha vist en les transparències.
//Les característiques que ha de tenir cada rectangle és:
//La grandària dels quadrats ha de ser de 50.
//Pots triar el color que vulgues.
//Pots veure un exemple a continuació:

package com.example.pruebas;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Ejercicio1_1 extends Application implements EventHandler<javafx.scene.input.MouseEvent> {
    @Override
    public void start(Stage escacs) throws IOException{
        try {
            escacs.setTitle("Practica1.1: Escacs");

            //Columna1
            Rectangle rectangle1= rectanguloColor1(0,0);
            Rectangle rectangle2= rectanguloColor2(0,50);
            Rectangle rectangle3= rectanguloColor1(0,100);
            Rectangle rectangle4= rectanguloColor2(0,150);
            Rectangle rectangle5= rectanguloColor1(0,200);
            Rectangle rectangle6= rectanguloColor2(0,250);
            Rectangle rectangle7= rectanguloColor1(0,300);
            Rectangle rectangle8= rectanguloColor2(0,350);
            //Columna3
            Rectangle rectangle9= rectanguloColor1(100,0);
            Rectangle rectangle10= rectanguloColor2(100,50);
            Rectangle rectangle11= rectanguloColor1(100,100);
            Rectangle rectangle12= rectanguloColor2(100,150);
            Rectangle rectangle13= rectanguloColor1(100,200);
            Rectangle rectangle14= rectanguloColor2(100,250);
            Rectangle rectangle15= rectanguloColor1(100,300);
            Rectangle rectangle16= rectanguloColor2(100,350);
            //Columna5
            Rectangle rectangle17= rectanguloColor1(200,0);
            Rectangle rectangle18= rectanguloColor2(200,50);
            Rectangle rectangle19= rectanguloColor1(200,100);
            Rectangle rectangle20= rectanguloColor2(200,150);
            Rectangle rectangle21= rectanguloColor1(200,200);
            Rectangle rectangle22= rectanguloColor2(200,250);
            Rectangle rectangle23= rectanguloColor1(200,300);
            Rectangle rectangle24= rectanguloColor2(200,350);
            //Columna7
            Rectangle rectangle25= rectanguloColor1(300,0);
            Rectangle rectangle26= rectanguloColor2(300,50);
            Rectangle rectangle27= rectanguloColor1(300,100);
            Rectangle rectangle28= rectanguloColor2(300,150);
            Rectangle rectangle29= rectanguloColor1(300,200);
            Rectangle rectangle30= rectanguloColor2(300,250);
            Rectangle rectangle31= rectanguloColor1(300,300);
            Rectangle rectangle32= rectanguloColor2(300,350);
            //Columna2
            Rectangle rectangle33= rectanguloColor2(50,0);
            Rectangle rectangle34= rectanguloColor1(50,50);
            Rectangle rectangle35= rectanguloColor2(50,100);
            Rectangle rectangle36= rectanguloColor1(50,150);
            Rectangle rectangle37= rectanguloColor2(50,200);
            Rectangle rectangle38= rectanguloColor1(50,250);
            Rectangle rectangle39= rectanguloColor2(50,300);
            Rectangle rectangle40= rectanguloColor1(50,350);
            //Columna4
            Rectangle rectangle41= rectanguloColor2(150,0);
            Rectangle rectangle42= rectanguloColor1(150,50);
            Rectangle rectangle43= rectanguloColor2(150,100);
            Rectangle rectangle44= rectanguloColor1(150,150);
            Rectangle rectangle45= rectanguloColor2(150,200);
            Rectangle rectangle46= rectanguloColor1(150,250);
            Rectangle rectangle47= rectanguloColor2(150,300);
            Rectangle rectangle48= rectanguloColor1(150,350);
            //Columna6
            Rectangle rectangle49= rectanguloColor2(250,0);
            Rectangle rectangle50= rectanguloColor1(250,50);
            Rectangle rectangle51= rectanguloColor2(250,100);
            Rectangle rectangle52= rectanguloColor1(250,150);
            Rectangle rectangle53= rectanguloColor2(250,200);
            Rectangle rectangle54= rectanguloColor1(250,250);
            Rectangle rectangle55= rectanguloColor2(250,300);
            Rectangle rectangle56= rectanguloColor1(250,350);
            //Columna8
            Rectangle rectangle57= rectanguloColor2(350,0);
            Rectangle rectangle58= rectanguloColor1(350,50);
            Rectangle rectangle59= rectanguloColor2(350,100);
            Rectangle rectangle60= rectanguloColor1(350,150);
            Rectangle rectangle61= rectanguloColor2(350,200);
            Rectangle rectangle62= rectanguloColor1(350,250);
            Rectangle rectangle63= rectanguloColor2(350,300);
            Rectangle rectangle64= rectanguloColor1(350,350);

            Group root = new Group(rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8,rectangle9,rectangle10,rectangle11,rectangle12,rectangle13,rectangle14,rectangle15,rectangle16,rectangle17,rectangle18,rectangle19,rectangle20,rectangle21,rectangle22,rectangle23,rectangle24,rectangle25,rectangle26,rectangle27,rectangle28,rectangle29,rectangle30,rectangle31,rectangle32,rectangle33,rectangle34,rectangle35,rectangle36,rectangle37,rectangle38,rectangle39,rectangle40,rectangle41,rectangle42,rectangle43,rectangle44,rectangle45,rectangle46,rectangle47,rectangle48,rectangle49,rectangle50,rectangle51,rectangle52,rectangle53,rectangle54,rectangle55,rectangle56,rectangle57,rectangle58,rectangle59,rectangle60,rectangle61,rectangle62,rectangle63,rectangle64);
            Scene theScene = new Scene(root,400,400);
            escacs.setScene(theScene);
            escacs.show();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private Rectangle rectanguloColor1(int X, int Y) {
        Rectangle rectangle = new Rectangle(50,50);
        rectangle.setX(X);
        rectangle.setY(Y);
        rectangle.setFill(Color.BLACK);
        rectangle.setOnMouseClicked(this);
        return rectangle;
    }

    private Rectangle rectanguloColor2(int X, int Y) {
        Rectangle rectangle = new Rectangle(50,50);
        rectangle.setX(X);
        rectangle.setY(Y);
        rectangle.setFill(Color.WHITE);
        rectangle.setOnMouseClicked(this);
        return rectangle;
    }

    public static void main(String[] args) {launch();}

    @Override
    public void handle(javafx.scene.input.MouseEvent mouseEvent) {
        Rectangle rectangle= (Rectangle) mouseEvent.getSource();
        System.out.println("He pulsado en el rectángulo de la columna "+(int)((rectangle.getX()/50)+1)+" y de la fila "+(int)((rectangle.getY()/50)+1)+".");
    }
}