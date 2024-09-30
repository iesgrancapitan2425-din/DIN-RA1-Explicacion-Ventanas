/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

/**
 *
 * @author david
 */
public class Etiqueta extends JLabel{
    private static final int ANCHO = 400;
    private static final int ALTO = 30;
    private static final int COORDENADAX = 0;
    private static final int COORDENADAY = 30;
    
    
    
    public Etiqueta(){
        setText("¡Hola!, soy una etiqueta");
        setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        //setBounds(COORDENADAX,COORDENADAY,ANCHO,ALTO);
        //setSize(ANCHO,ALTO);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVisible(true);
    }
}
