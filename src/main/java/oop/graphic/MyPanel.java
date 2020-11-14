package oop.graphic;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {


    private boolean timeOver = false;

    @Override
    protected void paintComponent(Graphics g) {
        if (timeOver) {
            return;
        }
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
       g.drawString("NAPIS DO ODSZYFROWANIA",50,50);
    }

    public void setTimeOver(boolean timeOver) {
        this.timeOver = timeOver;
    }
}
