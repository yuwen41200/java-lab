import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.Color;

public class Program1a extends JPanel {

    private int lines = 15;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        double w = getWidth();
        double h = getHeight();
        Color c;
        for (int i=0; i<lines; i++) {
            c = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
            g.setColor(c);
            g.drawLine(0, 0, (int)(w-w/lines*i), (int)(h/lines*i));
        }
        for (int i=0; i<lines; i++) {
            c = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
            g.setColor(c);
            g.drawLine(0, (int)h, (int)(w/lines*i), (int)(h/lines*i));
        }
        for (int i=0; i<lines; i++) {
            c = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
            g.setColor(c);
            g.drawLine((int)w, (int)h, (int)(w-w/lines*i), (int)(h/lines*i));
        }
        for (int i=0; i<lines; i++) {
            c = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
            g.setColor(c);
            g.drawLine((int)w, 0, (int)(w/lines*i), (int)(h/lines*i));
        }
    }

    public void setLines() {
        String strLines = JOptionPane.showInputDialog("How many lines per corner do you want to draw?");
        lines = Integer.parseInt(strLines);
    }

    public static void main(String[] args) {
        Program1a panel = new Program1a();
        panel.setLines();
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Drawing Lines - 1");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}