package shapes;

import java.awt.*;

public class Square extends Rect{
    private int side;

    Square(Point position, Color color, int side) {
        super(position,color,side, side);
        this.side=side;
    }
}
