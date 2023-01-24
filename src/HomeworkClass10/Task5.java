package HomeworkClass10;
/*Create a 2D array of integers.
Develop a program which will calculate the sum of even and odd numbers for that array.*/
public class Task5 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;

        int [][] num={ {2,3,4,5},
                       {3,4,4,5},
                       {4,5,5,5}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    sum1 += num[i][j];

                } else {
                    sum2 += num[i][j];
                }
            }
        }
                System.out.println(sum1);
                System.out.println(sum2);


    }

}

