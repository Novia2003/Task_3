package ru.vsu.cs.novichikhin;

import ru.vsu.cs.novichikhin.figures.HorizontalParabola;
import ru.vsu.cs.novichikhin.figures.Сircle;

public class Picture {
    public static final HorizontalParabola P1 = new HorizontalParabola(-6, -6, 0.5);
    public static final HorizontalParabola P2 = new HorizontalParabola(-3, -6, -0.25);
    public static final Сircle C1 = new Сircle(5, 0, 5);

    static SimpleColor getColor(double x, double y) {
        if (P1.isPointRightOfParabola(x, y) && !P2.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (P1.isPointRightOfParabola(x, y) && C1.isPointinCircle(x, y)) {
            return SimpleColor.BLUE;
        }
        if (!P1.isPointRightOfParabola(x, y) && !P2.isPointRightOfParabola(x, y)) {
            return SimpleColor.BLUE;
        }
        if (!P1.isPointRightOfParabola(x, y) && C1.isPointinCircle(x, y)) {
            return SimpleColor.GRAY;
        }
        if (P1.isPointRightOfParabola(x, y) && !C1.isPointinCircle(x, y) && P2.isPointRightOfParabola(x, y)) {
            return SimpleColor.GREEN;
        }

        return SimpleColor.WHITE;
    }

}
