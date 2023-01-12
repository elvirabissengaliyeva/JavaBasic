package homework2;

public class Task3 {
    public static void main(String[] args) {

       int score = 90;
        int score3 =90;
        int score2 =70;
        int score1 =50;

        if(score>=score3){
            System.out.println("grade=A");
        }if(score>=score2 && score<score3){
            System.out.println("grade=B");
        }if(score>=score1 && score<score2 ){
            System.out.println("grade=C");
        }else if(score<score1){
            System.out.println("grade=F");
        }

    }
}
