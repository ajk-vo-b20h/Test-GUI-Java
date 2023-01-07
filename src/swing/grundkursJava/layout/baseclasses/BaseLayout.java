package swing.grundkursJava.layout.baseclasses;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

public abstract class BaseLayout  extends JFrame {
    public BaseLayout(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        setContent(contentPane);
        setSize(300, 200);
        setVisible(true);
    }

    public abstract void setContent(Container container);
}
