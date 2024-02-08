package com.github.junhax.gui;

import javax.swing.*;
import java.awt.*;


public class ConvertorSelectorFrame extends JFrame {
    JLabel label;
    public ConvertorSelectorFrame(String title) {

        super(title);
        setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        label = new JLabel("Hello World! ");
        Font f=new Font("宋体",Font.BOLD,25);
        label.setFont(f);
        Container contentPanel = getContentPane();
        contentPanel.add(label);
        JButton button1 = new JButton("Button1");
        button1.setFont(f);
        contentPanel.add(button1);
        button1.addActionListener(e->{

        });

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
