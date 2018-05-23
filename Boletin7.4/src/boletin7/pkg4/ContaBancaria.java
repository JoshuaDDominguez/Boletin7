/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg4;

/**
 *
 * @author jdominguezdominguez
 */
public class ContaBancaria {
    public String numConta;
    public String titular;
    public float saldo;
    
    public ContaBancaria() {
    }

    public ContaBancaria(String numConta, String titular, float saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void ingresar(float cantidad){
        saldo= saldo+cantidad;
    }
    public void retirar(float cantidad){
        if(cantidad>saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo=saldo-cantidad;
        }

    }
        public void arruinar(String numConta, String titular, float saldo){
        numConta=null;
        titular=null;
        saldo=0;
    }

    public String toString() {
        return "ContaBancaria{" + "numConta=" + numConta + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    
    
}
