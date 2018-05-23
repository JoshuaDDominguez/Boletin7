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
public class Temperatura {
        double C,F;

    public Temperatura() {
    }

    public double getF() {
        return F;
    }

    public double getC() {
        return C;
    }

    public void setC() {
        C = Float.parseFloat(JOptionPane.showInputDialog("Introduce los celsius"));
    }

    public void setF() {
        F= Float.parseFloat(JOptionPane.showInputDialog("Introduce los Farenheit"));
    }
    
    public double celsiusAFarenheit(double C){
        return F = 1.8 * C + 32; 
    }
    public double farenheitACelsius(double F){
        return C = ( F - 32 ) / 1.8;
    }
}
