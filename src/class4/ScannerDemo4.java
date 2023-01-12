package class4;

import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age= input.nextInt();
        System.out.println("Your are "+ age+ " years old");
    }
}
