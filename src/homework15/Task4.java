package homework15;
/*4)Create a method that will say Hello in different language based on the country that will passed
when method is executed*/
public class Task4 {
    String sayHello(String countryName) {

        switch (countryName) {

            case "USA":
                return "Hello";
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";

        }
    }

}