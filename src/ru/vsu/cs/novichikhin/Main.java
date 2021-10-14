package ru.vsu.cs.novichikhin;

import ru.vsu.cs.novichikhin.figures.HorizontalParabola;
import ru.vsu.cs.novichikhin.figures.Сircle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Picture picture = new Picture(new HorizontalParabola(-6, -6, 0.5),
                new HorizontalParabola(-3, -6, -0.25), new Сircle(5, 0, 5));

        boolean resultTest = MainTest.isCorrect(picture);
        printResultTest(resultTest);

        double x = readPoint("x = ");
        chekNumber(x);
        double y = readPoint("y = ");
        chekNumber(y);

        printColorForPoint(x, y, picture);
    }

    static void printResultTest(boolean resultTest) {
        if (resultTest) {
            System.out.println("Тест прошёл успешно, метод getColor работает исправно.");
        } else {
            System.out.println("Тест провален, метод getColor работает неправильно.");
            System.exit(1);
        }
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

    static void printColorForPoint(double x, double y, Picture picture) {
        System.out.printf("(%s, %s) -> %s\n", x, y, picture.getColor(x, y));
    }
}
