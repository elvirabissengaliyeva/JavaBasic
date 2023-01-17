package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

      int [] numbers={10,20,30,45,50};

        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int sum=0;
        for (int j = 0; j <numbers.length ; j++) {
            sum=sum+numbers[j];

        }
        System.out.println(sum);

        }

    }




