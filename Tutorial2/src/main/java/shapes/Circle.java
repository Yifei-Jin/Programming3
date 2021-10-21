package shapes;

import java.awt.*;
    /**
     * The shapes.Circle class encapsulates the information describing a circle and can draw it in
     * an AWT Graphics object using AWT library methods
     * */
    public class Circle extends Shape {
        private int radius;


        // The constructor
        public Circle(Point initPos, Color col, int radius){
            super( initPos, col);
            this.radius=radius;
        }
        // A method that draws the object in g
        @Override
        public void draw(Graphics g) {
            g.setColor(col);
            g.fillOval(pos.x,pos.y,radius, radius);
        }


    }



