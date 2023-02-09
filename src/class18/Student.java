package class18;

public class Student {
    String name;
    String address;
    Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student name is "+name+" address is "+address );
    }

    public static void main(String[] args) {
        Student student1 =new Student("Aiperi,","USA,Pennsylvania");
        student1.displayInfo();
        }
    }

