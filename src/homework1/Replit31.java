package homework1;

import java.util.Scanner;

public class Replit31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Is it sunny outside?");
        Boolean isSunny = input.nextBoolean();
        if (isSunny){
            System.out.println("It is a sunny day, I should go somewhere!");
        }else
            System.out.println("I stay home and practice Java");

        System.out.println("What is the temperature outside?");
        int temp= input.nextInt();
        if(temp>80) {
            System.out.println("I am going to the beach");
        }else{
            System.out.println("I am going to the park");

        }

    }
}
