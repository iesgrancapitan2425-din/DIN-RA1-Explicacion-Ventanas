/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.lang.Math;

import java.awt.Color;

public class Ventana extends JFrame{
    private static final int ANCHO=400;
    private static final int ALTO= 300;
    
    public Ventana(){
        setSize(ANCHO,ALTO);
        setTitle("Ventana de prueba");
        setIconImage(new ImageIcon(getClass().getResource("hogar.png")).getImage());
        getContentPane().setLayout(null);
        Etiqueta miEtiqueta = new Etiqueta();
        Boton miBoton = new Boton();
        miBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                float red = (float)Math.random();
                float green = (float)Math.random();
                float blue = (float)Math.random();
                miEtiqueta.setText("Has hecho clic");
                miEtiqueta.setForeground(new Color(red,green,blue));
                
            }});
        getContentPane().add(miEtiqueta);
        getContentPane().add(miBoton);
        setVisible(true);
        
        initControllers();
    }
    
    private void initControllers(){
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent evt){
                System.out.println("La altura de mi Ventana es:"+evt.getComponent().getBounds().height);
                System.exit(0);
            }
        });
    }
}