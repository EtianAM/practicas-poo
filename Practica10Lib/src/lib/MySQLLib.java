/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;
import java.sql.*;

/**
 *
 * @author Etian Alvarado
 */
public class MySQLLib {
    public Connection createConnection(String url, String user, String password){ 
        try{
        String driver = "com.MySQL.jdbc.Driver"; //Driver actual
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}