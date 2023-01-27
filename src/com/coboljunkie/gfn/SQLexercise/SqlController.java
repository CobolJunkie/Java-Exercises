package com.coboljunkie.gfn.SQLexercise;

//import com.coboljunkie.gfn.projects.myDB.Connector;
//import com.coboljunkie.gfn.projects.myDB.DataManager;
//import com.coboljunkie.gfn.projects.myDB.HauptFenster;
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
