package HomeworkClass10;
/*Using Scanner create an array of countries. When an array is created,
retrieve all values from it and while retrieving those values print capital for each country.
(use 2 different loops).*/
public class Task2 {
    public static void main(String[] args) {
        String[] countries = {"usa", "kazakhstan", "turkey", "spain", "germany"};
        for (String country : countries) {
            System.out.print(country.toUpperCase()+" ");

        }
        System.out.println();

        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i].toUpperCase()+" ");

        }

    }

}