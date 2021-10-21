import shapes.Circle;
import shapes.Rect;
import shapes.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Circle cir;
    private Rect rec;
    private Square Squa;

    // The constructor
    public Drawing(Circle cin,Rect rin,Square sin ) {
        cir=cin;
        rec=rin;
        Squa=sin;
        FrameSetUp();
        CanvasSetUp();
    }


    private void CanvasSetUp() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }
    private void FrameSetUp() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g) {
        cir.draw(g);
        rec.draw(g);
        Squa.draw(g);
    }

}