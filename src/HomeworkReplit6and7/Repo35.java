package HomeworkReplit6and7;


import java.util.Scanner;

public class Repo35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you need a loan?");
        Boolean loan = input.nextBoolean();

        if (loan) {

            System.out.println("What is your credit score?");
            int score = input.nextInt();

            if (score < 600) {
                System.out.println("The eligibility is Not eligible");

            } else if ((score >= 600) && (score <= 700)) {
                System.out.println("The eligibility is Maybe eligible");
            } else if ((score >= 701) && (score <= 800)) {
                System.out.println("The eligibility is Eligible");

            } else if (score > 800) {
                System.out.println("The eligibility is Definitely eligible");
            }


        }else
            System.out.println("Unknown");
    }
}
