package ru.vsu.cs.novichikhin;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        MainTest.testPointColor();

        double x = readPoint("x = ");
        chekNumber(x);
        double y = readPoint("y = ");
        chekNumber(y);

        printColorForPoint(x, y);
    }


    static double readPoint(String value) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите " + value);
        return in.nextDouble();
    }

    static void chekNumber(double val) {
        if ((-10 >= val) || (val >= 10)) {
            System.out.print("Данные введены неверно.");
            System.exit(1);
        }
    }

    static void printColorForPoint(double x, double y) {
        System.out.printf("(%s, %s) -> %s\n", x, y, Picture.getColor(x, y));
    }
}
