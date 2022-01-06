package ch10.pe_15;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class RandomShapeComponent extends JComponent {
    private Random rnd;

    public RandomShapeComponent() {
        this.rnd  = new Random();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
        for (int i = 0; i < 10; i++) {
            g2.draw(randomShape());
        }

    }

    public Shape randomShape() {

        switch (rnd.nextInt(3)) {
            case 0:
                return new Ellipse2D.Double(5, 10, 100, 150);
            case 1:
                return new Rectangle(16, 55, 90, 100);
            case 2:
                return new Polygon();
            case 3:
                return new Line2D.Double(77,66,400, 300);
            default:
                return new Arc2D.Double(34);
        }

    }
}
