package ru.vsu.cs.novichikhin;

public class Сircle {
    public double x0;
    public double y0;
    public double r;

    public Сircle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;

    }

    public boolean isPointinCircle(double x, double y) {
        return r*r >= Math.pow(y - y0, 2) + Math.pow(x-x0,2);
    }
}
