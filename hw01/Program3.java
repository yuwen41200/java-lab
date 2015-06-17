import javax.swing.JOptionPane;

public class Program3 {

    public static void main(String args[]) {
        String strN, strA;
        strN = JOptionPane.showInputDialog("Please input an integer n.");
        strA = JOptionPane.showInputDialog("Please input an initial value a.");
        int n = Integer.parseInt(strN);
        double a = Double.parseDouble(strA);
        JOptionPane.showMessageDialog(null, "The square root of " + n + " is " + newtons_method(n, a, 1));
        System.exit(0);
    }

    public static double newtons_method(int n, double a, int count) {
        if (count > 10)
            return a;
        return newtons_method(n, 0.5*(a+n/a), count+1);
    }

}