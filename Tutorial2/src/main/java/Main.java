import shapes.Circle;
import shapes.Rect;
import shapes.Square;

import java.awt.*;
public class Main {
    public static void main(String[] args){

        Point p1=new Point(100,300);
        Point p2=new Point(100,100);
        Point p3=new Point(200,200);
        Color c1=new Color(0x992266);
        Color c2=new Color(0x9cba8f);
        Color c3=new Color(0x8f9cba);

        Square s=new Square(20,p3,c3);
        Rect r=new Rect(30,20,p2,c2);
        Circle c=new Circle(p1,c1,20);
        Drawing d=new Drawing(c,r,s);
        //change the local repo


    }


}
