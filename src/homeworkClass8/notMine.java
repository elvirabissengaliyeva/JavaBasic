package homeworkClass8;

import java.util.Scanner;

public class notMine {
    public static void main(String[] args) {
        Scanner board=new Scanner(System.in);
        String yes;
        for(int  i=0; i < 10; i++){
            do {
                System.out.println("Would you like to apply for a credit card now?");
                yes = board.next();
            }while(!yes.equalsIgnoreCase(yes));

        }
    }
}

