import java.util.Scanner;

public class Program2 {

    private static double[][] points;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many points do you want to give?");
        int num = sc.nextInt();
        points = new double[num][2];
        for (int i=0; i<num; i++) {
            System.out.println("Please enter the x-coordinate of point " + (i+1) + ":");
            points[i][0] = sc.nextDouble();
            System.out.println("Please enter the y-coordinate of point " + (i+1) + ":");
            points[i][1] = sc.nextDouble();
        }
        MinDistancePoints m = new MinDistancePoints();
        m.x = 0;
        m.y = 1;
        m.distance = getDistance(0, 1);
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                if (i!=j && getDistance(i, j)<m.distance) {
                    m.x = i;
                    m.y = j;
                    m.distance = getDistance(i, j);
                }
            }
        }
        System.out.println("The closest pair is:");
        System.out.printf("Point %d (%f, %f)\n", (m.x+1), points[m.x][0], points[m.x][1]);
        System.out.printf("Point %d (%f, %f)\n", (m.y+1), points[m.y][0], points[m.y][1]);
        System.out.println("With distance " + m.distance);
    }

    public static double getDistance(int a, int b) {
        double x = Math.pow(points[a][0]-points[b][0], 2);
        double y = Math.pow(points[a][1]-points[b][1], 2);
        return Math.pow(x+y, 0.5);
    }

}

class MinDistancePoints {

    public int x;
    public int y;
    public double distance;

}