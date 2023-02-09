package homework15;
/*5) Write a method to return whether given number is prime or not? */
public class Task5 {
    boolean isPrime(int number){

        boolean flag=true;
        if (number>1){
            for (int i = 2; i < number; i++) {
                if (number%i==0) {
                    flag = false;
                    break;
                }
            }

        }else {
            flag = false;
        }
        return flag;


    }
}

