import javax.swing.JApplet;
import java.awt.Dimension;

public class TestDraw2 extends JApplet{

    @Override
    public void init() {
        DrawPanel panel = new DrawPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        add(panel);
    }

}
