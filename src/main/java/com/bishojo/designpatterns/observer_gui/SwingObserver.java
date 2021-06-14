package com.bishojo.designpatterns.observer_gui;

import javax.swing.*;

public class SwingObserver extends JFrame {

    JPanel panel;
    JButton button;

    public SwingObserver() {
        init();
    }

    private void init() {
        panel = new JPanel();
        button = new JButton("Should I do it?");
        button.setName("sidiButton");

        button.addActionListener(event -> System.out.println("No, don't do it. It's better."));
        button.addActionListener(event -> System.out.println("Yes, do it."));

        panel.add(button);
        this.setFrameProperties(panel);
    }

    private void setFrameProperties(JPanel panel) {
        add(panel);
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
