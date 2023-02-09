package Homework17;

/* 3) Write a java class that have 4 constructors with 4 different access levels of
constructors(private,public,default,protected) and create 4 objects of this class:
1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
and observe result.*/

public class Task3Tester {
    public static void main(String[] args) {
        Task3 Emp1=new Task3("Ashgar","Farhadi","1234566","Teacher","master's degree",33);
       // Emp1.print1();

        Task3 Emp2=new Task3("Ashgar","Farhadi","1234566","Teacher","master's degree",33);
        Emp2.print2();

        Task3 Emp3=new Task3("Ashgar","Farhadi","1234566","Teacher","master's degree",33);
        Emp3.print3();

        Task3 Emp4=new Task3("Ashgar","Farhadi","1234566","Teacher","master's degree",33);
        Emp2.print4();

    }
}
