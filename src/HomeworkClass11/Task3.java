package HomeworkClass11;
        /* 1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will
        contain grades. Then your program should print name of the students that has A and B grade*/
public class Task3 {
                public static void main(String[] args) {
                    String[][] names = {{"John", "Bob", "Bill", "Ali"},
                            {"A", "B", "C", "D"}};
                    for (int i = 0; i < names.length; i++) {
                        for (int j = 0; j < names[i].length; j++) {

                            System.out.println(names[i][j] + " has grade ");
                        }
                    }
                }}