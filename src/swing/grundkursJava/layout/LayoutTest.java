package swing.grundkursJava.layout;

import swing.grundkursJava.layout.baseclasses.MyPanel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class LayoutTest extends JFrame {
    public LayoutTest(){
        super("LayoutTest");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setLayout(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++)
            p1.add(new MyPanel(i));

        TitledBorder b1 = new TitledBorder("Panel 1");
        b1.setTitleFont(new Font("Dialog", Font.PLAIN, 12));
        b1.setTitleColor(Color.blue);
        p1.setBorder(b1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
        p2.add(new MyPanel(7));
        p2.add(new MyPanel(8));

        TitledBorder b2 = new TitledBorder("Panel 2");
        b2.setTitleFont(new Font("Dialog", Font.PLAIN, 12));
        b2.setTitleColor(Color.blue);
        p2.setBorder(b2);

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutTest();
    }
}
