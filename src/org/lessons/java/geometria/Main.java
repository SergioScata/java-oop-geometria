package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci l'altezza del rettangolo: ");
        int userHeight = scan.nextInt();
        System.out.println("Inserisci la lunghezza del rettangolo: ");
        int userWidth = scan.nextInt();

        Rettangolo rettangolo = new Rettangolo(userHeight, userWidth);


        System.out.println("Il perimetro del rettangolo è: " + rettangolo.rectanglePerimeter() );
        System.out.println("L'area del rettangolo è: " + rettangolo.rectangleArea());

        scan.close();
    }
}
