package homework2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number = input.nextInt();
        int number2= input.nextInt();
        System.out.println("Enter one operator (+,-,*,/)");
        String operator=input.next();

        switch (operator){
            case "+":
                System.out.println(number+number2);
                break;
            case "-":
                System.out.println(number-number2);
                break;
            case "*":
                System.out.println(number*number2);
                break;
            case "/":
                System.out.println(number/number2);
                break;
        }
    }
}
