package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str="fgfggbfgf 2476453241 @#$%^";
       // System.out.println(str.length());

        int counter=0;
       /* for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }

        }
        System.out.println("Total isAlphabetic is STR "+counter);
*/

        for (int i = 0; i < str.length(); i++) {
        if(Character.isDigit(str.charAt(i))){
            counter++;
        }

    }
        System.out.println("Total isAlphabetic is STR "+counter);

}}
