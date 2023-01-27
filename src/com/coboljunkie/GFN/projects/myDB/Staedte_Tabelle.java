package com.coboljunkie.GFN.projects.myDB;


import javax.swing.*;

import static com.coboljunkie.GFN.projects.myDB.DataManager.staedte;

public class Staedte_Tabelle extends JTable {

    private static Object[] columns = {"StadtNr", "Name"};
    private static Object[][] rowData = new Object[staedte.size()][];
    private static JScrollPane tableBox = new JScrollPane(new Staedte_Tabelle());

    static {
        for (int i = 0; i < staedte.size(); i++) {
            Stadt st = staedte.get(i);
            Object[] stadtDaten = {st.getStadtNr(), st.getName()};
            rowData[i] = stadtDaten;
        }
    }

    public Staedte_Tabelle() {
        super(rowData, columns);
    }

    public static JScrollPane getTableBox() {
        return tableBox;
    }


}