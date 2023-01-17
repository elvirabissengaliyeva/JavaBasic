package homeworkClass9;
/*
Create an array of size 5 on integers and calculate the sum of all elements in an array.
 */
public class task5 {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 9};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

            System.out.println(sum);
        }
    }
