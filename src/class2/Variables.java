package class2;

public class Variables {
    public static void main(String[] args) {
       /*
       Below line is reserving a box in the computers memory.
       we are calling it box1 if we need the information that we are storing inside this box
       we can simlpe say to the computer give us the contents of box1.
       int=> what type of data we want to store
       box1=> is the name of the box
       = sign will take whatever we write after it and will store it inside the box1
       10=> is what we are storing inside the box
        */
        int box1=10;
        // if we are printing something from a box we don't need ""
        System.out.println(box1); // bring the contents of box1 and print them on the console
        /* To Store whole number(Numbers without decimals points) we have 4 different types of boxes.
        for example numbers like 10 20 3000 100000 330000
        1) byte 2) short 3) int 4) long
         */
        byte box2=127;
        byte box3=-128;
        short box4=32767;
        int biggerBox=123456484; // most common type of box
        long maxBox=14235678945444234l;

        /*

         */

        short myBox=10000;
        System.out.println(myBox);

    }
}
