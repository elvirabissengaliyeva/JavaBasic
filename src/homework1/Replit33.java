package homework1;

import java.util.Scanner;

public class Replit33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Value is Even");
            if (number > 1000) {

                System.out.println("Even value is large");

            } else {
                System.out.println("Even value is just right");

            }
        }else {
            if(number % 2 !=0){
                System.out.println("Value is odd");
                if(number > 1000){
                    System.out.println("Odd number is large");
                }else{
                    System.out.println("Odd number is just right");
                }
            }

        }


    }}



