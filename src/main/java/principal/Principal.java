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
        
        int option = -1;
        
        while (option != 99){
            
            option = Integer.parseInt(JOptionPane.showInputDialog("Menu de Opções\n"
                    + "1 - Setar Tempo\n"
                    + "2 - Mostrar o tempo\n"
                    + "3 - Tempo em segundos\n"
                    + "99 - Sair"));
            
            if (option == 1){
                rel1.setHora(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora: ")));
                rel1.setMinuto(Integer.parseInt(JOptionPane.showInputDialog("Digite a minuto: ")));
                rel1.setSegundo(Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo: ")));
            }
            if (option == 2){
                JOptionPane.showMessageDialog(null, rel1.getTempo());
            }
            if (option == 3){
                JOptionPane.showMessageDialog(null, rel1.getSegundos());
            }
        }
    }
}