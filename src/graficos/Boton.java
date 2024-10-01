/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.SwingConstants;

/**
 *
 * @author david
 */
public class Boton extends JButton{
    private static final int ANCHO = 150;
    private static final int ALTO = 30;
    private static final int COORDENADAX = 125;
    private static final int COORDENADAY = 150;
    
    public Boton(){
        setText("Haz clic en mí");
        setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
        setHorizontalAlignment(SwingConstants.CENTER);
        setVisible(true);
    }   
}