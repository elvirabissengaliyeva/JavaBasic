package class19;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from the parent class");
    }
}
class SubClass extends SuperClass{
    SubClass(){
        super();
        System.out.println("I am a child constructor");
    }
}
