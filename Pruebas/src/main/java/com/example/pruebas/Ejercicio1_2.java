//Activitat 1.2. Crea un layout que continga un grup de cercles formant un triangle.

package com.example.pruebas;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;

public class Ejercicio1_2 extends Application {
    @Override
    public void start(Stage cercles) throws IOException{
        try {
            cercles.setTitle("Practica1.1: Escacs");

            //Fila8
            Circle rectangle1= circuloColor(25,375);
            Circle rectangle2= circuloColor(75,375);
            Circle rectangle3= circuloColor(125,375);
            Circle rectangle4= circuloColor(175,375);
            Circle rectangle5= circuloColor(225,375);
            Circle rectangle6= circuloColor(275,375);
            Circle rectangle7= circuloColor(325,375);
            Circle rectangle8= circuloColor(375,375);
            //Fila7
            Circle rectangle9= circuloColor(50,325);
            Circle rectangle10= circuloColor(100,325);
            Circle rectangle11= circuloColor(150,325);
            Circle rectangle12= circuloColor(200,325);
            Circle rectangle13= circuloColor(250,325);
            Circle rectangle14= circuloColor(300,325);
            Circle rectangle15= circuloColor(350,325);

            //Fila6
            Circle rectangle16= circuloColor(75,275);
            Circle rectangle17= circuloColor(125,275);
            Circle rectangle18= circuloColor(175,275);
            Circle rectangle19= circuloColor(225,275);
            Circle rectangle20= circuloColor(275,275);
            Circle rectangle21= circuloColor(325,275);

            //Fila5
            Circle rectangle22= circuloColor(100,225);
            Circle rectangle23= circuloColor(150,225);
            Circle rectangle24= circuloColor(200,225);
            Circle rectangle25= circuloColor(250,225);
            Circle rectangle26= circuloColor(300,225);

            //Fila4
            Circle rectangle27= circuloColor(125,175);
            Circle rectangle28= circuloColor(175,175);
            Circle rectangle29= circuloColor(225,175);
            Circle rectangle30= circuloColor(275,175);

            //Fila3
            Circle rectangle31= circuloColor(150,125);
            Circle rectangle32= circuloColor(200,125);
            Circle rectangle33= circuloColor(250,125);

            //Fila2
            Circle rectangle34= circuloColor(175,75);
            Circle rectangle35= circuloColor(225,75);

            //Fila1
            Circle rectangle36= circuloColor(200,25);


            Group root = new Group(rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8,rectangle9,rectangle10,rectangle11,rectangle12,rectangle13,rectangle14,rectangle15,rectangle16,rectangle17,rectangle18,rectangle19,rectangle20,rectangle21,rectangle22,rectangle23,rectangle24,rectangle25,rectangle26,rectangle27,rectangle28,rectangle29,rectangle30,rectangle31,rectangle32,rectangle33,rectangle34,rectangle35,rectangle36);
            Scene theScene = new Scene(root,425,425);
            cercles.setScene(theScene);
            cercles.show();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private Circle circuloColor(int X, int Y) {
        Circle circulo = new Circle(25);
        circulo.setCenterX(X);
        circulo.setCenterY(Y);
        circulo.setFill(Color.BLUE);
        return circulo;
    }

    public static void main(String[] args) {launch();}
}