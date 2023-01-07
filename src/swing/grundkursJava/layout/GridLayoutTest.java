package swing.grundkursJava.layout;

import swing.grundkursJava.layout.baseclasses.BaseLayout;
import swing.grundkursJava.layout.baseclasses.MyPanel;

import java.awt.Container;
import java.awt.GridLayout;

public class GridLayoutTest  extends BaseLayout {
    public GridLayoutTest(){
        super("GridLayout");
    }
    @Override
    public void setContent(Container container) {
        container.setLayout(new GridLayout(2, 3, 10, 10));
        for (int i = 1; i <= 5; i++)
            container.add(new MyPanel(i));
    }

    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
