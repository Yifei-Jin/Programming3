import javax.swing.*;
import java.awt.*;

public class SimpleUI {
    static GraphicsConfiguration gc; //class field containing config info
    public static void main(String[] args){
        JFrame frame=new JFrame(gc);    //creat a new JFframe
        frame.setSize(500,300);
        frame.getContentPane().add(new ButtonPanel()); //add JPanel tot he JFrame
        frame.setVisible(true);
        //This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);





    }

}
