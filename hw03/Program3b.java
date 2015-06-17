import java.util.Scanner;
import java.math.BigInteger;

public class Program3b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        BigInteger n = sc.nextBigInteger();
        System.out.println(n+"! = "+factorial(n));
    }

    public static BigInteger factorial(BigInteger a) {
        if (a.equals(BigInteger.ONE))
            return BigInteger.ONE;
        BigInteger last = factorial(a.subtract(BigInteger.ONE));
        return last.multiply(a);
    }

}