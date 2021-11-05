package drawingUI;

import javax.swing.*;
import java.awt.*;

public class SquareDimsSelector extends JPanel {
    private JSlider side;
    public JPanel controls;

    public SquareDimsSelector(){
        controls=new JPanel();
        side=new JSlider(1,100);
        controls.setLayout(new GridLayout(2,1));
        JLabel label=new JLabel("Square Side");
        side.setValue(20);
        controls.add(label);
        controls.add(side);

    }
    public int getCurrentSide(){
        return side.getValue();
    }

}
