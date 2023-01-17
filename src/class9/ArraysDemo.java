package class9;

import JavaBasic.SepLineInOne;

public class ArraysDemo {
    public static void main(String[] args) {
        String name = "Slava";
        String name2 = "Safi";
        String name3 = "Jason";
        String name4 = "Nabi";
        String name5 = "Anees";

        String name6 = "Slava" + "SepLineInOne" + "Safi" + "SepLineInOne" + "Jason" + "SepLineInOne" + "Nabi" + "SepLineInOne" + "Anees";

        String[] names = {"Slava", "Safi", "Jason", "Nabi", "Anees", "Joseph"};

        System.out.println(name2);
        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        System.out.println(names[-5]);

        for (int i = 0; i <=5 ; i++) {
            System.out.println(names[i]);

        }
    }


}

