package com.paolabs.lab12.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloUserForm extends JFrame {

    private JPanel panel;
    private JButton pressMeButton;
    private JTextArea myTextArea;

    public HelloUserForm() {
        add(panel);

        setTitle("Hello User Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        pressMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String textAreaText = myTextArea.getText();
                if ("".equals(textAreaText)) {
                    JOptionPane.showMessageDialog(panel, "Hello there!");
                } else {
                    JOptionPane.showMessageDialog(panel, "Hello " + textAreaText + "!");
                }
            }
        });
    }
}
