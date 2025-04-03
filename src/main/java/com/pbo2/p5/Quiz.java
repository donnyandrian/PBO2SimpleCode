package com.pbo2.p5;

import javax.swing.*;
import java.awt.*;

// 9.8.1 Banner
public class Quiz {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Banner");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Your name here!", SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(24f));

        frame.add(label, BorderLayout.CENTER);
        frame.setVisible(true);

        Thread t = new Thread(() -> {
            String text = label.getText() + " ";
            int len = text.length() - 1;
            
            for (int i = 0; i < len; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                int cutIndex = len - i - 1;
                String newText = text.substring(cutIndex) + text.substring(0, cutIndex);

                label.setText(newText);
    
                if (i + 1 == len && !Thread.currentThread().isInterrupted()) {
                    i = -1;
                }
            }
        }, "Banner");
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
