package HomeworkReplit7and8;

import java.util.Scanner;

public class replit64 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter End number");
        int userInput=scanner.nextInt();

        for(int i=0;i< userInput*2; i++){
            System.out.print(i+" ");
        }

    }

}

