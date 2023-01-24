package HomeworkClass10;

import java.util.Arrays;
import java.util.Scanner;

/*Using Scanner create an array of countries. When an array is created,
retrieve all values from it and while retrieving those values print capital for each country.
(use 2 different loops).*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 2 countries");
        String[] countries = new String[2];


        for (int i = 0; i < countries.length; i++) {
            countries[i] = scan.next();
        }
            System.out.println(Arrays.toString(countries).toUpperCase());

    System.out.println("*********************************");

        for (String country : countries) {
            System.out.println(country);

    }

}}