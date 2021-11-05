
import drawingUI.DrawingUIController;
import shapes.Drawing;

import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc; //class field containing config info
    public static void main(String[] args){
        JFrame frame=new JFrame(gc);    //creat a new JFframe
        frame.setTitle("Draw Shapes");
        DrawingUIController control=new DrawingUIController();
        frame.setSize(500,600);
        control.getMainPanel();
        frame.getContentPane(); //add JPanel tot he JFrame
        frame.add(control.mainPanel);


        frame.setVisible(true);
        //This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


/*
        Point p1=new Point(100,300);
        Point p2=new Point(100,100);
        Point p3=new Point(200,200);
        Color c1=new Color(0x992266);
        Color c2=new Color(0x9cba8f);
        Color c3=new Color(0x8f9cba);

        Drawing d=new Drawing();
        d.addsquare(p3,c3,20);
        d.addrect(p2,c2,30,20);
        d.addcircle(p1,c1,20);

*/








    }


}
