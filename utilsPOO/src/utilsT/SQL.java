/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilsT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Shiroi
 */
public class SQL {
    public SQL(){
        createConnection("jdbc:mysql://localhost/practica_web", "root", "1234", "com.mysql.cj.jdbc.Driver");
    }
    public SQL(String url, String user, String password){
        createConnection(url, user, password, "com.mysql.cj.jdbc.Driver");
    }
    
    private Connection conn;
    
    private void createConnection(String url, String user, String password, String driver){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e){
            System.err.println("Got an exception creating connection!");
            System.err.println(e.getMessage());
        }
    }
    
    public void exeUpdate(String qry){
        try {
            Statement st = conn.createStatement();
            System.out.println(qry);
            st.executeUpdate(qry);
        }
        catch (Exception e){
            System.err.println("Got an exception executing update!");
            System.err.println(e.getMessage());
        }
    }
    
    public ResultSet exeQuery(String qry){
        try {
            Statement st = conn.createStatement();
            System.out.println(qry);
            ResultSet rs = st.executeQuery(qry);
            return rs;
        }
        catch (Exception e){
            System.err.println("Got an exception executing query!");
            System.err.println(e.getMessage());
            return null;
        }
    }
}
