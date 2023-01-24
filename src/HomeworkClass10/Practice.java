package HomeworkClass10;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {

    }
    private static void Addition(
            int[] one, int[] two){
        System.out.print("Array One"+"\t");
        for (int i = 0; i <one.length; i++) {
            System.out.print(one[i] + "\t");
        }
        System.out.println();
        System.out.print("Array Two"+"\t");
        for (int i = 0; i <two.length; i++) {
            System.out.print(two[i]+ "\t");
        }
        System.out.println();
        System.out.println("---------------------");
        int result[]=new int[one.length];
        for (int i = 0; i < result.length; i++) {
            result[i]=one[i]+two[i];
        }
        System.out.println("Sum Of Two Arrays ");
        System.out.print(" Sum "+"\t"+"\t");
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"\t");
        }
    }
}

