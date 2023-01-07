package swing.grundkursJava.layout;

import swing.grundkursJava.layout.baseclasses.BaseLayout;
import swing.grundkursJava.layout.baseclasses.MyPanel;
import java.awt.BorderLayout;
import java.awt.Container;

public class BorderLayoutTest extends BaseLayout {
    public BorderLayoutTest(){
        super("BorderLayoutTest");
    }
    @Override
    public void setContent(Container container) {
        container.setLayout(new BorderLayout(10, 10));
        container.add(new MyPanel(1), BorderLayout.NORTH);
        container.add(new MyPanel(2), BorderLayout.WEST);
        container.add(new MyPanel(3), BorderLayout.CENTER);
        container.add(new MyPanel(4), BorderLayout.EAST);
        container.add(new MyPanel(5), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
