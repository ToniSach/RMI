/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

/**
 *
 * @author tonis
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Paneli extends JPanel{
    JButton Calculadora, Chat;
    JLabel Titulo;
    public Paneli(){
        componentes();
        this.setBackground(Color.decode("#CDCDCD"));
        setLayout(null);
    }
    
    public void componentes(){
        
        Chat = new JButton("Chat");
        Chat.setBackground(Color.decode("#161569"));
        Chat.setBounds(325, 326, 150, 50);
        Chat.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        Chat.setForeground(Color.decode("#D3E7F3"));
        Chat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ChatUI s = new ChatUI();
                s.setVisible(true);
                
            }
        });
        add(Chat);
        
        Calculadora = new JButton("Calculadora");
        Calculadora.setBackground(Color.decode("#161569"));
        Calculadora.setBounds(325, 153, 150, 50);
        Calculadora.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        Calculadora.setForeground(Color.decode("#D3E7F3"));
        Calculadora.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Ventana1 venta = new Ventana1();
                venta.setVisible(true);
                
            }
        });
        add(Calculadora);
        /*
        chat = new JButton("Chat");
        chat.setBackground(Color.decode("#161569"));
        chat.setBounds(390, 230, 120, 25);
        chat.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        chat.setForeground(Color.decode("#D3E7F3"));
        chat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
        add(chat);*/
        
    }
}
