package Replit9and10;

import java.util.Scanner;

public class replit95 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please print word");
        String name=scan.next();
        System.out.println("The first 3 letters of "+name+" is "+name.substring(0,3));

    }
}
