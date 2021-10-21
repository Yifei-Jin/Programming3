import java.awt.*;

public class Rect {
    private Point pos;
    private Color col;
    private int width;
    private int height;

    public Rect(int width, int height, Point position, Color color)
    {
        this.width=width;
        this.height=height;
        pos=position;
        col=color;
    }

    public void draw(Graphics g)
    {
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }



}
