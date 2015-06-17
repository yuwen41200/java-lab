import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Font;

public class Program2 extends JApplet {

    private double bmi;

    public void init() {
        String strWeight, strHeight;
        double weight, height;
        strWeight = JOptionPane.showInputDialog("Please input your weight (including units).");
        strHeight = JOptionPane.showInputDialog("Please input your height (including units).");
        if (strWeight.contains("lb") && strHeight.contains("in")) {
            weight = Double.parseDouble(strWeight.substring(0, strWeight.indexOf("lb")));
            height = Double.parseDouble(strHeight.substring(0, strHeight.indexOf("in")));
            bmi = 703*weight/height/height;
        }
        else if (strWeight.contains("kg") && strHeight.contains("m")) {
            weight = Double.parseDouble(strWeight.substring(0, strWeight.indexOf("kg")));
            height = Double.parseDouble(strHeight.substring(0, strHeight.indexOf("m")));
            bmi = weight/height/height;
        }
        else
            bmi = -1;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Courier New", Font.PLAIN, 24));
        if (bmi != -1) {
            g.drawString("Your BMI is " + bmi, 10, 25);
            if (bmi < 18.5)
                g.drawString("Underweight", 10, 50);
            else if (bmi >= 18.5 && bmi < 25)
                g.drawString("Normal", 10, 50);
            else if (bmi >= 25 && bmi < 30)
                g.drawString("Overweight", 10, 50);
            else
                g.drawString("Obese", 10, 50);
        }
        else
            g.drawString("Invalid Units", 10, 25);
    }

}