package proiect2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;

/**
 * connection class
 * @author Delian
 */

public class database {
    public static Connection connectDB(){
       try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Connection connect = DriverManager.getConnection("jdbc:sqlserver://WIN-38C07PH45DM;databaseName=proiect");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/proiect", "root", "");
            return connect;
        }
        catch (Exception e){e.printStackTrace();}
        return null;
    }

    private static Driver SQLServerDriver() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}