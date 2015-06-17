import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class Program3 extends JApplet {

    public void init() {}

    int[] numbers = new int[100];

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.magenta);
        for (int i = 0; i < numbers.length; ++i)
            numbers[i] = (int)(Math.random()*101);
        for (int i = 0; i < numbers.length; ++i)
            g.drawLine(10, 20+3*i, 10+numbers[i], 20+3*i);
        g.drawString("The original array", 10, 350);
        bubbleSort();
        for (int i = 0; i < numbers.length; ++i)
            g.drawLine(225, 20+3*i, 225+numbers[i], 20+3*i);
        g.drawString("The sorted array", 225,350);
    }

    public void bubbleSort() {
        int size = numbers.length;
        for (int x = 0; x < size-1; ++x) {
            for(int y = 0; y < size-1-x; ++y) {
                if (numbers[y] > numbers[y+1]) {
                    int temp = numbers[y];
                    numbers[y] = numbers[y+1];
                    numbers[y+1] = temp;
                }
            }
        }
    }
}