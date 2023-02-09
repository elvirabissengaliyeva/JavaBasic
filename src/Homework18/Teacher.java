package Homework18;
/*
Write a Java program called Teacher.  Identify features and 4 behaviour of that Class. Create 3 subclasses
MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
 */
public class Teacher {
    String Id;

    public void teacherId() {
        System.out.println("This teacher Id"+Id);
    }

    public void grade() {
        System.out.println("Subject grade excellent");
    }

    public void MathTeach() {
        System.out.println(" ");
    }

    public void PianoTeacher() {
        System.out.println(" ");

    }
}
class MathTeacher extends Teacher {
    String subject;
    String name;

    public void MathTeach() {
        System.out.println(name + " teaching the Math");
    }
}
class ChemistryTeacher extends Teacher {
    String subject;
    String name;

    public void ChemistryTeacher() {
        System.out.println(name + " teaching the Chemistry");
    }
}
class PianoTeacher extends Teacher {
    String subject;
    String name;

    public void PianoTeacher() {
        System.out.println(name + " teaching the Piano");
    }
}
