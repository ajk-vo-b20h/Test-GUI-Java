package swing.grundkursJava.frames;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Close1 extends JFrame implements WindowListener, KeyListener {
    private long start;

    public Close1(){
        super("Demo Ereignisbehandlung");

        addWindowListener(this);
        addKeyListener(this);

        setSize(400, 200);
        setVisible(true);
        start = System.currentTimeMillis();
    }

    private void printTime(){
        long end = System.currentTimeMillis();
        double time = (end - start) / 1000;
        System.out.println("das Fenster war " + time + " Sekunden geöffnet.");
    }

    public  void windowClosing(WindowEvent e){
        printTime();
        System.exit(0);
    }

    public void windowActivated(WindowEvent e){
    }

    public void windowClosed(WindowEvent e){
    }

    public void windowDeactivated(WindowEvent e){
    }

    public void windowDeiconified(WindowEvent e){
    }

    public void windowIconified(WindowEvent e){
    }

    public void windowOpened(WindowEvent e){
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            printTime();
            System.exit(0);
        }
    }

    public void keyReleased(KeyEvent e){
    }

    public void keyTyped(KeyEvent e){
    }

    public static void main(String[] args) {
        new Close1();
    }
}
