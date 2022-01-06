package ch10.pe_17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListenerA implements ActionListener {
    private int clickTimes;
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("I was clicked." + (clickTimes++));
    }
}
