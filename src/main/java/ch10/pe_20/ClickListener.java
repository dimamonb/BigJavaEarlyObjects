package ch10.pe_20;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class ClickListener implements ActionListener {
    private int clickTimes;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        System.out.println("Button " + button.getName() +" was clicked. Time: " + LocalTime.now());
    }
}
