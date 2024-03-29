package com.coboljunkie.gfn.projects.myDB;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

@SuppressWarnings("serial")
public class Pilot_Formular extends JFrame {

    public static Pilot_Formular instance;
    String[] labels = {"PilotenNummer", "Nachname", "Vorname"};
    public Pilot_Formular() {
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        JLabel headline = new JLabel("Bitte die Daten des neuen Piloten eingeben");
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(8, 1));
        container.add(headline);
        for (String s : labels) {
            JLabel label = new JLabel(s, SwingConstants.CENTER);
            label.setSize(20, 100);
            label.setHorizontalTextPosition(SwingConstants.CENTER);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            JTextField textField = new JTextField();
            textField.setSize(20, 100);
            textField.setName(s);
            container.add(label);
            container.add(textField);
        }
        JButton submit = new JButton("Ok");
        submit.addActionListener(new SubmitListener());
        container.add(submit);
        add(container);
        Border border = BorderFactory.createEmptyBorder(20, 20, 20, 20);
        getRootPane().setBorder(border);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        instance = this;
    }

    public static void close() {
        instance.dispose();
    }
}