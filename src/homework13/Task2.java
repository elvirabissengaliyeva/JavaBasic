package homework13;
/*2) Create a String that should be combination of letters, numbers and special characters.
 Find out how many Alphanumeric(abd AZ 284) characters are there in the String.*/
public class Task2 {
    public static void main(String[] args) {

        String str = "dsef1456%$#@";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", "").length());

    }
}