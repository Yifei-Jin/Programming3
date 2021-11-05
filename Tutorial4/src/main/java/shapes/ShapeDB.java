package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    ArrayList<Shape> shapes=new ArrayList<Shape>();

    void addSquare(Point pos, Color col, int side){
        Square square=new Square(pos,col,side);
        shapes.add(square);
    }

    void addCircle(Point pos, Color col, int side){
        Circle circle=new Circle(pos,col,side);
        shapes.add(circle);
    }

    void addRect(Point pos,Color col, int w, int h){
        Rect rect=new Rect(pos,col,w,h);
        shapes.add(rect);
    }

    void drawShapes(Graphics g){
        for(Shape shapelist:shapes){
            shapelist.draw(g);
        }
    }

}
