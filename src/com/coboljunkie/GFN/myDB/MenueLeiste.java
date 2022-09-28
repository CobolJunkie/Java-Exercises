package com.coboljunkie.GFN.myDB;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MenueLeiste extends JPanel {

    JButton[] buttons = {new JButton("Datensatz anlegen"), new JButton("Datensatz löschen"), new JButton("Datensatz ändern")};
    static MenueLeiste instance = new MenueLeiste();

    public static Component getButtonBox() {
        return instance;
    }

    private MenueLeiste() {
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        add(buttons[0]);
        add(buttons[1]);
        add(buttons[2]);
        buttons[0].addActionListener(new ButtonListener());
        buttons[1].addActionListener(new ButtonListener());
        buttons[2].addActionListener(new ButtonListener());
    }


}