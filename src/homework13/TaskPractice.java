package homework13;

/*4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever*/
public class TaskPractice {
    public static void main(String[] args) {
        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" ");
        for (String word : arr) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
    }

}


