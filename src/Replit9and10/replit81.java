package Replit9and10;


public class replit81 {
    public static void main(String[] args) {

        int[] num = {5, 4, 8};
        for (int i = 0; i < num.length; i++) {

            if (num[0] > num[1] && num[0] > num[2])
                System.out.println("Highest value " + num[0]);
        }
            if (num[1] > num[0] && num[1] > num[2])
            System.out.println("Highest value " + num[1]);

            if (num[2] > num[0] && num[2] > num[2])
            System.out.println("Highest value " + num[2]);


    }
}