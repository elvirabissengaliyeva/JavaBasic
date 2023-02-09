package class17;

public class Student {
    String name;
    String id;
    int age;
    double weight;

    public Student(String sName, String sId, int sAge) {
        id = sId;
        name = sName;
        age = sAge;
    }

    Student(String sName, String sId, int sAge, double sWeight) {
        id = sId;
        name = sName;
        age = sAge;
        weight = sWeight;
    }

    void printInf() {
        if (weight == 0) {
            System.out.println(name + " " + id + " " + age);
        } else {
            System.out.println(name + " " + id + " " + age + " " + weight);
        }
    }
}
