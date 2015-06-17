import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class Program2 extends JApplet {

    public void init() {}

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.gray);
        g.fill3DRect(80, 100, 300, 200, true);
        g.setColor(Color.blue);
        g.fillArc(80, 50, 300, 100, 0, 180);
        g.setColor(Color.cyan);
        g.fillOval(140, 120, 80, 120);
        g.fillRoundRect(270, 120, 80, 180, 5, 5);
        g.copyArea(50, 50, 350, 250, 350, 0);
    }

}