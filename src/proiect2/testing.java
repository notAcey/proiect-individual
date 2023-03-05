/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect2;
import java.sql.*;
import org.junit.*;
/**
 *
 * @author Delian
 */
public class testing {
    private Connection conn;
  
  // Test adding a record to the database
  //@Test
  public void testAddRecord() throws SQLException {
    Statement stmt = conn.createStatement();
    
    // Execute an SQL insert statement to add a new record to the database
    int result = stmt.executeUpdate("INSERT INTO facultati (numeFacultate) VALUES ('Facultatea de MateInfo')");
    
    // Verify that one record was added
    assertEquals(1, result);
    
    // Clean up by deleting the added record
    stmt.executeUpdate("DELETE FROM facultate WHERE numeFacultate='Facultatea de MateInfo'");
}