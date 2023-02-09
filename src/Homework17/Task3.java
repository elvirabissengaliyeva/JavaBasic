package Homework17;

/* 3) Write a java class that have 4 constructors with 4 different access levels of
constructors(private,public,default,protected) and create 4 objects of this class:
1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
and observe result.*/

/* 4)Write program that have static constructor and observe result.*/

public class Task3 {
    String name;
    String lastName;
    String Id;
    String position;
    String education;
    int age;

    public Task3(String EmpName, String EmpLastName, String EmpID, String EmpPosition, String Empeducation, int EmpAge) {
        name = EmpName;
        lastName = EmpLastName;
        Id = EmpID;
        position = EmpPosition;
        education = Empeducation;
        age = EmpAge;

    }

    private void print1() {
        System.out.println(name + lastName + Id + position + education + age);
    }

    public void print2() {
        System.out.println(name + lastName + Id + position + education + age);
    }

    void print3() {
        System.out.println(name + lastName + Id + position + education + age);
    }

    protected void print4() {
        System.out.println(name + lastName + Id + position + education + age);
    }

    static void print5() {
    //System.out.println(name + lastName + Id + position + education + age);
    }

    public static void main(String[] args) {


        Task3 Emp1 = new Task3("Ashgar", "Farhadi", "1234566", "Teacher", "master's degree", 33);
        Emp1.print1();

        Task3 Emp2 = new Task3("Ashgar", "Farhadi", "1234566", "Teacher", "master's degree", 33);
        Emp2.print2();

        Task3 Emp3 = new Task3("Ashgar", "Farhadi", "1234566", "Teacher", "master's degree", 33);
        Emp3.print3();

        Task3 Emp4 = new Task3("Ashgar", "Farhadi", "1234566", "Teacher", "master's degree", 33);
        Emp2.print4();
    }
}