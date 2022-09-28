package com.coboljunkie.GFN.myDB;


import java.sql.SQLException;

import static com.coboljunkie.GFN.myDB.Connector.commitWithoutResult;
import static com.coboljunkie.GFN.myDB.Connector.exists;
import static com.coboljunkie.GFN.myDB.DataManager.objektEntfernen;

public abstract class DatabaseObject {

    public abstract String getDeleteStatement();
    public abstract String getInsertStatement();
    public abstract String getUpdateStatement();

    public void toDatabase() throws SQLException {
        if (!exists(this)) {
            commitWithoutResult(getInsertStatement());
        } else {
            commitWithoutResult(getUpdateStatement());
        }
    };

    public void delete() throws SQLException {
        commitWithoutResult(getDeleteStatement());
        objektEntfernen(this);
    }

}