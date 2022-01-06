package ch10.pe_16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private int clickTimes;
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("I was clicked." + (clickTimes++));
    }
}
