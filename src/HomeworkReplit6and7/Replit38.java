package HomeworkReplit6and7;

import java.util.Scanner;

public class Replit38 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean subject=input.nextBoolean();
        if(subject!=true){
            System.out.println("Today you will be learning manual testing");
        }else if(subject=true){
            System.out.println("Today you will be learning Java");
        }

    }
}
