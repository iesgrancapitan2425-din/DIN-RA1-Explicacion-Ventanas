/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.ImageIcon;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;

public class Ventana extends JFrame{
    private static final int ANCHO=400;
    private static final int ALTO= 300;
    
    public Ventana(){
        setSize(ANCHO,ALTO);
        setTitle("Ventana de prueba");
        setIconImage(new ImageIcon(getClass().getResource("hogar.png")).getImage());
        
        getContentPane().setLayout(new GridLayout(2,1));
        Etiqueta miEtiqueta = new Etiqueta();
        JPanel panel1 = (new JPanel());
        panel1.setLayout(new GridLayout(1,1));
        panel1.setBorder(BorderFactory.createEmptyBorder(40,40,10,40));
        panel1.add(miEtiqueta);
        getContentPane().add(panel1);
        Boton miBoton = new Boton();      
        
        JPanel panel2 = (new JPanel());
        panel2.setBorder(BorderFactory.createEmptyBorder(10,130,100,130));
        panel2.setLayout(new GridLayout(1,1));
        panel2.add(miBoton);
        getContentPane().add(panel2);
        
        miBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                float red = (float)Math.random();
                float green = (float)Math.random();
                float blue = (float)Math.random();
                miEtiqueta.setText("Has hecho clic");
                miEtiqueta.setForeground(new Color(red,green,blue));
                
            }});
        
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