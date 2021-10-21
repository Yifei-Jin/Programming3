import java.awt.*;
public class Main {
    public static void main(String[] args){

        Point p1=new Point(100,300);
        Point p2=new Point(100,100);
        Color c1=new Color(0x992266);
        Color c2=new Color(0x9cba8f);

        Rect r=new Rect(30,20,p2,c2);
        Circle c=new Circle(p1,c1,20);
        Drawing d=new Drawing(c,r);


    }


}
