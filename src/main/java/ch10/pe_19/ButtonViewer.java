package ch10.pe_19;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonViewer {
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 100;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton buttonA = new JButton("Click me!!!");
        buttonA.setName("A");
        panel.add(buttonA);

        JButton buttonB = new JButton("Click me!!!");
        buttonB.setName("B");
        panel.add(buttonB);

        frame.add(panel);

        ActionListener listener = new ClickListener();
        buttonA.addActionListener(listener);
        buttonB.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
