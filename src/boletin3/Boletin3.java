/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A
        Consumo con1 = new Consumo();
        // B
        con1.setLitros(50);
        con1.setPGas(1.57f);
        // C
        Consumo con2 = new Consumo(100, 100f, 100f, 100f);
        // D
        con2.consumoMedio();
        // E
        con2.setLitros(200f);
        // F
        con2.getvMed();
    }
    
}
