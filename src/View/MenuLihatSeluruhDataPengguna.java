/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.RegistrasiController;
import Model.SingletonUser;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author 1121054_JosephGeraldo
 */

public class MenuLihatSeluruhDataPengguna {
    String jk = "";
    public static void main(String[] args) {
        new MenuLihatSeluruhDataPengguna();
    } 
    public MenuLihatSeluruhDataPengguna(){
        RegistrasiController regis = new RegistrasiController();
        
        JFrame frame = new JFrame("Menu Registrasi");
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.PLAIN, 15);
        
        JLabel menuLabel = new JLabel("Menu Registrasi");
        menuLabel.setFont(new Font("Serif", Font.BOLD, 30));
        menuLabel.setBounds(170, 20, 300, 50);
        
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 70, 90, 40);
        usernameLabel.setFont(font1);
        
        JTextField username = new JTextField();
        username.setBounds(180, 80, 300, 20);
        username.setFont(font1);
        
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50, 100, 90, 40);
        emailLabel.setFont(font1);
        
        JTextField email = new JTextField();
        email.setBounds(180, 110, 300, 20);
        email.setFont(font1);
        
        JLabel jkLabel = new JLabel("Jenis Kelamin");
        jkLabel.setBounds(50, 130, 90, 40);
        jkLabel.setFont(font1);
        
        JRadioButton pria = new JRadioButton("Pria");
        JRadioButton wanita = new JRadioButton("Wanita");
        ButtonGroup bg = new ButtonGroup();
        bg.add(pria);
        bg.add(wanita);
        pria.setBounds(180, 135, 80, 30);
        pria.setFont(font1);
        wanita.setBounds(260, 135, 240, 30);
        wanita.setFont(font1);
        
        pria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jk = pria.getText();
            }
        });
        wanita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jk = wanita.getText();
            }
        });
        
        JLabel kategoriLabel = new JLabel("Kategori");
        kategoriLabel.setBounds(50, 160, 90, 40);
        kategoriLabel.setFont(font1);
        
        JCheckBox yt = new JCheckBox("PrivateAccount");
        yt.setBounds(180, 165, 240, 30);
        yt.setFont(font1);
        JCheckBox inf = new JCheckBox("CreatorAccount");
        inf.setBounds(180, 190, 240, 30);
        inf.setFont(font1);
        JCheckBox seleb = new JCheckBox("BusinessAccount");
        seleb.setBounds(180, 215, 240, 30);
        seleb.setFont(font1);
        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 245, 90, 40);
        passwordLabel.setFont(font1);
        
        JTextField password = new JTextField();
        password.setBounds(180, 255, 300, 20);
        password.setFont(font1);
        
        JButton registrasi = new JButton("Registrasi");
        registrasi.setBounds(120, 300, 150, 50);
        registrasi.setFont(font1);
        registrasi.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registrasi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String kategori = "";
                if (yt.isSelected()) {
                    kategori += yt.getText() + ", ";
                }
                if (inf.isSelected()) {
                    kategori += inf.getText() + ", ";
                }
                if (seleb.isSelected()) {
                    kategori += seleb.getText() + ", ";
                }
                frame.dispose();
                //
            }
        });
        
        JButton back = new JButton("Back");
        back.setBounds(320, 300, 150, 50);
        back.setFont(font1);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new MenuUtama();
            }
        });
        
        frame.add(registrasi);
        frame.add(back);
        frame.add(password);
        frame.add(passwordLabel);
        frame.add(yt);
        frame.add(inf);
        frame.add(seleb);
        frame.add(kategoriLabel);
        frame.add(pria);
        frame.add(wanita);
        frame.add(jkLabel);
        frame.add(emailLabel);
        frame.add(email);
        frame.add(username);
        frame.add(usernameLabel);
        frame.add(menuLabel);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    MenuLihatSeluruhDataPengguna(SingletonUser instance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
