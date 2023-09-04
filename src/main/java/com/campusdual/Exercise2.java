package com.campusdual;

public class Exercise2 {
    public static void main(String[] args) {
        /* dado un radio 15 calcula area del círculo y longiud de la circunferencia*/
        int radio= 15 ;

        // Area
        double a = Math.PI * Math.pow(radio, 2);

        // Longitud Circunferencia
        double l = 2 * Math.PI * radio;

        System.out.println("Área del círculo: " + a + "\n" +"Longitud de la circunferencia: " + l );

    }
}
