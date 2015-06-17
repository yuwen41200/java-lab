import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.UIManager;
import javax.swing.JDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Program1 {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Show Pascal Triangles");
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Input the size then press enter.");
        frame.add(label);
        InnerProgram1 innerProgram1 = new InnerProgram1();
        JTextField textField = new JTextField(20);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.addActionListener(innerProgram1);
        frame.add(textField);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

class InnerProgram1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Font font = new Font(Font.MONOSPACED, Font.PLAIN, 20);
        UIManager.put("OptionPane.messageFont", font);
        JDialog.setDefaultLookAndFeelDecorated(true);
        int layer = 1;
        try {
            layer = Integer.parseInt(e.getActionCommand());
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid Input:\n" + ex, "Result", JOptionPane.ERROR_MESSAGE);
        }
        layer = (layer > 0) ? layer : 1;
        String pascal = generatePascal(layer);
        JOptionPane.showMessageDialog(null, pascal, "Result", JOptionPane.PLAIN_MESSAGE);
    }

    private String generatePascal(int n) {
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            try {
                arr[i] = new int[i + 1];
                arr[i][0] = 1;
                arr[i][i] = 1;
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                String err = "Error: Array with index " + i + ".\n" + ex;
                System.out.println(err);
            }
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                try {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
                catch (ArrayIndexOutOfBoundsException ex) {
                    String err = "Error: Array with index " + i + " " + j + ".\n" + ex;
                    System.out.println(err);
                }
            }
        }
        String output = "";
        for (int[] i : arr) {
            for (int j : i) {
                output += String.format("%5d", j);
            }
            output += "\n";
        }
        return output;
    }

}
