package swing.grundkursJava.events;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Close3  extends JFrame {
    private long start;

    public Close3(){
        super("Demo Ereignisbehandlung");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                printTime();
                System.exit(0);
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    printTime();
                    System.exit(0);
                }
            }
        });

        setSize(400, 200);
        setVisible(true);
        start = System.currentTimeMillis();
    }

    private void printTime(){
        long end = System.currentTimeMillis();
        double time = (end - start) / 1000;
        System.out.println("das Fenster war " + time + " Sekunden geöffnet.");
    }

    public static void main(String[] args) {
        new Close3();
    }
}
