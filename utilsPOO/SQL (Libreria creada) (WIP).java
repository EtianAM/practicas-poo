/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilsT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Shiroi
 */
public class SQL {
    public SQL(){
        createConnection("jdbc:mysql://localhost/practicas", "root", "1234", "com.mysql.cj.jdbc.Driver");
    }
    public SQL(String url, String user, String password){
        createConnection(url, user, password, "com.mysql.cj.jdbc.Driver");
    }
    
    private Connection conn;
    
    private void createConnection(String url, String user, String password, String driver){
        try {
            // create a mysql database connection
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
            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate(qry);
        }
        catch (Exception e){
            System.err.println("Got an exception executing update!");
            System.err.println(e.getMessage());
        }
    }
}
