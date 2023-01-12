package homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your country");
        String country= input.next();
        switch (country) {
            case "USA":
                System.out.println("You speak English");
                break;
            case "China":
                System.out.println("You speak Chinese");
                break;
            case "Japan":
                System.out.println("You speak Japanese");
                break;
        }
        System.out.println("Enter your grade");
        String grade= input.next();
        switch (grade){
            case "A":
                System.out.println("A-Excellent");
                break;
            case "B":
                System.out.println("B-Good");
                break;
            case "C":
                System.out.println("C-Average");
                break;
            case "D":
                System.out.println("D-Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }

    }
}
