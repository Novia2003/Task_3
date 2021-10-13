package ru.vsu.cs.novichikhin;

class MainTest {

    static void testPointColor() {
        test(-8, -6, SimpleColor.BLUE);
        test(-4, -6, SimpleColor.ORANGE);
        test(1, -4, SimpleColor.GREEN);
        test(7, -3, SimpleColor.BLUE);
        test(3, 3, SimpleColor.GRAY);
        test(-6, 4, SimpleColor.WHITE);
    }

    static void test(double x, double y, SimpleColor color) {
        Main.printColorForPoint(x, y);
        if (color == Picture.getColor(x, y)) {
            System.out.print("верно\n");
        } else {
            System.out.print("неверно\n");
            System.exit(1);
        }
    }
}