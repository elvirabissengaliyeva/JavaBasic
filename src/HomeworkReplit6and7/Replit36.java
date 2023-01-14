package HomeworkReplit6and7;

import java.util.Scanner;

public class Replit36 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two strings");

        String world1 = input.nextLine();
        String world2 = input.nextLine();

        System.out.println("Please enter two numbers");

        int num1= input.nextInt();
        int num2= input.nextInt();

    if(num1==num2 && world1.equalsIgnoreCase(world2)){
        System.out.println("AND");
    }else if(num1==num2 || world1.equalsIgnoreCase(world2)){
            System.out.println("OR");
    }if(num1!=num2 && world1!=world2 ) {
            System.out.println("NONE");

        }

    }
}
