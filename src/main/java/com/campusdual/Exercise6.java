package com.campusdual;

public class Exercise6 {


    //Muestra los 15 primeros números naturales
    //Suma los primeros 100 números


    public static void main(String[] args) {

        int n2= 100;
        viewNums(15);
        System.out.println("La suma de los: "+ n2 + "primeros números es:  " + sumNums(100));
    }

    public static void viewNums(int n){
        for (int i=1 ; i<=15 ; i++ ){

            System.out.println("\b" + i);
        }
    }
    public static int sumNums(int n2){
        int sum=0;
        for (int i=0; i<=n2 ; i++){

            sum+=i;
        }
        return sum;
    };
}
