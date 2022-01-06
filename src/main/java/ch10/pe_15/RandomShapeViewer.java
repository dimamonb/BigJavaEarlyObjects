package ch10.pe_15;

import javax.swing.*;

public class RandomShapeViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 800;
        final int FRAME_HEIGHT = 600;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("RandomShapeViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RandomShapeComponent component = new RandomShapeComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
