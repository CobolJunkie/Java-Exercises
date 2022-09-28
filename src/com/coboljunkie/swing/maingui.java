package com.coboljunkie.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class maingui {
    private JButton button_msg;
    private JPanel panel_main;
    private JPanel panel_result;
    private JPanel panel_bottom;
    private JTextField ip1;
    private JLabel ipLabel;
    private JPanel ip_panel;
    private JTextField subnet;

    public maingui() {
        button_msg.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello world");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new maingui().panel_main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
