package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private ShapeDB shapeDB;

    // The constructor
    public Drawing() {
        shapeDB=new ShapeDB();
        FrameSetUp();
        CanvasSetUp();
    }


    private void CanvasSetUp() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }
    private void FrameSetUp() {
        f = new Frame("my windows"); // Instantiates the Frame

        f.add(this); // Adds the Canvas to the Frame
        //f.setLayout(null); // Stops the frame from trying to layout contents
        f.setLayout(new GridLayout(2,1)); // Sets the dimensions of the frame
        f.setVisible(false);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });


    }


    public void addcircle(Point pos, Color col, int radius){
        shapeDB.addCircle(pos,col,radius);
    }

    public void addrect(Point pos, Color col, int w, int h){
        shapeDB.addRect(pos,col,w,h);
    }

    public void addsquare(Point pos, Color col,int side){
        shapeDB.addSquare(pos,col,side);
    }

    public void paint(Graphics g) {
        shapeDB.drawShapes(g);
    }

}