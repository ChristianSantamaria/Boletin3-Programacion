package boletin3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csantamariacameselle
 */
public class Consumo {
    private int km;
    private float litros;
    private float vMed;
    private float pGas;

public Consumo(int kmp, float litrosp, float vMedp,float pGasp){
   
    km = kmp;
    litros = litrosp;
    vMed = vMedp;
    pGas = pGasp;
    
}

public Consumo(){
   
    km = 0;
    litros = 0;
    vMed = 0;
    pGas = 0;
    
}
    
public float getTempo(){
    return vMed * km;
}  

public void consumoMedio(){
    System.out.println("El consumo medio en litros es: " + (100 * litros) / km);
}  

public void consumoEuros(){
    System.out.println("El consumo medio en euros es: " + litros * pGas + "€");
}  

public void setKms(int nuevo){
    km = nuevo;
}  

public void setLitros(float nuevo){
    litros = nuevo;
}  

public void setvMed(float nuevo){
    vMed = nuevo;
}  

public void setPGas(float nuevo){
    pGas = nuevo;
}    

public void getvMed(){
    System.out.println("La velocidad media es: " + vMed);
}


}