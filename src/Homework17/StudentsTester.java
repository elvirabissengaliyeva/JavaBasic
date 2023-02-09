package Homework17;
/*2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
    students with different marks. Your program should print an average mark of each Students name.
    NOTE: please use different names for instance and local variables.*/
public class StudentsTester {
    public static void main(String[] args) {

        Students student1=new Students("Slava",85,95,100);
        student1.setAverage();
        Students student2=new Students("Adem",60,95,100);
        student2.setAverage();
        Students student3=new Students("Aiperi",75,65,68);
        student3.setAverage();
        Students student4=new Students("Zhenya",80,95,90);
        student4.setAverage();
        Students student5=new Students("Katya",70,65,80);
        student5.setAverage();
    }

}