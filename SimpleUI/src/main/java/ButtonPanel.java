import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    JButton button1;
    JButton button2;
    public ButtonPanel(){
        button1=new JButton("Press me");
        button2=new JButton("Back");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("press the button1");

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("press the button2");

            }
        });
        add(button1); //add button to the panel
        add(button2);
        setLayout(new GridLayout(1,1)); //one row, one column
    }

}
