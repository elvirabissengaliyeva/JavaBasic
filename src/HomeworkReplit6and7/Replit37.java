package HomeworkReplit6and7;


import java.util.Scanner;

public class Replit37 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty= scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy= scan.nextBoolean();

        if (thirsty && sleepy) {
            System.out.println("Drink coffee");

        }
        else if (thirsty && !sleepy) {
            System.out.println("Drink water");
        }
        else if (!thirsty && sleepy) {
            System.out.println("Drink tea");
        }
        else {
            System.out.println("nothing");

    }
}}