/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileshop;

/**
 *
 * @author Toufique Hasan
 */
import java.sql.*;
public class ConnectDB {
Connection conn=null;
 
public Connection getConnection() {
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:XE";
String _user="ddbshop";
String _pass="ddbshop";
conn=DriverManager.getConnection(url,_user,_pass);
} catch (ClassNotFoundException | SQLException e) {
}
return conn;
}
public static void main (String[] args) {
new ConnectDB().getConnection();
 
}
}