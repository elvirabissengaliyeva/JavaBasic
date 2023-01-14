package HomeworkReplit6and7;

import java.util.Scanner;

public class Replit44 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String car=scan.next();

        switch (car){
            case "BMW":
                System.out.println("german car");
                break;
            case "Toyota":
                System.out.println("japanese car");
                break;
            case "Maserati":
                System.out.println("italian car");
                break;

            default:
                System.out.println("unknown");

            }
        }
    }

