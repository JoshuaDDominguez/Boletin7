/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg3;

import java.util.Scanner;

/**
 *
 * @author jdominguezdominguez
 */
public class Boletin73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rebaixas obx = new Rebaixas();
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca o prezo do articulo");
        obx.setPrezo(sc.nextInt());
        System.out.println("Introduzca o prezo do articulo rebajado");
        obx.setPrezor(sc.nextInt());
        System.out.println("Este é o porcentaxe do desconto :"+obx.calcularPorcentaxe(obx.getPrezo(), obx.getPrezor()));

    }
    
}
