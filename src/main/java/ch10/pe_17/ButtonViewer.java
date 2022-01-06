package ch10.pe_17;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonViewer {
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 160;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton buttonA = new JButton("Click me A!!!");
        JButton buttonB = new JButton("Click me B!!!");

        panel.add(buttonA);
        panel.add(buttonB);
        frame.add(panel);
        ActionListener listenerA = new ClickListenerA();
        buttonA.addActionListener(listenerA);

        ActionListener listenerB = new ClickListenerA();
        buttonB.addActionListener(listenerB);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
