package com.coboljunkie.GFN.SQLexercise;

//import com.coboljunkie.GFN.projects.myDB.Connector;
//import com.coboljunkie.GFN.projects.myDB.DataManager;
//import com.coboljunkie.GFN.projects.myDB.HauptFenster;
import java.sql.SQLException;

public class SqlController {
    public static void main(String[] args) {
        try {
            Connector.init();
//            DataManager.datenLesen();
//
//            new HauptFenster();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
