package class15;

public class MethodPracticeTester1 {
    public static void main(String[] args) {
        MethodPractice mp = new MethodPractice();
        boolean isEven = mp.isEven(100);
        System.out.println(isEven);

        MethodPractice ap = new MethodPractice();
        boolean isEven1 = mp.isEven(12);
        System.out.println(isEven);

        MethodPractice bp = new MethodPractice();
        boolean isEven2 = mp.isEven(20);
        System.out.println(isEven);


    }
}