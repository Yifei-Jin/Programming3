package drawingUI;

import javax.swing.*;
import java.awt.*;

public class RectDimsSelector extends JPanel{
    private JSlider width;
    private JSlider height;
    public JPanel controls;

    public RectDimsSelector(){
        JLabel label=new JLabel("Rectangle Width and Height");
        controls=new JPanel();
        controls.setLayout(new GridLayout(3,1));
        controls.add(label);
        width=new JSlider(1,100);
        height=new JSlider(1,100);
        width.setValue(20);
        height.setValue(10);
        controls.add(width);
        controls.add(height);

    }
    public int getCurrentWidth(){
        return width.getValue();
    }
    public int getCurrentHeight(){
        return height.getValue();
    }
}
