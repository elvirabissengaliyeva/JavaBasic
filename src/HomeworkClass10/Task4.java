package HomeworkClass10;
/*Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers only.*/
public class Task4 {
    public static void main(String[] args) {

        int [][] num={ {2,3,4,5},
                {3,4,4,5},
                {4,5,5,5}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }
            }
                System.out.println();
            }

        }

    }

