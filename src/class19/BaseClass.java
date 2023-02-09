package class19;

public class BaseClass {
    String name="John";
    void hello(){
        System.out.println("Hello method from BaseClass");
    }
}
class Child extends BaseClass{
    String name="Jane";
    void callMe(){
        System.out.println(this.name);
        System.out.println(super.name);
    }

    void hello() {
        System.out.println("Hello method from Child class");
    }
    void callingParentMethod(){
        hello();
        super.hello();
    }
}