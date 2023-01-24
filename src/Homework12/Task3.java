package Homework12;

import java.util.Scanner;

/*
3) Write a program that reads two people's first names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please Enter Mom’s first name?");
        String MomsName= input.next();
        System.out.println("Please Enter Dad’s first name?");
        String dadName= input.next();
        System.out.println("Enter Baby gender: Boy or Girl?");
        String gender= input.next();
        if(gender != "Boy"){
            System.out.println("Suggested baby name: DANRY");
        }else {
            System.out.println("Suggested baby name: MAIEL");
        }

    }
}
