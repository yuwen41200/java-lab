import java.util.Scanner;

public class Program4 {

    private final static int maxN = 10010;
    private static int n;
    private static int[] a = new int[maxN];
    private static int[] b = new int[maxN];
    private static int[] c = new int[maxN];

    public static double max(double a, double b) {
        return (a>b) ? a : b;
    }

    public static double F(double x) {
        double ans = a[0]*x*x + b[0]*x + c[0];
        for (int i=1; i<n; i++)
            ans = max(ans, a[i]*x*x + b[i]*x + c[i]);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
            double L = 0.0, R = 1000.0;
            for (int i=0; i<100; i++) {
                double m1 = L+(R-L)/3;
                double m2 = R-(R-L)/3;
                if (F(m1)<F(m2))
                    R = m2;
                else
                    L = m1;
            }
            System.out.printf("%.4f\n", F(L));
        }
    }

}