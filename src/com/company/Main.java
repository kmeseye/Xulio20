package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la longitud: ");
        double longitud = leer.nextDouble();
        leer.nextLine();
        System.out.println("Introduce el ancho de la superficie: ");
        double ancho = leer.nextDouble();
        leer.nextLine();
        double baldosa = calcularBaldosa(longitud, ancho);
        System.out.println("La longitud de la baldosa" + baldosa);
        double numeroBaldosa=calcularNumeroBaldosa(longitud,ancho,baldosa);
        System.out.println("El numero de baldosas es: "+numeroBaldosa);

    }

    private static double calcularNumeroBaldosa(double longitud, double ancho, double baldosa) {

        return (longitud/baldosa)+(ancho/baldosa);
    }

    private static double calcularBaldosa(double longitud, double ancho) {
        if (longitud == ancho) return longitud;
        if (longitud > ancho) return calcularBaldosa(longitud - ancho, ancho);
        else
            return calcularBaldosa(longitud, ancho - longitud);
    }



}

