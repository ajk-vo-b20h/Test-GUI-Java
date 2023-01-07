package swing.grundkursJava.layout;

import swing.grundkursJava.layout.baseclasses.BaseLayout;
import swing.grundkursJava.layout.baseclasses.MyPanel;

import javax.swing.*;
import java.awt.*;


public class BoxLayoutTest extends BaseLayout {
    public BoxLayoutTest(){
        super("BoxLayout");
    }
    @Override
    public void setContent(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        container.add(new MyPanel(1));
        container.add(Box.createHorizontalStrut(10));
        container.add(new MyPanel(2));
        container.add(Box.createHorizontalGlue());
        container.add(new MyPanel(3));
    }

    public static void main(String[] args) {
        new BoxLayoutTest();
    }
}
