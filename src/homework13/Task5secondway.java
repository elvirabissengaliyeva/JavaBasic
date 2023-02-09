package homework13;

public class Task5secondway {
    public static void main(String[] args) {
        String original = "aba";
        String reverse = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
