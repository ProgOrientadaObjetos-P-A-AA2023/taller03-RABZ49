/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class FacturaTelefono {
    private String numeroTelefono;
    private double minutosMes;
    private double valorMinuto;
    private double valorFactura;
    
    public void establecerNumeroTelefono(String c){
        numeroTelefono = c;
    }
    
    public void establecerMinutosMes(double c){
        minutosMes = c;
    }
    
    public void establecerValorMinuto(double c){
        valorMinuto = c;
    }
    
    // public void establecerValorFactura(){
    public void calcularValorFactura(){
        valorFactura = minutosMes * valorMinuto;
    }
    
    public String obtenerNumeroTelefono(){
        return numeroTelefono;
    }
    
    public double obtenerMinutosMes(){
        return minutosMes;
    }
    
    public double obtenerValorMinuto(){
        return valorMinuto;
    }
    
    public double obtenerValorFactura(){
        return valorFactura;
    }
    
    
    
}
