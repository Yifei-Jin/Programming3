package drawingUI;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class ShapeNumberCounter {
    private int rect;
    private int circle;
    private int square;
    public JPanel controls;
    private String textcircle;
    private String textrect;
    private  String textsquare;


    public ShapeNumberCounter(){
        textcircle=new String("Circle number: "+circle);
        textrect=new String("Rectangle number: "+rect);
        textsquare=new String("Square number:" +square);
        rect=-1;
        circle=-1;
        square=-1;

    }
    public String addCnum(){
        circle=circle+1;
        textcircle=new String("Circle number: "+circle);
        return textcircle;
    }

    public String addRnum(){
        rect=rect+1;
        textrect=new String("Rectangle number: "+rect);
        return textrect;
    }

    public String addSnum(){
        square=square+1;
        textsquare=new String("Square number: "+square);
        return textsquare;
    }

}
