package HomeworkClass10;


import java.util.Arrays;
import java.util.Scanner;

/*Using Scanner create an array of integer values.
After the array is created, calculate the sum of all stored elements in that array.*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter 5 numbers");

        int[] numbers=new int[5];

        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = scan.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
            System.out.println(sum);
        }

    }

