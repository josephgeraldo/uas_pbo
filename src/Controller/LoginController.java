/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Model.SingletonUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 1121054_JosephGeraldo
 */

public class LoginController {
    public String PencarianController(String userName, String password) {
        String query;
        try {
            DatabaseHandler conn = new DatabaseHandler();
            conn.connect();
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("select * from user where userName='" + userName + "' AND password='" + password + "'");
            if(result.next()){
                User data = new User(result.getString("userId"), result.getString("password"), result.getString("userName"), result.getString("userEmail"), result.getString("userEmail"), result.getString("userGender"), result.getString("userCategory"), result.getString("userFollowers"));
                SingletonUser.getInstance().setData(data);
                return "berhasil";
            }else{
                return "tidak ditemukan";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
