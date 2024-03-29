package com.coboljunkie.gfn.projects.myDB;

import javax.swing.*;
import java.sql.*;


// Diese Klasse soll die Verbindung zur Datenbank initialisieren
public class Connector {

    // Diese Strings benötigen wir für die Verbindung
    // jdbc:mysql ist der Treiber
    private static String URL = "jdbc:mysql://Localhost:3306/fluege";
    private static String user = JOptionPane.showInputDialog("Bitte geben Sie den Nutzernamen ein");
    private static String password = JOptionPane.showInputDialog("Bitte geben Sie ihr Passwort ein");
    private static Connection conn;

    public static ResultSet commitWithResult(String statement) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(statement);
        return ps.executeQuery();
    }

    public static void commitWithoutResult(String statement) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(statement);
        ps.execute();
    }

    public static boolean exists(DatabaseObject o) throws SQLException {
        String statement;
        if (o instanceof Pilot) {
            statement = "SELECT pilotNr FROM pilot WHERE pilotNr ="+ ((Pilot)o).getPilotNr();
        } else if (o instanceof Flugzeug) {
            statement = "SELECT flugzeugNr FROM flugzeug WHERE flugzeugNr ="+ ((Flugzeug)o).getFlugzeugNr();
        } else if (o instanceof Stadt) {
            statement = "SELECT stadtNr FROM stadt WHERE stadtNr ="+ ((Stadt)o).getStadtNr();
        } else {
            statement = "SELECT flugNr FROM flug WHERE flugNr ="+ ((Flug)o).getFlugNr();
        }
        ResultSet result = commitWithResult(statement);
        return result.next()? true : false;
    }

    public static void init() throws SQLException {
        conn = DriverManager.getConnection(URL, user, password);
    }

}