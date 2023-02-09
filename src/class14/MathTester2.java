package class14;

import java.util.Scanner;

public class MathTester2 {
    public static void main(String[] args) {
        Math2 math=new Math2();
        math.mult(10,10,10);
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();

        int result = math.sub(100,50);
        System.out.println(result);
    }

}