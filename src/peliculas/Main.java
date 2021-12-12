/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import javax.swing.JOptionPane;
/**
 *
 * @author Luis Timana
 */
public class Main {
    
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog(
                null,
                "Ingrese texcto",
                "Entrada",
                3
        );
        
        JOptionPane.showMessageDialog(
                null, 
                valor,
                "Mi mensaje",
                2
        );
        
    }
    
}
