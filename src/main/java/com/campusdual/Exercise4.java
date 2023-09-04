package com.campusdual;

public class Exercise4 {





    public static void main(String[] args) {


        // Suma de los 5 primeros números
        System.out.println("The sum of first 5 numbers is: "+sum5(sum5(sum5(sum5(1)))));


        // Suma de los 20 primeros números pares
        int n=20;
        int sumPair= n*(n+1);
        System.out.println("The sum of " + n + "number pairs is: " + sumPair);

    }

    public static int sum5( int number){
        return number+1;
    };


}




