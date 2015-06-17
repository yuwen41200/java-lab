import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class TestDraw3 {

    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        JLabel label = new JLabel(panel.getStatusText());
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.add(panel);
        application.add(label, BorderLayout.SOUTH);
        application.pack();
        application.setVisible(true);
    }

}
