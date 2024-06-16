package exercise_example.ch05.ex_3;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Mouse extends JFrame {
    public static void main(String [] args) {
        Mouse demo = new Mouse();
        demo.setVisible(true);
    }

    Mouse() {
        super("Mouse Demo");
        add(new MouseComponent("Press left on Mouse"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int winX = 300;
        int winY = 300;
        setSize(winX, winY);
    }

    class MouseComponent extends JComponent {
    
        String theMsg;
        int msgX;
        int msgY;

        MouseComponent(String msg) {

            theMsg = msg;

            addMouseMotionListener(new MouseMotionListener() {

                @Override
                public void mouseDragged(MouseEvent e) {
                    // TODO Auto-generated method stub
                    //throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
                    // msgX = e.getX();
                    // msgY = e.getY();
                    // repaint();
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                    // TODO Auto-generated method stub
                    //throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
                    msgX = e.getX();
                    msgY = e.getY();
                    repaint();
                }
            });

        }

        public void paintComponent(Graphics g) {
            g.drawString(theMsg, msgX, msgY);
        }
    }
}
