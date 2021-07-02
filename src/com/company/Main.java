package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
    TASK
     Write a program that outputs numbers from 1 - 50
     and if the number is divisible by 3, replace it by 'Fizz' without outputing the number
     and if the number is divisible by 7, replace it by 'Buzz' without outputing the number
     and if the number is divisible by both 7 and 3 then replace it with 'FizzBuzz'
    */

    //1.step Start a loop
       /* for(int i = 1; i <= 50; i++){
            //2.step start if

               if (i % 3 == 0 && i % 7 == 0) { //FizBuzz case will go first
                    System.out.println("FizzBuzz");
                    continue;
                } else if (i %3 == 0) { //Fizz case
                    System.out.println("Fizz");
                    continue;
                } else if (i % 7 ==0) { //Buzz case
                    System.out.println("Buzz");
                    continue;
                }
            System.out.println(i);
            }
            */

        //collect input
        //solve discriminant
        //find first x
        //find second x
        //output result

        //Get user input from console
        //initialize scanner
        Scanner scanner = new Scanner(System.in);

        //get values of a
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        //get values of b
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        //get values of c
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        //solve for the discriminant -(b^2 -4 * a *c) PEMDAS-
        double discriminant = Math.pow(b, 2) -(4 * a * c);

        //if discriminant is negative then exit the program
        if (discriminant < 0){
            System.out.println("Discriminant is negative");
            return;
        }

        //first value of x
        //(-b + sqrt(discr))/2 *a
        double x1 = (-b + Math.sqrt(discriminant))/ 2 * a;

        // solve for second value of x
        //(-b - sqrt(discr))/2 *a
        double x2 = (-b - Math.sqrt(discriminant))/ 2 * a;

        //output
        System.out.println("The first value of x: " + x1);
        System.out.println("The second value of x: " + x2);
        }
    }

