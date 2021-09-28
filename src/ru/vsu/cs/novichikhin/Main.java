package ru.vsu.cs.novichikhin;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        final HorizontalParabola P1 = new HorizontalParabola(-6, -6, 0.5);
        final HorizontalParabola P2 = new HorizontalParabola(-3, -6, -0.25);
        final Circle C1 = new Circle(5, 0, 5);

        Point p1 = new Point(-8, -6);
        SimpleColor color1 = getColor(p1.x, p1.y);
        printColorForPoint(color1, p1.x, p1.y);

        Point p2 = new Point(-4, -6);
        SimpleColor color2 = getColor(p2.x, p2.y);
        printColorForPoint(color2, p2.x, p2.y);

        Point p3 = new Point(1, -4);
        SimpleColor color3 = getColor(p3.x, p3.y);
        printColorForPoint(color3, p3.x, p3.y);

        Point p4 = new Point(7, -3);
        SimpleColor color4 = getColor(p4.x, p4.y);
        printColorForPoint(color4, p4.x, p4.y);

        Point p5 = new Point(3, 3);
        SimpleColor color5 = getColor(p5.x, p5.y);
        printColorForPoint(color5, p5.x, p5.y);

        Point p6 = new Point(-6, 4);
        SimpleColor color6 = getColor(p6.x, p6.y);
        printColorForPoint(color6, p6.x, p6.y);

        double x7 = readPoint("x");
        chekNumberPositive(x7);
        double y7 = readPoint("y");
        chekNumberPositive(y7);
        SimpleColor color7 = getColor(x7, y7);
        printColorForPoint(color7, x7, y7);
    }

    public static SimpleColor getColor(double x, double y) {
        if ((P1.isPointRightOfParabola(x, y)) && (!P2.isPointRightOfParabola(x, y))) {
            return SimpleColor.ORANGE;
        }
        if (((P1.isPointRightOfParabola(x, y)) && (C1.isPointinCircle(x, y))) ||
                ((!P1.isPointRightOfParabola(x, y)) && (!P2.isPointRightOfParabola(x, y)))) {
            return SimpleColor.BLUE;
        }
        if ((!P1.isPointRightOfParabola(x, y)) && (C1.isPointinCircle(x, y))) {
            return SimpleColor.GRAY;
        }
        if (((P1.isPointRightOfParabola(x, y)) && (C1.isPointinCircle(x, y)) && (P2.isPointRightOfParabola(x, y)))) {
            return SimpleColor.GREEN;
        }
        if (((!P1.isPointRightOfParabola(x, y)) && (!C1.isPointinCircle(x, y)) && (P2.isPointRightOfParabola(x, y)))) {
            return SimpleColor.WHITE;
        }
    }
    public static void printColorForPoint(SimpleColor color, double x, double y) {
        switch (color) {
            case ORANGE -> System.out.print("(%1$.1f, %2$.1f) -> ORANGE"+ x + y);
            case BLUE -> System.out.print("(%1$.1f, %2$.1f) -> BLUE"+ x + y);
            case GRAY -> System.out.print("(%1$.1f, %2$.1f) -> GRAY"+ x + y);
            case GREEN -> System.out.print("(%1$.1f, %2$.1f) -> GREEN" + x + y);
            case WHITE -> System.out.print("(%1$.1f, %2$.1f) -> WHITE" + x + y);
        }
    }
    static double readPoint(String value) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input" + value);
        return in.nextDouble();
    }
    static void chekNumberPositive(double val) {
        if ((-10 <= val) && (val <= 10)) {
            System.out.print("Данные введены неверно.");
            System.exit(0);
        }
    }
}
