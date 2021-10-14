package ru.vsu.cs.novichikhin;

class MainTest {

    public static boolean isCorrect(Picture picture) {
        double[] Xvalue = {-8, -4, 1, 7, 3, -6};
        double[] Yvalue = {-6, -6, -4, -3, 3, 4};
        SimpleColor[] trueColor = {SimpleColor.BLUE, SimpleColor.ORANGE, SimpleColor.GREEN,
                SimpleColor.BLUE, SimpleColor.GRAY, SimpleColor.WHITE};

        System.out.println("Проведём тест на корректность работы метода getColor:");

        for (int i = 0; i < 6; i++) {
            if (picture.getColor(Xvalue[i], Yvalue[i]) == trueColor[i]) {
                Main.printColorForPoint(Xvalue[i], Yvalue[i], picture);
                System.out.println("верно");
            } else {
                Main.printColorForPoint(Xvalue[i], Yvalue[i], picture);
                System.out.println("неверно");
                return false;
            }
        }
        return true;
    }
}