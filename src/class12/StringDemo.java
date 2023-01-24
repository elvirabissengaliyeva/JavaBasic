package class12;

public class StringDemo {
    public static void main(String[] args) {
        String strobj = new String("Java");


        String strobj2 = "Java";

        System.out.println(strobj2.length());
        String str = "Banana ";
        int len = str.length();
        System.out.println(len);
        String name = "Rafik";
        if (name.length() > 10) {
            System.out.println("Name can't be more than 10 letters");

        }
    }
}
