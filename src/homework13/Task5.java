package homework13;

import java.util.Scanner;

/*5) How would you check if String is palindrome or not? aba=> true
Abbc =>false*/
public class Task5 {
    public static void main(String[] args) {

                String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
              str = sc.nextLine();

              int length = str.length();

              for ( int i = length - 1; i >= 0; i-- )
              rev = rev + str.charAt(i);

              if (str.equals(rev))
              System.out.println(str+" is a palindrome");
              else
              System.out.println(str+" is not a palindrome");

              }
              }