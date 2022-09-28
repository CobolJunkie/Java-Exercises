package com.coboljunkie.GFN.myDB;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import static com.coboljunkie.GFN.myDB.DataManager.*;

public class Piloten_Tabelle extends JTable {
    public Piloten_Tabelle(Object[][] rowData, Object[] columns) {
        super(rowData, columns);
    }

    public static JScrollPane getTableBox() {
        Object[] columns = {"PilotenNummer", "Nachname", "Vorname"};
        Object[][] rowData = new Object[piloten.size()][];
        for (int i = 0; i < piloten.size(); i++) {
            Pilot p = piloten.get(i);
            Object[] pilotDaten = {p.getPilotNr(), p.getNachname(), p.getVorname()};
            rowData[i] = pilotDaten;
        }
        return new JScrollPane(new Piloten_Tabelle(rowData, columns));
    }



}