import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Program3a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Operations on BigInteger
        System.out.println("Please input a big integer:");
        BigInteger bigIntA = sc.nextBigInteger();
        System.out.println("Please input another big integer:");
        BigInteger bigIntB = sc.nextBigInteger();
        System.out.println(bigIntA+" + "+bigIntB+" = "+bigIntA.add(bigIntB));
        System.out.println(bigIntA+" - "+bigIntB+" = "+bigIntA.subtract(bigIntB));
        System.out.println(bigIntA+" * "+bigIntB+" = "+bigIntA.multiply(bigIntB));
        System.out.println(bigIntA+" / "+bigIntB+" = "+bigIntA.divide(bigIntB));
        // Operations on BigDecimals
        System.out.println("Please input a big decimal:");
        BigDecimal bigDecA = sc.nextBigDecimal();
        System.out.println("Please input another big decimal:");
        BigDecimal bigDecB = sc.nextBigDecimal();
        System.out.println(bigDecA+" + "+bigDecB+" = "+bigDecA.add(bigDecB));
        System.out.println(bigDecA+" - "+bigDecB+" = "+bigDecA.subtract(bigDecB));
        System.out.println(bigDecA+" * "+bigDecB+" = "+bigDecA.multiply(bigDecB));
        System.out.println(bigDecA+" / "+bigDecB+" = "+bigDecA.divide(bigDecB, BigDecimal.ROUND_DOWN));
    }

}