package swing.grundkursJava.layout;

import swing.grundkursJava.layout.baseclasses.BaseLayout;
import swing.grundkursJava.layout.baseclasses.MyPanel;

import java.awt.*;

public class NullLayoutTest extends BaseLayout {
    public NullLayoutTest(){
        super("NullLayout");
    }

    @Override
    public void setContent(Container container) {
        container.setLayout(null);
        MyPanel p1 = new MyPanel(1);
        MyPanel p2 = new MyPanel(2);
        p1.setBounds(10, 10, 100, 100);
        p2.setBounds(120, 10, 100, 50);
        container.add(p1);
        container.add(p2);
    }

    public static void main(String[] args) {
        new NullLayoutTest();
    }
}
