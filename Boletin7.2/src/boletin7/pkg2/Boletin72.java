/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg2;

import java.util.Scanner;

/**
 *
 * @author jdominguezdominguez
 */
public class Boletin72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche obx = new Coche();
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca la aceleracion");
        obx.setAcelerar(sc.nextInt());
        obx.acelerar(obx.getAcelerar());
        System.out.println("Introduzca la cantidad de velocidad frenada");
        obx.frena(sc.nextInt());
        obx.frena(obx.getFrenar());
        System.out.println("Esta es su velocidad ahora mismo: "+obx.getVelocidade());
        
    }
    
}
