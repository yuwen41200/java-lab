import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.Color;

public class Program1b extends JPanel {

    private int lines = 15;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        double w = getWidth();
        double h = getHeight();
        Color c;
        for (int i=0; i<lines; i++) {
            c = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
            g.setColor(c);
            g.drawLine(0, (int)(h/lines*i), (int)(w/lines*(i+1)), (int)h);
        }
        for (int i=0; i<lines; i++) {
            c = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
            g.setColor(c);
            g.drawLine((int)(w/lines*i), (int)h, (int)w, (int)(h-h/lines*(i+1)));
        }
        for (int i=0; i<lines; i++) {
            c = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
            g.setColor(c);
            g.drawLine((int)(w/lines*i), 0, (int)w, (int)(h/lines*(i+1)));
        }
        for (int i=0; i<lines; i++) {
            c = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
            g.setColor(c);
            g.drawLine((int)(w-w/lines*i), 0, 0, (int)(h/lines*(i+1)));
        }
    }

    public void setLines() {
        String strLines = JOptionPane.showInputDialog("How many lines per corner do you want to draw?");
        lines = Integer.parseInt(strLines);
    }

    public static void main(String[] args) {
        Program1b panel = new Program1b();
        panel.setLines();
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Drawing Lines - 2");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}