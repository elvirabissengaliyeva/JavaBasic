package class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the day");
        String day=scan.next();


        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class today");
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java Class Enjoy");
        }else if(day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")){

        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("Wrong day entered");
        }

    }
}
