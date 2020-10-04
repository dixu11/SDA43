package oop.graphic;

import javax.swing.*;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("Moja gra");
        frame.setSize(800,600);
        frame.setVisible(true);

        MyPanel myPanel = new MyPanel();
        frame.add(myPanel);
        Thread.sleep(2000);
        myPanel.setTimeOver(true);
        myPanel.repaint();
    }





}
