import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    JMenu menu;
    JMenuItem item;
    public MainMenu(){
        menu=new JMenu("The Menu");
        item=new JMenuItem("Item 1");
        item.addActionListener(this);
        add(menu);
        menu.add(item);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

    }
}
