package Homework17;
/* 5) Write a Student class   that have instance variables name and address.
Create a constructor that will initialize those variables. Print name & address of given
student using displayInfo method.*/

public class Student {
    String name;
    String address;
    Student(String StudName, String StudAddress){
        name=StudName;
        address=StudAddress;

    }
    void displayInfo(){
        System.out.println("Name is " + name+ "address is "+ address );

    }
}
