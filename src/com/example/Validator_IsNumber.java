package com.example;

import java.util.Scanner;

public class Validator_IsNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        /*Through the while loop*/
//        System.out.println("Enter number:");
//        while(!number.hasNextInt()){
//            System.out.println("Its not a number. Enter number please:");
//            number.next();
//            if(number.hasNextInt()){
//                int num = number.nextInt();
//                System.out.println("Your number = "+num);
//                return;
//
//            }
//
//        }
        /*Through the Do While loop*/
//        boolean repeatLoop = false;
//        do{
//            if(repeatLoop){
//                System.out.println("Its not a number.Please input number:");
//                repeatLoop = false;
//
//            }
//            System.out.println("Enter number:");
//            if(!number.hasNextInt()){
//                repeatLoop = true;
//                number.next();
//            } else {
//                int num = number.nextInt();
//                System.out.println("You number = "+num);
//            }
//        }while(repeatLoop);


        /*Through the For loop*/
//        for (int i = 0; i <= 1; i++) {
//            System.out.println("Enter number:");
//            if (!number.hasNextInt()) {
//                System.out.println("Ints not a number");
//                number.next();
//                i--;
//            } else if (number.hasNextInt()) {
//                int num = number.nextInt();
//                System.out.println("Yor number = " + num);
//                return;
//
//            }
//
//        }

    }


}

