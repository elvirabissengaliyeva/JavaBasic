package HomeworkClass11;
        /*
        4) Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.*/
public class Task6 {
                public static void main(String[] args) {
                        int sum = 0;
                        int[][] num = {{10, 20, 30},
                                          {45, 55, 66},
                                          {30, 40, 20}};
                        for (int i = 0; i < num.length; i++) {
                                for (int j = 0; j < num[i].length; j++) {

                                sum = sum + num[i][j];
                                }
                        }
                                System.out.println(sum);

                        }
                }
