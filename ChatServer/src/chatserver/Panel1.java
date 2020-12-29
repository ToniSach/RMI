/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author tonis
 */
public class Panel1 extends JPanel {
    JButton codificar, limpiar, volver;
    JLabel titulo, texto, combinacionteclas;
    JTextField textoE;
    JTextArea textoS;
    
    JButton Operaciones, limpiars;
    JLabel titulos, suma, resta, multiplicacion, division, potencia, raiz,
            suma01, resta01, multi01, div01, pot01, raiz01, sumaop, restaop,
            multiop, divop, potop, raizop, sumaopr, restaopr, multiopr, divopr,
            potopr, raizopr;
    JTextField suma1, suma2, sumares, resta1, resta2, restares, multi1, multi2, 
            multires, div1, div2, divres, pot1, pot2, potres, raiz1, raiz2, raizres;
    
    public Panel1(){
        componentes();
        this.setBackground(Color.decode("#CDCDCD"));
        setLayout(null);
    }
    
    public void componentes(){
        codificar = new JButton("Calcular");
        codificar.setBackground(Color.decode("#161569"));
        codificar.setBounds(390, 330, 120, 25);
        codificar.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        codificar.setForeground(Color.decode("#D3E7F3"));
        codificar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    Registry miRegistro = LocateRegistry.getRegistry("localhost", 1234);
                    RemoteInterface s = (RemoteInterface) miRegistro.lookup("Ejemplo");
                    //suma
                    String valorsum1 = suma1.getText();
                    String valorsum2 = suma2.getText();
                    double a = 0;
                    double b = 0;
                    a = Double.parseDouble(valorsum1);
                    b = Double.parseDouble(valorsum2);
                    String res = Double.toString(s.suma(a, b));
                    sumares.setText(res);
                    //resta
                    String valorres1 = resta1.getText();
                    String valorres2 = resta2.getText();
                    double ares = 0;
                    double bres = 0;
                    ares = Double.parseDouble(valorres1);
                    bres = Double.parseDouble(valorres2);
                    String resres = Double.toString(s.resta(ares, bres));
                    restares.setText(resres);
                    //multiplicacion
                    String valormult1 = multi1.getText();
                    String valormult2 = multi2.getText();
                    double amult = 0;
                    double bmult = 0;
                    amult = Double.parseDouble(valormult1);
                    bmult = Double.parseDouble(valormult2);
                    String resmult = Double.toString(s.multiplicacion(amult, bmult));
                    multires.setText(resmult);
                    //division
                    String valordiv1 = div1.getText();
                    String valordiv2 = div2.getText();
                    double adiv = Double.parseDouble(valordiv1);
                    double bdiv = Double.parseDouble(valordiv2);
                    String resdiv = Double.toString(s.division(adiv, bdiv));
                    divres.setText(resdiv);
                    //potencia
                    String valorpot1 = pot1.getText();
                    String valorpot2 = pot2.getText();
                    double apot = Double.parseDouble(valorpot1);
                    double bpot = Double.parseDouble(valorpot2);
                    String respot = Double.toString(s.potencia(apot, bpot));
                    potres.setText(respot);
                    //raiz
                    String valorraiz1 = raiz1.getText();
                    String valorraiz2 = raiz2.getText();
                    double araiz = Double.parseDouble(valorraiz1);
                    double braiz = Double.parseDouble(valorraiz2);
                    String resraiz = Double.toString(s.raiz(araiz,braiz));
                    raizres.setText(resraiz);
                    
                } catch(Exception aes) {
                    System.out.println(aes.getMessage());
                    aes.printStackTrace();
                }
            }
        });
        add(codificar);
        
        volver = new JButton("Regresar");
        volver.setBackground(Color.decode("#161569"));
        volver.setBounds(230, 330, 120, 25);
        volver.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        volver.setForeground(Color.decode("#D3E7F3"));
        volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Ventanai venta = new Ventanai();
                venta.setVisible(true);
                
            }
        });
        add(volver);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBackground(Color.decode("#161569"));
        limpiar.setBounds(550, 330, 120, 25);
        limpiar.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        limpiar.setForeground(Color.decode("#D3E7F3"));
        limpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                suma1.setText("");
                suma2.setText("");
                sumares.setText("");
                resta1.setText("");
                resta2.setText("");
                restares.setText("");
                multi1.setText("");
                multi2.setText("");
                multires.setText("");
                div1.setText("");
                div2.setText("");
                divres.setText("");
                pot1.setText("");
                pot2.setText("");
                potres.setText("");
                raiz1.setText("");
                raiz2.setText("");
                raizres.setText("");
                
            }
        });
        add(limpiar);
        
        titulo = new JLabel("CALCULADORA");
        titulo.setBounds(280, 10, 430, 30);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        titulo.setForeground(Color.decode("#2D3A54"));
        add(titulo);
        
        suma01 = new JLabel("Suma:");
        suma01.setBounds(30, 55, 100, 70);
        suma01.setFont(new Font("Arial", Font.ITALIC, 20));
        suma01.setForeground(Color.decode("#2D3A54"));
        add(suma01);
                
        suma1 = new JTextField("");
        suma1.setBounds(100, 80, 100 , 20);
        suma1.setFont(new Font("Arial", Font.ITALIC, 20));
        suma1.setForeground(Color.decode("#2D3A54"));
        add(suma1); 
        
        sumaop = new JLabel("+");
        sumaop.setBounds(206, 55, 20, 70);
        sumaop.setFont(new Font("Arial", Font.ITALIC, 20));
        sumaop.setForeground(Color.decode("#2D3A54"));
        add(sumaop);
        
        suma2 = new JTextField("");
        suma2.setBounds(225, 80, 100 , 20);
        suma2.setFont(new Font("Arial", Font.ITALIC, 20));
        suma2.setForeground(Color.decode("#2D3A54"));
        add(suma2);
        
        sumaopr = new JLabel("=");
        sumaopr.setBounds(331, 55, 20, 70);
        sumaopr.setFont(new Font("Arial", Font.ITALIC, 20));
        sumaopr.setForeground(Color.decode("#2D3A54"));
        add(sumaopr);
        
        sumares = new JTextField("");
        sumares.setBounds(350, 80, 160 , 20);
        sumares.setFont(new Font("Arial", Font.ITALIC, 20));
        sumares.setForeground(Color.decode("#2D3A54"));
        sumares.setEditable(false);
        add(sumares);
        
        resta01 = new JLabel("Resta:");
        resta01.setBounds(30, 90, 100, 70);
        resta01.setFont(new Font("Arial", Font.ITALIC, 20));
        resta01.setForeground(Color.decode("#2D3A54"));
        add(resta01);
                
        resta1 = new JTextField("");
        resta1.setBounds(100, 115, 100 , 20);
        resta1.setFont(new Font("Arial", Font.ITALIC, 20));
        resta1.setForeground(Color.decode("#2D3A54"));
        add(resta1); 
        
        restaop = new JLabel("-");
        restaop.setBounds(206, 90, 20, 70);
        restaop.setFont(new Font("Arial", Font.ITALIC, 20));
        restaop.setForeground(Color.decode("#2D3A54"));
        add(restaop);
        
        resta2 = new JTextField("");
        resta2.setBounds(225, 115, 100 , 20);
        resta2.setFont(new Font("Arial", Font.ITALIC, 20));
        resta2.setForeground(Color.decode("#2D3A54"));
        add(resta2);
        
        restaopr = new JLabel("=");
        restaopr.setBounds(331, 90, 20, 70);
        restaopr.setFont(new Font("Arial", Font.ITALIC, 20));
        restaopr.setForeground(Color.decode("#2D3A54"));
        add(restaopr);
        
        restares = new JTextField("");
        restares.setBounds(350, 115, 160 , 20);
        restares.setFont(new Font("Arial", Font.ITALIC, 20));
        restares.setForeground(Color.decode("#2D3A54"));
        restares.setEditable(false);
        add(restares);
        
        multi01 = new JLabel("Multiplicación:");
        multi01.setBounds(30, 125, 135, 70);
        multi01.setFont(new Font("Arial", Font.ITALIC, 20));
        multi01.setForeground(Color.decode("#2D3A54"));
        add(multi01);
        
        multi1 = new JTextField("");
        multi1.setBounds(170, 150, 100 , 20);
        multi1.setFont(new Font("Arial", Font.ITALIC, 20));
        multi1.setForeground(Color.decode("#2D3A54"));
        add(multi1); 
        
        multiop = new JLabel("x");
        multiop.setBounds(276, 125, 20, 70);
        multiop.setFont(new Font("Arial", Font.ITALIC, 20));
        multiop.setForeground(Color.decode("#2D3A54"));
        add(multiop);
        
        multi2 = new JTextField("");
        multi2.setBounds(295, 150, 100 , 20);
        multi2.setFont(new Font("Arial", Font.ITALIC, 20));
        multi2.setForeground(Color.decode("#2D3A54"));
        add(multi2);
        
        multiopr = new JLabel("=");
        multiopr.setBounds(401, 125, 20, 70);
        multiopr.setFont(new Font("Arial", Font.ITALIC, 20));
        multiopr.setForeground(Color.decode("#2D3A54"));
        add(multiopr);
        
        multires = new JTextField("");
        multires.setBounds(420, 150, 160 , 20);
        multires.setFont(new Font("Arial", Font.ITALIC, 20));
        multires.setForeground(Color.decode("#2D3A54"));
        multires.setEditable(false);
        add(multires);
        
        div01 = new JLabel("División:");
        div01.setBounds(30, 160, 135, 70);
        div01.setFont(new Font("Arial", Font.ITALIC, 20));
        div01.setForeground(Color.decode("#2D3A54"));
        add(div01);
        
        div1 = new JTextField("");
        div1.setBounds(120, 185, 100 , 20);
        div1.setFont(new Font("Arial", Font.ITALIC, 20));
        div1.setForeground(Color.decode("#2D3A54"));
        add(div1); 
        
        divop = new JLabel("/");
        divop.setBounds(226, 160, 20, 70);
        divop.setFont(new Font("Arial", Font.ITALIC, 20));
        divop.setForeground(Color.decode("#2D3A54"));
        add(divop);
        
        div2 = new JTextField("");
        div2.setBounds(245, 185, 100 , 20);
        div2.setFont(new Font("Arial", Font.ITALIC, 20));
        div2.setForeground(Color.decode("#2D3A54"));
        add(div2);
        
        divopr = new JLabel("=");
        divopr.setBounds(351, 160, 20, 70);
        divopr.setFont(new Font("Arial", Font.ITALIC, 20));
        divopr.setForeground(Color.decode("#2D3A54"));
        add(divopr);
        
        divres = new JTextField("");
        divres.setBounds(370, 185, 160 , 20);
        divres.setFont(new Font("Arial", Font.ITALIC, 20));
        divres.setForeground(Color.decode("#2D3A54"));
        divres.setEditable(false);
        add(divres);
        
        pot01 = new JLabel("Potencia:");
        pot01.setBounds(30, 195, 135, 70);
        pot01.setFont(new Font("Arial", Font.ITALIC, 20));
        pot01.setForeground(Color.decode("#2D3A54"));
        add(pot01);
        
        pot1 = new JTextField("");
        pot1.setBounds(120, 225, 100 , 20);
        pot1.setFont(new Font("Arial", Font.ITALIC, 20));
        pot1.setForeground(Color.decode("#2D3A54"));
        add(pot1); 
        
        potop = new JLabel("^");
        potop.setBounds(226, 195, 20, 70);
        potop.setFont(new Font("Arial", Font.ITALIC, 20));
        potop.setForeground(Color.decode("#2D3A54"));
        add(potop);
        
        pot2 = new JTextField("");
        pot2.setBounds(245, 225, 100 , 20);
        pot2.setFont(new Font("Arial", Font.ITALIC, 20));
        pot2.setForeground(Color.decode("#2D3A54"));
        add(pot2);
        
        potopr = new JLabel("=");
        potopr.setBounds(351, 195, 20, 70);
        potopr.setFont(new Font("Arial", Font.ITALIC, 20));
        potopr.setForeground(Color.decode("#2D3A54"));
        add(potopr);
        
        potres = new JTextField("");
        potres.setBounds(370, 225, 160 , 20);
        potres.setFont(new Font("Arial", Font.ITALIC, 20));
        potres.setForeground(Color.decode("#2D3A54"));
        potres.setEditable(false);
        add(potres);
        
        raiz01 = new JLabel("Raiz:");
        raiz01.setBounds(30, 235, 100, 70);
        raiz01.setFont(new Font("Arial", Font.ITALIC, 20));
        raiz01.setForeground(Color.decode("#2D3A54"));
        add(raiz01);
                
        raiz1 = new JTextField("");
        raiz1.setBounds(100, 260, 100 , 20);
        raiz1.setFont(new Font("Arial", Font.ITALIC, 20));
        raiz1.setForeground(Color.decode("#2D3A54"));
        add(raiz1); 
        
        raizop = new JLabel("√");
        raizop.setBounds(206, 235, 20, 70);
        raizop.setFont(new Font("Arial", Font.ITALIC, 20));
        raizop.setForeground(Color.decode("#2D3A54"));
        add(raizop);
        
        raiz2 = new JTextField("");
        raiz2.setBounds(225, 260, 100 , 20);
        raiz2.setFont(new Font("Arial", Font.ITALIC, 20));
        raiz2.setForeground(Color.decode("#2D3A54"));
        add(raiz2);
        
        raizopr = new JLabel("=");
        raizopr.setBounds(331, 235, 20, 70);
        raizopr.setFont(new Font("Arial", Font.ITALIC, 20));
        raizopr.setForeground(Color.decode("#2D3A54"));
        add(raizopr);
        
        raizres = new JTextField("");
        raizres.setBounds(350, 260, 160 , 20);
        raizres.setFont(new Font("Arial", Font.ITALIC, 20));
        raizres.setForeground(Color.decode("#2D3A54"));
        raizres.setEditable(false);
        add(raizres);
        
    }
}
