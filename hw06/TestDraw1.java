import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Dimension;

public class TestDraw1 {

    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.add(panel);
        application.pack();
        application.setVisible(true);
    }

}
