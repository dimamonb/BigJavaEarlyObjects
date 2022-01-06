package ch10.sec09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private RectangleComponent scene;

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            scene.moveRectangleBy(1, 1);
        }
    }
    public RectangleFrame(){
        scene = new RectangleComponent();
        add(scene);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        ActionListener listener = new TimerListener();
        final int DELAY = 100;
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}
