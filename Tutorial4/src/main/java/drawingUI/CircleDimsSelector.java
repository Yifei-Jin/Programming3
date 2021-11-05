package drawingUI;

import javax.swing.*;
import java.awt.*;

public class CircleDimsSelector extends JPanel {
    private JSlider radius;
    public JPanel controls;

    public CircleDimsSelector(){
        controls=new JPanel();
        radius=new JSlider(1,100);
        controls.setLayout(new GridLayout(3,2));
        JLabel label=new JLabel("Circle Radius");
        radius.setValue(20);
        controls.add(label);
        controls.add(radius);

    }
    public int getCurrentRadius(){
        return radius.getValue();
    }

}
