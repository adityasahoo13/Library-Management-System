/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lonestar
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect 
{
    Connection conn;
    public static Connection ConnectDb()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","aditya");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
