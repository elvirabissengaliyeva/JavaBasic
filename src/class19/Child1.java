package class19;

import javax.swing.text.AsyncBoxView;

public class Child1 extends parent {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.hello();
        parent.bye();
        Child1.bye();
        c1.bye();

        c1.name="Gulzhanar";
        Child1.lastName="Berik";
    }
}
