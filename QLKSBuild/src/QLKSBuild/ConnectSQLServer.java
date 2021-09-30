package QLKSBuild;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectSQLServer {
    
    // liên kết SQLServer với netbeant
    
    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            String url = "jdbc:sqlserver://HUUNAMM\\MSSQLSERVER01;databaseName=QL_KHACHSAN;port=1433";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String username = "sa";
            String password = "123";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
