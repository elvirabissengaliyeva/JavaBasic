package HomeworkReplit7and8;

import java.util.Arrays;
import java.util.Scanner;

public class Replit78 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 5 numbers");

        int [] numbers=new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= scan.nextInt();
            System.out.println(numbers[i]*10);
        }
    }
}


