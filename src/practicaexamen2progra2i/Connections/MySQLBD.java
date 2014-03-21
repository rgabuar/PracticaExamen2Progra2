/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaexamen2progra2i.Connections;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrador
 */
public class MySQLBD {
    
    private final String DB_URL = "jdbc:mysql://localhost:3306/practicaexamen2Progra2I";
    private final String USER = "root";
    private final String PASS = "root";
    private Connection con = null;
    private CallableStatement cstmt;
    private Statement stmt;

    public MySQLBD() {
    }
    
    public ResultSet executeQuery(String sql) throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);        
        cstmt = con.prepareCall(sql);
        ResultSet res = cstmt.executeQuery();         
        return res;
    }
    
    public void closeExecuteQuery() throws SQLException{        
        cstmt.close();
        con.close();
    }
    
    public void closeExecute() throws SQLException{        
        stmt.close();
        con.close();
    }
    
    public void execute(String sql) throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);       
        stmt = con.createStatement();
        stmt.execute(sql); 
    }
    
    
}
