/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.SingletonUser;
import Controller.LoginController;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 1121054_JosephGeraldo
 */

public class MenuLogin {
    public static void main(String[] args) {
        new MenuLogin();
    } 
    public MenuLogin(){
        JFrame frame = new JFrame("Menu Login");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.BOLD, 20);
        
        JLabel menuLabel = new JLabel("Menu Login");
        menuLabel.setFont(new Font("Serif", Font.BOLD, 50));
        menuLabel.setBounds(150, 20, 300, 100);
        
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 140, 90, 40);
        usernameLabel.setFont(font1);
        
        JTextField username = new JTextField();
        username.setBounds(180, 150, 250, 20);
        username.setFont(font1);
        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 200, 90, 40);
        passwordLabel.setFont(font1);
        
        JTextField password = new JTextField();
        password.setBounds(180, 210, 250, 20);
        password.setFont(font1);
        
        JButton login = new JButton("Login");
        login.setBounds(120, 250, 150, 50);
        login.setFont(font1);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String kondisi = "";
                JOptionPane.showMessageDialog(null, kondisi);
                if (kondisi.equals("berhasil")) {
                    frame.dispose();
                    new MenuLihatSeluruhDataPengguna(SingletonUser.getInstance());
                }
            }
        });
        
        JButton back = new JButton("Back");
        back.setBounds(320, 250, 150, 50);
        back.setFont(font1);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuUtama();
            }
        });
        
        frame.add(back);
        frame.add(login);
        frame.add(password);
        frame.add(passwordLabel);
        frame.add(username);
        frame.add(usernameLabel);
        frame.add(menuLabel);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
