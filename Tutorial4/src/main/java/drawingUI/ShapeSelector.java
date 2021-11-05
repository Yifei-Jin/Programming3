package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeSelector extends JPanel{
    private JRadioButton Circle;
    private JRadioButton Rectangle;
    private JRadioButton Square;
    public JPanel controls;


    public ShapeSelector(){
        controls=new JPanel();
        ButtonGroup buttonGroup=new ButtonGroup();
        Circle=new JRadioButton("Circle");
        Rectangle=new JRadioButton("Rectangle");
        Square=new JRadioButton("Square");

        controls.setLayout(new GridLayout(1,1));


        buttonGroup.add(Circle);
        buttonGroup.add(Rectangle);
        buttonGroup.add(Square);
        controls.add(Circle);
        controls.add(Rectangle);
        controls.add(Square);

        Circle.setSelected(true);

    }

    public int getCurrentShape(){
        int shape_index=0;
        if(Circle.isSelected()==true)
            shape_index=1;
        if(Rectangle.isSelected()==true)
            shape_index=2;
        if(Square.isSelected()==true)
            shape_index=3;
        System.out.println(shape_index);
        return shape_index;
    }




}
