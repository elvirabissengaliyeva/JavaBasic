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

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Mom’s first name?");
        String MomsName = input.next();
        System.out.println("Please Enter Dad’s first name?");
        String dadName = input.next();
        System.out.println("Enter Baby gender: Boy or Girl?");
        boolean boy = input.hasNext("boy");
        boolean girl = input.hasNext("girl");

        String babiesName;
        if (boy){
            babiesName =(dadName.substring(0,3).concat(MomsName.substring(MomsName.length()-2)));
            System.out.println(babiesName.toUpperCase());
        }else if(girl){
            babiesName =(MomsName.substring(0,2).concat(dadName.substring(dadName.length()-3)));
            System.out.println(babiesName.toUpperCase());
        }

    }}