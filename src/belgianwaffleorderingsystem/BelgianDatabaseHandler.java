/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belgianwaffleorderingsystem;
import java.sql.*;
/**
 *
 * @author Jairus
 */
public class BelgianDatabaseHandler {
    private String mDbname;
    private Connection mDb;
    
    public BelgianDatabaseHandler(String dbname) {
        
        mDbname = dbname;
        mDb = null;
        try{
            mDb = DriverManager.getConnection(dbname)
        }catch(SQLException e){
            
        }
    }
    
    
}
