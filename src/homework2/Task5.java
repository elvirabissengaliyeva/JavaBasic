package homework2;

public class Task5 {
    public static void main(String[] args) {
        double num1 = 45.5;
        double num2 = 20.5;
        double num3 = 5.5;

        if (num1 < num3 && num2 < num3) {
            System.out.println(num3 + " is greater");
        } else if (num1 < num2 && num2 > num3) {
            System.out.println(num2 + " is greater");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        }
    }
}