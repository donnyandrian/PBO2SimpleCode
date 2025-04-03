package com.pbo2.p5.thread;

import javax.swing.*;
import java.awt.*;

public class CountDownGUI extends JFrame {
    JLabel label;

    public CountDownGUI(String title) {
        super(title);
        label = new JLabel("Start count!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new Panel(), BorderLayout.WEST);
        getContentPane().add(label);
        setSize(300,300);
        setVisible(true);
    }

    public void startCount() {
        try {
            for (int i = 10; i > 0; i--) {
                Thread.sleep(1000);
                label.setText(i + "");
            }
            Thread.sleep(1000);
            label.setText("Count down complete.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        label.setText(Thread.currentThread().toString());
    }
}
