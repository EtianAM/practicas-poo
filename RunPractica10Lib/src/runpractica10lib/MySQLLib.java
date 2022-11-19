/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r

import java.sql.*;

/**
 *
 * @author Shiroi
 */
public class MySQLLib {
    public Connection createConnection(){ 
        // create our mysql database connection
        String myDriver = "org.gjt.mm.mysql.Driver";
        String myUrl = "jdbc:mysql://localhost/test";
        try{
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            return conn;
        }
        catch (Exception e){
            return null;
        }
    }
}
