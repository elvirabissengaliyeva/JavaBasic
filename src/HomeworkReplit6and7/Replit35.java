package HomeworkReplit6and7;


import java.util.Scanner;

public class Replit35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        Boolean loan = scan.nextBoolean();
        if (loan) {
            System.out.println("What is your credit score?");

            int score = scan.nextInt();

            if (score < 600) {
                System.out.println("The eligibility is Not eligible");

            } else if (score >= 600 && score <= 700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (score > 700 && score <= 800) {
                System.out.println("The eligibility is Eligible");
            } else if (score > 800) {
                System.out.println("The eligibility is Definitely eligible");
            }
        } else

            System.out.println("Unknown");

    }
}
