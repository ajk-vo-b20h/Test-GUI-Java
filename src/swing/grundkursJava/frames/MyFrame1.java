package swing.grundkursJava.frames;

import javax.swing.JFrame;
import java.awt.Cursor;

public class MyFrame1 extends JFrame {
    public MyFrame1(){
        super("MyFrame1");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocation(100, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame1 frame = new MyFrame1();

        int[] types = {Cursor.CROSSHAIR_CURSOR, Cursor.HAND_CURSOR, Cursor.MOVE_CURSOR,
                Cursor.TEXT_CURSOR, Cursor.WAIT_CURSOR, Cursor.DEFAULT_CURSOR};

        for (int type: types){
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
            }

            Cursor c = Cursor.getPredefinedCursor(type);
            frame.setCursor(c);
            frame.setTitle(c.getName());
        }
    }
}
