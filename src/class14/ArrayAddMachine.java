package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[] array2 = {10, 10, 10, 45, 50};
        addArrayElementsMachine(array2);
        int[]array3={40, 90, 10, 45, 50};
        addArrayElementsMachine(array3);
}
    static void addArrayElementsMachine(int [] arr){
        int sum=0;
        for(int num: arr){
            sum+=num;
        }
        System.out.println(sum);
    }
}
