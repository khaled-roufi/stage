package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by khale on 08/05/2016.
 */
public class Dao {
    String url = "jdbc:mysql://127.0.0.1:3306/test";
    String login = "";
    String password = "";
    public Connection cn = null ;
    public Statement st = null ;

    public Dao(){
        getConnection();
    }

    public Dao getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url , login , password);
            st = cn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }
}
