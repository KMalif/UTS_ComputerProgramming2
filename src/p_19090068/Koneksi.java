/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_19090068;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mualif
 */
public class Koneksi {
    Connection Koneksi = null;
        public static Connection MySQL(){
            try{
                MysqlDataSource ds = new MysqlDataSource();
                ds.setUser("root");
                ds.setPassword("");
                ds.setServerName("localhost");
                ds.setDatabaseName("phb_java_mysql");
                ds.setPortNumber(3306);
                Connection c = ds.getConnection();
                return c;
            }catch(SQLException e){
                System.err.println(e.getMessage());
                return null;
            }
        }
    
}
