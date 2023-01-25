package homework13;
/*
6) How would you swap  2 strings without a temporary variable?*/
public class Task6 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println("Strings before swap: a = " + a +" "+b);
        a = a + b;

        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("Strings after swap: a = " + a +" "+ b);

    }
}
