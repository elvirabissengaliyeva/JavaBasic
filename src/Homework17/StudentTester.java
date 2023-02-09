package Homework17;
/* 5) Write a Student class   that have instance variables name and address.
Create a constructor that will initialize those variables. Print name & address of given
student using displayInfo method.*/

public class StudentTester {
    public static void main(String[] args) {
        Student student1=new Student("Slava "," 440 S.Berendo street" );
        student1.displayInfo();
    }
}
