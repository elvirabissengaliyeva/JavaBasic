package class19;

public class parent {

    String name;
    static String lastName;

    //private parent(){
    //   System.out.println("I am a parent class constructor");

   // }

    public static void main(String[] args) {
        parent p=new parent();

    }

    public void hello(){
        System.out.println("Hello from parent class");
    }

    protected static void bye(){
        System.out.println("protected method bye from parent class");
    }
    private static void money(){
        System.out.println("private method money from parent class");
    }
}
