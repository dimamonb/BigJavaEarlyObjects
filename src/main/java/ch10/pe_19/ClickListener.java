package ch10.pe_19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private int clickTimes;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        System.out.println("Button " + button.getName() +" was clicked.");
    }
}
