package swing.grundkursJava.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class MyFrame2 extends JFrame{
    public MyFrame2(){
        super("MyFrame2");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Content());
        pack();
        setVisible(true);
    }

    private static class Content extends JPanel{
        public Content(){
            setBackground(Color.LIGHT_GRAY);
            setPreferredSize(new Dimension(300, 200));
        }

        protected void paintComponent(Graphics g){
            super.paintComponent(g);

            g.setColor(Color.RED);
            g.fillRoundRect(30, 30, 240, 140, 30, 30);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Monospaced", Font.BOLD, 48));
            g.drawString("Hallo!", 65, 110);
        }
    }

    public static void main(String[] args) {
        new MyFrame2();
    }
}
