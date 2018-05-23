/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezdominguez
 */
public class Boletin71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean opcionNoElegida = false;
        do{
        String res = JOptionPane.showInputDialog(null, "MENU\nElija una opción:\nA)Celsius a Farenheit\nB)Farenheit a Celsius");
        switch(String.valueOf(res)){
            case "A":
                JOptionPane.showMessageDialog(null,"Ha elegido cambiar celsius a farenheit");
                Temperatura obx = new Temperatura();
                obx.setC();
                obx.celsiusAFarenheit(obx.getC());
                JOptionPane.showMessageDialog(null, "Los "+obx.getC()+" grados celsius son "+obx.getF()+" grados farenheit");
                break;
                 
            case "B":
                JOptionPane.showMessageDialog(null,"Ha elegido cambiar farenheit a celsius");
                Temperatura obx2 = new Temperatura();
                obx2.setF();
                obx2.farenheitACelsius(obx2.getF());
                JOptionPane.showMessageDialog(null, "Los "+obx2.getF()+" grados farenheit son "+obx2.getC()+" grados celsius");
                break;
           
            default:JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                opcionNoElegida = true;
        }
        }while(opcionNoElegida);
        
        
        
        
    }
    
}
