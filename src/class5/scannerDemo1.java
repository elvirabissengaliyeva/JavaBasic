package class5;


import java.util.Scanner;

public class scannerDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();

        /* System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please Enter your weight");
        double weight= scan.nextDouble();

        System.out.println(" your weight is "+weight+" Kgs");

        System.out.println("Are your hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);*/

        System.out.println("Enter your name");
        String name=scan.next();
        System.out.println("Your name is "+name);

        System.out.println("Enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);

        scan.close();


    }

}
