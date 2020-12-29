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
public class Ventanai extends JFrame {
    
    public Ventanai(){
        proceso();
        
        Paneli obj = new Paneli();
        this.add(obj);
        this.pack();
    }
    
    private void proceso(){
        /*
        Image icon = new ImageIcon(getClass().getResource("/Img/imgzt.jpg")).getImage();
        this.setIconImage(icon);*/
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (pantalla.height)/2;
        int width = (pantalla.width)/2;
        setSize(width,height);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setMinimumSize(new Dimension(800, 500));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }
    
}
