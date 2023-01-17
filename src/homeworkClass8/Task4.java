package homeworkClass8;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Write a program to ask a user to enter item they want to buy and the price of that item. User will
be entering 5 items. Every time user enters price accumulate the price and tell the user how much
totalPrice that they should pay.
If user give more money program should return a change. Whenever a user done with payments program
should say "Thank you for shopping!"
*/
public class Task4 {
    public static void main(String[] args) {

        double totalPrice=0;
        for (int i = 0; i <3 ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Please Enter item ant its price");
            String name= scanner.next();
            double price= scanner.nextDouble();
            totalPrice+=price;
            System.out.println("This is the total amount that you have to pay " + totalPrice);
        }
        System.out.println("Please pay for the items");

    }
}
