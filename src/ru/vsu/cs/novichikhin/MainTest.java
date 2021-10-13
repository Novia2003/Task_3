package ru.vsu.cs.novichikhin;

import static ru.vsu.cs.novichikhin.Main.printColorForPoint;

class MainTest {

    @org.junit.jupiter.api.Test
    static void getColor() {
        test(-8, -6, SimpleColor.BLUE);
        test(-4, -6, SimpleColor.ORANGE);
        test(1, -4, SimpleColor.GREEN);
        test(7, -3, SimpleColor.BLUE);
        test(3, 3, SimpleColor.GRAY);
        test(-6, 4, SimpleColor.WHITE);
    }

    static void test(double x, double y, SimpleColor color) {
        printColorForPoint(x, y);
        if (color == Picture.getColor(x, y)) {
            System.out.print("верно\n");
        } else {
            System.out.print("верно\n");
        }
    }
}