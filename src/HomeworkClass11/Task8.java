package HomeworkClass11;
        /*
        6) Create 2D array of countries: north america countries, south america countries, europe countries,
        asian countries, african countries. Then print all values from that array using 2 different
         loops and calculate how many total countries been stored
*/
public class Task8 {
                public static void main(String[] args) {
                        String[][] countries = {{"Canada", "United States", "Mexico", "Cuba"},
                                {"Brazil", "Colombia", "Colombia", "Ecuador"},
                                {"Germany", "France", "Spain", "Poland"},
                                {"Kazakhstan", "Azerbaijan", "Armenia ", "Georgia"}};
                        int counter = 0;
                        for (int i = 0; i < countries.length; i++) {
                                for (int j = 0; j < countries[i].length; j++) {
                                        System.out.print(countries[i][j] + " ");
                                        counter++;
                                }
                                System.out.println();
                        }
                        for (String[] country : countries) {
                                for (String count : country) {
                                        System.out.print(count + " ");
                                        counter++;
                                }
                                System.out.println();
                        }
                        System.out.println("Total" +counter);
                }
        }