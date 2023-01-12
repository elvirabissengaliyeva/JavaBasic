package homework1;

import java.util.Scanner;

public class Replit29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1= input.nextInt();
        System.out.println("Please enter second number");
        int num2= input.nextInt();
        boolean positive=true;
        boolean negative=false;
        if(num1*num2>0) {
            System.out.println(positive);
        }else
            System.out.println(negative);

        }
    }

