package homeworkClass9;
/* Create an array of chars and store grades into it: A,B,C,D,E,F.
Then print a grade B (use 2 different ways of creating an array).*/
public class task1 {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(letters[1]);

        char[] letter = new char[6];
        letter[0] = 'A';
        letter[1] = 'B';
        letter[2] = 'C';
        letter[3] = 'D';
        letter[4] = 'E';
        letter[5] = 'F';
        System.out.println(letter[1]);



    }
}
