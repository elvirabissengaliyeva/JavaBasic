package homework13;
/*1) Create a String that will hold a sentence.
Write a program to get a new String without any spaces.*/
public class Task1 {
    public static void main(String[] args) {
        String sentence = "Hello World is the my fist program";

        System.out.println("Before : \"" + sentence + "\"");
        System.out.println("Replace: \"" + sentence.replace(" ", "") + "\"");
    }
}