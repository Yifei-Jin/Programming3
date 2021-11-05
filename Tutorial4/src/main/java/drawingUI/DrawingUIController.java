package drawingUI;

import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    private JPanel controlsPanel=new JPanel();
    public JPanel mainPanel=new JPanel();
    public JPanel count=new JPanel();

    private Drawing drawing=new Drawing();
    private Point position=new Point();
    private ShapeSelector sselect=new ShapeSelector();
    private ColorSelector cselect=new ColorSelector();
    private CircleDimsSelector cdselect=new CircleDimsSelector();
    private RectDimsSelector rdselect=new RectDimsSelector();
    private SquareDimsSelector sdselect=new SquareDimsSelector();
    private ShapeNumberCounter shapenumber=new ShapeNumberCounter();
    private JLabel textcircle=new JLabel();
    private JLabel textrect=new JLabel();
    private JLabel textsquare=new JLabel();


    public DrawingUIController(){

        controlsPanel.setLayout(new GridLayout(3,3));
        mainPanel.setLayout(new GridLayout(2,1));
        count.setLayout(new GridLayout(3,1));
        textsquare.setText(shapenumber.addSnum());
        textrect.setText(shapenumber.addRnum());
        textcircle.setText(shapenumber.addCnum());

        count.add(textcircle);
        count.add(textrect);
        count.add(textsquare);
        controlsPanel.add(count);

    }

    public void getMainPanel(){

        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);

        controlsPanel.add(sselect.controls);
        controlsPanel.add(cselect.controls);
        controlsPanel.add(cdselect.controls);
        controlsPanel.add(rdselect.controls);
        controlsPanel.add(sdselect.controls);










        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                position=e.getPoint();

                System.out.println(position);
                if(sselect.getCurrentShape()==1){
                    drawing.addcircle(position,cselect.getCurrentColour(),cdselect.getCurrentRadius());
                    textcircle.setText(shapenumber.addCnum());
                }
                if(sselect.getCurrentShape()==2){
                    drawing.addrect(position,cselect.getCurrentColour(),rdselect.getCurrentWidth(),rdselect.getCurrentHeight());
                    textrect.setText(shapenumber.addRnum());
                }
                if(sselect.getCurrentShape()==3){
                    drawing.addsquare(position,cselect.getCurrentColour(),sdselect.getCurrentSide());
                    textsquare.setText(shapenumber.addSnum());
                }
                drawing.repaint();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        controlsPanel.add(count);


    }




}
