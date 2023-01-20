package HomeworkClass10;
/*Create a 2D array of integer values. Print the sum of all numbers.*/
public class Task3 {
    public static void main(String[] args) {
        int [][] num={ {2,3,4,5},
                       {3,4,4,5},
                       {4,5,5,5}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {

                int sum = 0;
                sum+=num[i][j];

                System.out.println(sum);
            }
        }
        System.out.println();

    }
}
