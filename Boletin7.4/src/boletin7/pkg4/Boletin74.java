/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg4;

import java.util.Scanner;

/**
 *
 * @author jdominguezdominguez
 */
public class Boletin74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria obx = new ContaBancaria();
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca o numero de conta");
        obx.setNumConta(sc.nextLine());
        System.out.println("Introduzca o nome do titular");
        obx.setTitular(sc.nextLine());
        System.out.println("Introduzca o saldo");
        obx.setSaldo(sc.nextFloat());
        System.out.println("Introduzca la cantidad que desea ingresar");
        obx.ingresar(sc.nextFloat());
        System.out.println("Introduzca la cantidad que desea retirar");
        obx.retirar(sc.nextFloat());
        obx.arruinar(obx.getNumConta(), obx.getTitular(), obx.getSaldo());
        System.out.println(obx.toString());
    }
    
}
