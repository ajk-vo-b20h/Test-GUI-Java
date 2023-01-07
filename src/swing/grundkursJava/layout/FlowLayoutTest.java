package swing.grundkursJava.layout;

import swing.grundkursJava.layout.baseclasses.BaseLayout;
import swing.grundkursJava.layout.baseclasses.MyPanel;

import java.awt.Container;
import java.awt.FlowLayout;

public class FlowLayoutTest extends BaseLayout {
    public FlowLayoutTest(){
        super("FlowLayout");
    }
    @Override
    public void setContent(Container container) {
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        for (int i = 1; i <= 5; i++)
            container.add(new MyPanel(i));
    }

    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
