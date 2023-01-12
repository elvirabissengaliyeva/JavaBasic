package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Gender M/F");
        char gender=scan.next().charAt(0);

        switch (gender){
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");




       }

        

        }

    }

