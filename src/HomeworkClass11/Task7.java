package HomeworkClass11;
        /*
        5) Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
*/
public class Task7 {
                public static void main(String[] args) {
                        int[][] num = {{10, 20, 30,88},
                                       {45, 55, 66,77},
                                       {30, 40, 20,78}};
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

