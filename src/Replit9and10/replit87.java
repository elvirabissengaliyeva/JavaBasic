package Replit9and10;

public class replit87 {

    String Make;
    String Color;
    int Year;


    public static void main(String[] args) {

        replit87 BMW=new replit87();

        BMW.Color="Black";
        BMW.Year=2019;
        BMW.Make="BMW";


        replit87 Toyota=new replit87();
        Toyota.Make="Toyota";
        Toyota.Color="White";
        Toyota.Year=2018;


        System.out.println("Car color is "+BMW.Color+" and car year is "+BMW.Year+" and car model is "+BMW.Make);
        System.out.println("Car color is "+Toyota.Color+" and car year is "+Toyota.Year+" and car model is "+Toyota.Make);

    }
}

