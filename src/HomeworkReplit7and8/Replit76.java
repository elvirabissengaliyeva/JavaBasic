package HomeworkReplit7and8;

import java.util.Arrays;
import java.util.Scanner;

public class Replit76 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter day of the week");

        String [] day = new String[8];
        day[1]="Sunday";
        day[2]="Monday";
        day[3]="Tuesday";
        day[4]="Wednesday";
        day[5]="Thursday";
        day[6]="Friday";
        day[7]="Saturday";

        for (int i = 0; i < day.length; i++) {
            day[i]= scan.next();

        }

    }
}

