package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelector extends JPanel {
    private Color currentCol;
    private JButton btn1;
    public JPanel controls;

    public ColorSelector(){
        controls=new JPanel();
        currentCol=Color.BLACK;
        btn1=new JButton("Color");
        controls.add(btn1);
        controls.setLayout(new GridLayout(1,1));

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColor=JColorChooser.showDialog(btn1,"Choose Color",currentCol);
                currentCol=newColor;
                btn1.setBackground(currentCol);
            }
        });


    }

    public Color getCurrentColour(){

        return currentCol;
    }

}
