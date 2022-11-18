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
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
    JFrame f;
    JTable j;
    public MenuLihatSeluruhDataPengguna(){
        f = new JFrame();
        f.setTitle("Table");
        String[][] data = {
            {"1", "Asep", "Pria", "asep@gmail.com", "Private Account", "1000"},
        };
        String[] columnNames = {"userId", "userName", "userGender", "userEmail", "userCategory", "userFollowers"};
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(1000, 1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton back = new JButton("Back");
        back.setBounds(150, 150, 50, 50);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                f.dispose();
                new MenuUtama();
            }
        });
        f.add(back);
    }

    MenuLihatSeluruhDataPengguna(SingletonUser instance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
