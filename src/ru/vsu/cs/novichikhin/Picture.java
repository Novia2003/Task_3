package ru.vsu.cs.novichikhin;

import ru.vsu.cs.novichikhin.figures.HorizontalParabola;
import ru.vsu.cs.novichikhin.figures.Сircle;

public class Picture {
    final HorizontalParabola P1;
    final HorizontalParabola P2;
    final Сircle C1;

    public Picture(HorizontalParabola P1, HorizontalParabola P2, Сircle C1) {
        this.P1 = P1;
        this.P2 = P2;
        this.C1 = C1;
    }

    public SimpleColor getColor(double x, double y) {
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
