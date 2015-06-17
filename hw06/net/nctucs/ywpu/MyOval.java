package net.nctucs.ywpu;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color myColor;
    private boolean fill;

    public MyOval(int x1, int y1, int x2, int y2, Color myColor, boolean fill) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setMyColor(myColor);
        setFill(fill);
    }

    public MyOval() {
        setX1(0);
        setY1(0);
        setX2(0);
        setY2(0);
        setMyColor(Color.BLACK);
        setFill(false);
    }

    public void draw(Graphics g) {
        g.setColor(getMyColor());
        if (getFill())
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        else
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }

    public void setX1(int x1) {
        x1 = (x1 >= 0) ? x1 : 0;
        this.x1 = x1;
    }

    public void setY1(int y1) {
        y1 = (y1 >= 0) ? y1 : 0;
        this.y1 = y1;
    }

    public void setX2(int x2) {
        x2 = (x2 >= 0) ? x2 : 0;
        this.x2 = x2;
    }

    public void setY2(int y2) {
        y2 = (y2 >= 0) ? y2 : 0;
        this.y2 = y2;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public Color getMyColor() {
        return myColor;
    }

    public boolean getFill() {
        return fill;
    }

    public int getUpperLeftX() {
        return (getX1() < getX2()) ? getX1() : getX2();
    }

    public int getUpperLeftY() {
        return (getY1() < getY2()) ? getY1() : getY2();
    }

    public int getWidth() {
        return Math.abs(getX1() - getX2());
    }

    public int getHeight() {
        return Math.abs(getY1() - getY2());
    }

}
