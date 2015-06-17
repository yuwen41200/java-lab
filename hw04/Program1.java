import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Program1 extends JPanel implements ActionListener {

    private static int heads = 0, tails = 0;
    private static JTextField textField;

    public void actionPerformed(ActionEvent event) {
        if (flip())
            heads++;
        else
            tails++;
        textField.setText("heads = " + heads + ", tails = " + tails);
    }

    public boolean flip() {
        int n = (int)(Math.random()*2);
        return (n == 1);
    }

    static public void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        textField = new JTextField("Press \"TOSS\" button to start!");
        JButton button = new JButton("TOSS");
        Program1 panel = new Program1();
        panel.add(textField);
        panel.add(button);
        textField.setEditable(false);
        button.addActionListener(panel);
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Program1");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}