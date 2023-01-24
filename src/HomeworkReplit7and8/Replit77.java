package HomeworkReplit7and8;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Replit77 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter 5 numbers");

        int [] numbers=new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= scan.nextInt();
        }
        for (int i = 4; i >=0 ; i--) {
            System.out.println(numbers[i]);
    }
}}