package homework13;
/*4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever*/
public class Task4 {
    public static void main(String[] args) {
        String input = "This is sentence i want to reverse";

        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" ");
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        String output = sb.toString().trim();
        System.out.println(output);
    }
}

