/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg2;

/**
 *
 * @author jdominguezdominguez
 */
public class Coche {
    public int velocidade=0;
    public int acelerar,frenar;
    public Coche() {
    }
    
    public int getVelocidade(){
        return velocidade;
    }

    public void setAcelerar(int acelerar) {
        this.acelerar = acelerar;
    }

    public void setFrenar(int frenar) {
        this.frenar = frenar;
    }

    public int getAcelerar() {
        return acelerar;
    }

    public int getFrenar() {
        return frenar;
    }
    
    public void acelerar(int acelerar){
        velocidade=velocidade+acelerar;
    }
    
    public void frena (int frenar){
        velocidade=velocidade-frenar;
    }
}
