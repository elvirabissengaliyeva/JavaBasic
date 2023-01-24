package HomeworkClass11;
        /*
        3) Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that
        array using 2 different loops
      */
public class Task5 {
                public static void main(String[] args) {
                        String[][] arr = {{"Cabbage", "Tomato", "Cucumbers", "Ginger","Avocado"},
                                           {"Apple", "Banana", "Apricot", "Blackberries","Blackcurrant"},
                                           {"Butter","Cheese","Yogurt","Milk","Sour cream"}};

                        for (int i = 0; i < arr.length; i++) {
                                for (int j = 0; j < arr[i].length; j++) {
                                        System.out.print(arr[i][j]+ " ");

                                }
                            System.out.println();
                        }
                        for(String[]food:arr){
                            for(String all:food){
                                System.out.print(all+" ");
                            }
                            System.out.println();
                        }

                }
}
