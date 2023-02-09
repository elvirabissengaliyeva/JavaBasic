package class20;

/*Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class task2 {
    static void method(String str1) {
        System.out.println("Method with one String");
    }

    static void method(String str1, String str2) {
        System.out.println("Method with two Strings");
    }

    static void method(String str1, String str2, String str3) {
        System.out.println("Method with three Strings");
    }

    public static void main(String[] args) {

        task2.method("Java");
        task2.method("Java","Python");
        task2.method("Java","Python","C++");
    }
}