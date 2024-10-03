/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 *
 * @author rex_a
 */
public class BotonAddEventListener implements ActionListener{
   private Etiqueta miEtiqueta;
   public BotonAddEventListener(Etiqueta miEtiqueta){
       
   }
    
   @Override 
   public void actionPerformed(ActionEvent ae){
       float red = (float)Math.random();
       float green = (float)Math.random();
       float blue = (float)Math.random();
       miEtiqueta.setText("Has hecho clic");
       miEtiqueta.setForeground(new Color(red,green,blue));  
   }
}
