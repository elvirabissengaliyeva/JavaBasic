package homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write a day");
        int day = input.nextInt();
        int day1 = 5;
        int day2 = 7;

        if (day < day1){
        System.out.println("It is a weekday");
    }
        if (day > day1 && day < day2){
       System.out.println("It is a weekend");

    }else if(day>day2){
            System.out.println("Invalid day");
        }


    }
}

