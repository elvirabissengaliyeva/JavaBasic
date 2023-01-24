package Homework12;

/*1) Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l*/
public class Task1 {
    public static void main(String[] args) {

        String name = "HelloWorld!";


        boolean isEmpty = name.isEmpty();

        if (!name.isEmpty()&&(name.length()%2!=0) && (name.length()>3)) {
            int mid = (name.length() / 2);
            System.out.println(name.charAt(mid));


        }
    }
}