package com.coboljunkie.SQLexercise;

//import com.coboljunkie.GFN.myDB.Connector;
//import com.coboljunkie.GFN.myDB.DataManager;
//import com.coboljunkie.GFN.myDB.HauptFenster;
import com.coboljunkie.SQLexercise.Connector;
import java.sql.*;
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
