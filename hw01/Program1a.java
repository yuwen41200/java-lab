import javax.swing.JOptionPane;

public class Program1a {

    public static void main(String args[]) {
        int a, b, c;
        String strA, strB, strC;
        strA = JOptionPane.showInputDialog("Please input the first integer.");
        strB = JOptionPane.showInputDialog("Please input the second integer.");
        strC = JOptionPane.showInputDialog("Please input the third integer.");
        a = Integer.parseInt(strA);
        b = Integer.parseInt(strB);
        c = Integer.parseInt(strC);
        JOptionPane.showMessageDialog(null, "The sum is " + (a+b+c));
        JOptionPane.showMessageDialog(null, "The average is " + (a+b+c)/3);
        JOptionPane.showMessageDialog(null, "The product is " + a*b*c);
        int max = (a>b) ? a : b;
        max = (c>max) ? c : max;
        JOptionPane.showMessageDialog(null, "The largest is " + max);
        int min = (a<b) ? a : b;
        min = (c<min) ? c : min;
        JOptionPane.showMessageDialog(null, "The smallest is " + min);
        System.exit(0);
    }

}