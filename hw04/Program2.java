import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Program2 extends JApplet implements ActionListener {

    private JTextField textField;
    private int num;

    public void actionPerformed(ActionEvent event) {
        String strGuess = event.getActionCommand();
        try {
            int guess = Integer.parseInt(strGuess);
            if (guess > num)
                showStatus("Too high. Try again.");
            else if (guess < num)
                showStatus("Too low. Try again.");
            else {
                showStatus("Congratulations. You guessed the number!!");
                getNum();
            }
        }
        catch (Exception exception) {
            showStatus("Error: Invalid Number!!");
        }
        textField.setText("");
    }

    public void getNum() {
        num = 1 + (int)(Math.random()*1000);
    }

    public void init() {
        getNum();
        Container container = getContentPane();
        container.setLayout(new GridLayout(1, 2));
        JLabel label = new JLabel("Guess a number between 1 and 1000: ");
        container.add(label);
        textField = new JTextField();
        textField.addActionListener(this);
        container.add(textField);
    }

}