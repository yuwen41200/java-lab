import net.nctucs.ywpu.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    private MyLine[] lines;
    private MyOval[] ovals;
    private MyRectangle[] rectangles;

    public DrawPanel() {
        setBackground(Color.WHITE);

        Random randomNumbers = new Random();
        lines = new MyLine[1 + randomNumbers.nextInt(5)];
        ovals = new MyOval[1 + randomNumbers.nextInt(5)];
        rectangles = new MyRectangle[1 + randomNumbers.nextInt(5)];

        for (int count = 0; count < lines.length; count++) {
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            lines[count] = new MyLine(x1, y1, x2, y2, color);
            //System.out.println("lines: " + x1 + " " + y1 + " " + x2 + " " + y2);
        }

        for (int count = 0; count < ovals.length; count++) {
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            boolean fill = randomNumbers.nextBoolean();
            ovals[count] = new MyOval(x1, y1, x2, y2, color, fill);
            //System.out.println("ovals: " + x1 + " " + y1 + " " + x2 + " " + y2);
        }

        for (int count = 0; count < rectangles.length; count++) {
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            boolean fill = randomNumbers.nextBoolean();
            rectangles[count] = new MyRectangle(x1, y1, x2, y2, color, fill);
            //System.out.println("rectangles: " + x1 + " " + y1 + " " + x2 + " " + y2);
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyLine line: lines)
            line.draw(g);
        for (MyOval oval: ovals)
            oval.draw(g);
        for (MyRectangle rectangle: rectangles)
            rectangle.draw(g);
    }

    public String getStatusText() {
        String status = "Lines: ";
        status += lines.length;
        status += ", Ovals: ";
        status += ovals.length;
        status += ", Rectangles: ";
        status += rectangles.length;
        return status;
    }

}
