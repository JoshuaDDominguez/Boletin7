/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg3;

/**
 *
 * @author jdominguezdominguez
 */
public class Rebaixas {
    public int prezo;//prezo original
    public int prezor;//prezo rebajado

    public Rebaixas() {
    }

    public int getPrezo() {
        return prezo;
    }

    public int getPrezor() {
        return prezor;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public void setPrezor(int prezor) {
        this.prezor = prezor;
    }
    
    public int calcularPorcentaxe(int prezo, int prezor){
        int porcentaxeprezor = (prezor*100)/prezo;
        int porcentaxereal = 100-porcentaxeprezor;
        return porcentaxereal;
    }
    
}
