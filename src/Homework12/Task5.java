package Homework12;
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
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Mom’s first name?");
        String momsName = input.next();

        System.out.println("Please Enter Dad’s first name?");
        String dadName = input.next();

        System.out.println("Enter Baby gender: Boy or Girl?");
        String gender = input.next();

        if(gender.equalsIgnoreCase("boy")){
            String firstHalf=dadName.substring(0,dadName.length()/2);
            String secondHalf=momsName.substring(momsName.length()/2);
            System.out.println(firstHalf+secondHalf);
        } else if (gender.equalsIgnoreCase("girl")){
            String firstHalf=momsName.substring(0,momsName.length()/2);
            String secondHalf=dadName.substring(dadName.length()/2);
            System.out.println(firstHalf+secondHalf);

        }
    }}