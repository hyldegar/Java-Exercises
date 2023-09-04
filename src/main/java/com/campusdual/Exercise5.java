package com.campusdual;

public class Exercise5 {

    //comprobar si un número es positivo
    //Comprobar si un número es múltiplo de otro
    //Comprobar que un número es menor a otro

    public static void main(String[] args) {


        positive(6);
        multiple(6,3);
        thelargest(7,5);
    }

    public static void positive( int number){

        if (number>=0){
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }
    }

    public static void multiple(int number1, int number2 ){
        if (number1 % number2 == 0 ){
            System.out.println("The number " + number1 + " is multiple of "+ number2);
        }
        else{
            System.out.println("no multiple");
        }
    }
    public static void thelargest(int number1, int number2){
        if(number1>number2){
            System.out.println("The largest number is: "+ number1);
        }
        else if(number1==number2){
            System.out.println("the numbers are equal");
        }else{
            System.out.println("The largest number is: "+ number2);
        }
    }
}
