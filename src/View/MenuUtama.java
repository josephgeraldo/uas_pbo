/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 1121054_JosephGeraldo
 */

public class MenuUtama {
    public static void main(String[] args) {
        new MenuUtama();
    } 
    public MenuUtama(){
        JFrame frame = new JFrame("Menu Utama");
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.BOLD, 20);
        
        JLabel menuLabel = new JLabel("Menu Utama");
        menuLabel.setFont(new Font("Serif", Font.BOLD, 50));
        menuLabel.setBounds(150, 20, 300, 100);
        
        JButton login = new JButton("Login");
        login.setBounds(210, 150, 150, 50);
        login.setFont(font1);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuLogin();
            }
        });
        
        JButton registrasiPenggunaBaru = new JButton("Registrasi Pengguna Baru");
        registrasiPenggunaBaru.setBounds(140, 220, 300, 50);
        registrasiPenggunaBaru.setFont(font1);
        registrasiPenggunaBaru.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registrasiPenggunaBaru.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuRegistrasi();
            }
        });
        
        JButton lihatData = new JButton("Lihat Data Pengguna Berdasarkan Kategori");
        lihatData.setBounds(65, 290, 450, 50);
        lihatData.setFont(font1);
        lihatData.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lihatData.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
               new MenuLihatSeluruhDataPengguna();
            }    
        });
        
        frame.add(lihatData);
        frame.add(menuLabel);
        frame.add(registrasiPenggunaBaru);
        frame.add(login);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
