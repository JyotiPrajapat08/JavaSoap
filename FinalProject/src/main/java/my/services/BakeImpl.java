/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.services;

import com.models.BakedGoods;
import com.models.Users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;

/**
 *
 * @author ASUS
 */

   @WebService(endpointInterface = "my.interfaces.IBake")
public class BakeImpl {

    public List<Users> getAllUsers() {

        List<Users> movies = new ArrayList<>();
        try {
            Connection con = initiateDBConnection();
            ResultSet rs = null;
            String query = "select * from users";
            Statement stmt;
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                movies.add(new Users(rs.getInt("userid"), rs.getString("username"), rs.getString("password")));
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return movies;
    }
    
    
    public String insertUsers(int userid, String username, String password) {
        String result = "";
        try {
            Connection con = initiateDBConnection();
            String sql = "insert into users values (?,?,?)";
            PreparedStatement statement;
            statement = con.prepareStatement(sql);
            statement.setInt(1, userid);
            statement.setString(2, username);
            statement.setString(3, password);
            int rows = statement.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
     public int updatedUser(String name, String password, int id) {

        int status = 0;

        try {
            Connection con = initiateDBConnection();
            PreparedStatement ps = con.prepareStatement("update users set username=?,password=? where userid=?");
            ps.setString(1, name);
            ps.setString(2, password);
            ps.setInt(3, id);
            status = ps.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
     
     
    public String deleteUser(int id) {
        String result = "";
        try {
            Connection con = initiateDBConnection();
            String sql = "delete from users where userid = ?";
            PreparedStatement statement;
            statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            System.out.println(statement);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
     
      public List<BakedGoods> getAllBakedGoods() {

        List<BakedGoods> moviess = new ArrayList<>();
        try {
            Connection con = initiateDBConnection();
            ResultSet rs = null;
            String query = "select * from bakedgoods";
            Statement stmt;
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                moviess.add(new BakedGoods(rs.getInt("bakeid"), rs.getString("bakename"), rs.getDouble("bakeprice")));
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return moviess;
    }

     public String insertBakedGoods(int bakeid, String bakename, Double bakeprice) {
        String result = "";
        try {
            Connection con = initiateDBConnection();
            String sql = "insert into bakedgoods values (?,?,?)";
            PreparedStatement statement;
            statement = con.prepareStatement(sql);
            statement.setInt(1, bakeid);
            statement.setString(2, bakename);
            statement.setDouble(3, bakeprice);
            int rows = statement.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
     }
     
     
     
     public int updatedBakedGoods (String name, Double price, int id) {

        int status = 0;

        try {
            Connection con = initiateDBConnection();
            PreparedStatement ps = con.prepareStatement("update bakedgoods set bakename=?,bakeprice=? where bakeid=?");
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, id);
            status = ps.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

     public String deleteBakedGoods(int ids) {
        String resultt = "";
        try {
            Connection con = initiateDBConnection();
            String sql = "delete from bakedgoods where bakeid = ?";
            PreparedStatement statement;
            statement = con.prepareStatement(sql);
            statement.setInt(1, ids);
            int rows = statement.executeUpdate();
            System.out.println(statement);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultt;
    }

     
     


    public boolean getLogin(String username, String password) {
        try {
            Connection connection = initiateDBConnection();
            ResultSet rs = null;
            String sql = "Select * from users where username like '" + username + "' and password like '" + password + "'";
            Statement statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                return true;
            }
            rs.close();
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Connection initiateDBConnection() {
        {
            Connection con = null;
            try {
                String db_URL, db_Username, db_Password;

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
                db_URL = "jdbc:mysql://localhost:3306/finalproject?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false";
                db_Username = "root";
                db_Password = "root";
                con = DriverManager.getConnection(db_URL, db_Username, db_Password);
            } catch (SQLException ex) {
                Logger.getLogger(BakeImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            return con;
        }
    }
}
 

