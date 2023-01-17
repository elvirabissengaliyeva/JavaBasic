package homeworkClass9;
/*
Create an array of countries.
While retrieving all values from an array print capital for each country choose any five countries.
 */
public class task6 {
    public static void main(String[] args) {
        String [] countries = {"USA","Kazakhstan","Turkey","Spain","Germany"};
        String [] capital ={"Washington,D.C.","Astana","Ankara","Madrid","Berlin"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Capital of "+ countries[i]+" is "+capital[i]);

        }



    }
}
