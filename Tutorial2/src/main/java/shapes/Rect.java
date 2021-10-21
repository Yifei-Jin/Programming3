package shapes;

import java.awt.*;

public class Rect extends Shape {

    private int width;
    private int height;

    public Rect(int width, int height, Point position, Color color)
    {
        super(position,color);
        this.width=width;
        this.height=height;
    }

    public void draw(Graphics g)
    {
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }



}
