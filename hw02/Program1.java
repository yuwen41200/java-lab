import java.util.Scanner;

public class Program1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the radius.");
        int r = sc.nextInt();
        System.out.printf("The diameter is %d.\n", 2*r);
        System.out.printf("The circumference is %f.\n", 2*Math.PI*r);
        System.out.printf("The area is %f.\n", Math.PI*r*r);
    }

}