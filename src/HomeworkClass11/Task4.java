package HomeworkClass11;

import java.util.Arrays;

/* 2) Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that
        array using 2 different loops */
public class Task4 {
                public static void main(String[] args) {
                        String[][] cars = {{"american", "german", "korean", "italian"},
                                            {"Tesla", "Audi", "Hyundai", "Mazzanti"}};
                        for (int i = 0; i < cars.length; i++) {
                                for (int j = 0; j < cars[i].length; j++) {
                                        System.out.print(cars[i][j]+" ");

                                }
                            System.out.println();
                        }
                        for(String[]car:cars){
                            for(String all:car){
                                System.out.print(all+ " ");

                            }
                            System.out.println();
                        }


                }
}
