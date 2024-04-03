/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import model.Relogio;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Relogio rel1 = new Relogio();
        
        rel1.setHora(Integer.parseInt(JOptionPane.showInputDialog("hora: ")));
        rel1.setMinuto(Integer.parseInt(JOptionPane.showInputDialog("minuto: ")));
        rel1.setSegundo(Integer.parseInt(JOptionPane.showInputDialog("segundos: ")));
        
        JOptionPane.showMessageDialog(null, rel1.getSegundos());
        int tempo1 = rel1.getSegundo();
        rel1.IncrementarSegundo();
        int tempo2 = rel1.getSegundo();
        JOptionPane.showMessageDialog(null, rel1.getSegundos());
        JOptionPane.showMessageDialog(null, (tempo2 - tempo1));
    }
}