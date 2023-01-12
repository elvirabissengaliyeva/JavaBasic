package homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
            System.out.println("Enter your heights in inches");
        int height= input.nextInt();

        int height1=60;
        int height2=72;

        if(height<height1){
            System.out.println("Person classified as short");
        }if (height>height1 && height<height2){
            System.out.println("Person classified as medium");

        }else{
            System.out.println("Person classified as tall");
        }
    }}

