package shapes;

import java.awt.*;

public abstract class Shape {
    // Fields
    protected Point pos;
    protected Color col;

    public Shape( Point initPos, Color col) {

        pos = initPos;
        this.col = col;
    }

    // A method that draws the object in g
    public abstract void draw(Graphics g);
}
