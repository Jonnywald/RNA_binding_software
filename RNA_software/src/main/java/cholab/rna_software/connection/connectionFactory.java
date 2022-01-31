/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cholab.rna_software.connection;

/**
 *
 * @author Guilherme Bertola
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectionFactory {
    // private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/RNA_software?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "pass123";
    
    // connection method
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch ( SQLException ex) {
            throw new RuntimeException("ERROR DURING CONNECTION: "+ex.getMessage(),ex);
        }
    }
    // Method to close the connection (generic)
    public static void closeConnection(Connection con){
            try {
                if (con != null){
                con.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("ERROR UPON CLOSING CONNECTION: ",ex);
            }
    }
    // Method to close the connection (with statement)
    public static void closeConnection(Connection con, PreparedStatement stmt){
            closeConnection(con);
            try {
               if (stmt != null){
                stmt.close();
               }
            } catch (SQLException ex) {
                throw new RuntimeException("ERROR UPON CLOSING CONNECTION: ",ex);
            }
    }
    // Method to close the connection (with statement and result)
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
            closeConnection(con,stmt);
            try {
               if (rs != null){
                   rs.close();
               }
            } catch (SQLException ex) {
                throw new RuntimeException("ERROR UPON CLOSING CONNECTION: ",ex);
            }
    }    
}
