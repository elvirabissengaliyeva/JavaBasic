package HomeworkClass10;
/*Create a 2D array of integer values. Print the sum of all numbers.*/
public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int [][] num={ {4,6,1},
                       {6,8,4},
                       {8,2,4}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {

                sum += num[i][j];
            }
        }
        System.out.println(sum);
    }
}
