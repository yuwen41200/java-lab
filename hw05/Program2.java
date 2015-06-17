/**
 * Textbook Exercise 7.21
 */

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.Font;

public class Program2 {

    private int[][] floor = new int[20][20];
    private Turtle turtle = new Turtle();
    private int[] commands = {5, 3, 4, 5, 3, 2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9};

    public static void main(String[] args) {
        Program2 program2 = new Program2();
        program2.controller();
    }

    private void controller() {
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case 1:
                    turtle.penIsDown = false;
                    break;
                case 2:
                    turtle.penIsDown = true;
                    break;
                case 3:
                    if (turtle.direction == Direction.UP)
                        turtle.direction = Direction.RIGHT;
                    else if (turtle.direction == Direction.DOWN)
                        turtle.direction = Direction.LEFT;
                    else if (turtle.direction == Direction.LEFT)
                        turtle.direction = Direction.UP;
                    else
                        turtle.direction = Direction.DOWN;
                    break;
                case 4:
                    if (turtle.direction == Direction.UP)
                        turtle.direction = Direction.LEFT;
                    else if (turtle.direction == Direction.DOWN)
                        turtle.direction = Direction.RIGHT;
                    else if (turtle.direction == Direction.LEFT)
                        turtle.direction = Direction.DOWN;
                    else
                        turtle.direction = Direction.UP;
                    break;
                case 5:
                    i++;
                    try {
                        if (turtle.direction == Direction.UP) {
                            if (turtle.penIsDown)
                                for (int j = 0; j < commands[i]; j++)
                                    floor[turtle.coordinate[0] - j][turtle.coordinate[1]] = 1;
                            turtle.coordinate[0] -= commands[i];
                        } else if (turtle.direction == Direction.DOWN) {
                            if (turtle.penIsDown)
                                for (int j = 0; j < commands[i]; j++)
                                    floor[turtle.coordinate[0] + j][turtle.coordinate[1]] = 1;
                            turtle.coordinate[0] += commands[i];
                        } else if (turtle.direction == Direction.LEFT) {
                            if (turtle.penIsDown)
                                for (int j = 0; j < commands[i]; j++)
                                    floor[turtle.coordinate[0]][turtle.coordinate[1] - j] = 1;
                            turtle.coordinate[1] -= commands[i];
                        } else {
                            if (turtle.penIsDown)
                                for (int j = 0; j < commands[i]; j++)
                                    floor[turtle.coordinate[0]][turtle.coordinate[1] + j] = 1;
                            turtle.coordinate[1] += commands[i];
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex) {
                        System.out.println("Invalid Array Index: " + ex);
                    }
                    break;
                case 6:
                    String output = "";
                    for (int[] j : floor) {
                        for (int k : j) {
                            if (k == 1)
                                output += "*";
                            else
                                output += " ";
                        }
                        output += "\n";
                    }
                    view(output);
                    break;
                case 9:
                    i = commands.length;
                    break;
                default:
                    System.out.println("Invalid Command !!");
                    break;
            }
        }
    }

    private void view(String str) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Turtle Graphics");
        JTextArea textArea = new JTextArea(str, 25, 30);
        textArea.setEditable(false);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        frame.add(textArea);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

class Turtle {

    public int[] coordinate = new int[2];
    public Direction direction = Direction.DOWN;
    public boolean penIsDown = false;

}

enum Direction {
    UP, DOWN, LEFT, RIGHT
}
