import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

public class ButtonPanel extends JPanel {
    JButton button1;
    JButton button2;
    JCheckBox checkbox1;
    JCheckBox checkbox2;

    public ButtonPanel(){
        button1=new JButton("Press me");
        button2=new JButton("Back");
        checkbox1=new JCheckBox("Yes");
        checkbox1.setMnemonic(KeyEvent.VK_C);
        checkbox1.setSelected(false);
        checkbox2=new JCheckBox("No");
        checkbox2.setMnemonic(KeyEvent.VK_G);
        checkbox2.setSelected(false);


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
        checkbox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkbox1.isSelected()==true)
                System.out.println("tick yes");
                else
                    System.out.println("not tick yes");
            }
        });
        checkbox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkbox2.isSelected()==true)
                    System.out.println("tick no");
                else
                    System.out.println("not tick no");
            }
        });

        add(button1); //add button to the panel
        add(button2);
        add(checkbox1);
        add(checkbox2);
        setLayout(new GridLayout(1,1)); //one row, one column
    }

}
