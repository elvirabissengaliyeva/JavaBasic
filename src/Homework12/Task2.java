package Homework12;

/*
2) Create a String and print it in reverse order (Sunday → yadnuS).
*/
public class Task2 {
    public static void main(String[] args) {

        String w = "Sunday";
        String r=" ";
        for (int i = 0; i < w.length(); i++) {
            r = w.charAt(i)+r;
        }
        System.out.println(r);

    }
}
