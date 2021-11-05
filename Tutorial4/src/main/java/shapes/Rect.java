package shapes;

import java.awt.*;

public class Rect extends Shape {

    private int width;
    private int height;

    public Rect(Point position, Color color,int width, int height)
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
