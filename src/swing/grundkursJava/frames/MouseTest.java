package swing.grundkursJava.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MouseTest  extends JFrame {
    public MouseTest(){
        super("MouseTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Content());
        pack();
        setVisible(true);
    }

    private static class Content extends JPanel implements MouseListener, MouseMotionListener{
        //aktuelles, noch nicht gespeichertes Rechteck
        private Rect currentRect;

        //enthält alle komplett gezeichnetten Rechtecke
        private ArrayList<Rect> rects = new ArrayList<>();

        public Content(){
            setBackground(Color.white);
            setPreferredSize(new Dimension(400, 300));
            addMouseListener(this);
            addMouseMotionListener(this);
        }

        protected void paintComponent(Graphics g){
            super.paintComponent(g);

            //alle gespeicherten Rechtecke neu zeichnen
            for(Rect r : rects){
                g.drawRect(r.x, r.y, r.b, r.h);
            }

            //aktuelle Rechteck zeichnen
            if(currentRect != null){
                g.drawRect(currentRect.x, currentRect.y, currentRect.b, currentRect.h);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            //neues Rechteck erzeugen
            currentRect = new Rect(e.getX(), e.getY(), 0, 0);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //aktuelles Rechteck speichern
            if(currentRect.b > 0 && currentRect.h > 0)
                rects.add(currentRect);
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();

            //Breite und Höhe des aktuellen Rechtecks ermitteln
            if(x > currentRect.x && y > currentRect.y){
                currentRect.b = x - currentRect.x;
                currentRect.h = y - currentRect.y;
            }
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }

        private class Rect{
            private int x, y, b, h;

            public Rect(int x, int y, int b, int h){
                this.x = x;
                this.y = y;
                this.b = b;
                this.h = h;
            }
        }
    }

    public static void main(String[] args) {
        new  MouseTest();
    }
}
