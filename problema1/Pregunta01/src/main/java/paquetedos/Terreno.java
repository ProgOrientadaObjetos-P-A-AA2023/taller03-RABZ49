/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Terreno {

    
    private double largo;
    private double ancho;
    private double valorMetroCuadrado;
    
    private double costo_terreno;
    private double area;
    



    public void establecerlargo(double x) {
        largo = x;
    }

        public double obtenerlargo() {
        return largo;
    }

    public void establecerancho(double x) {
        ancho = x;
    }

    public double obtenerancho() {
        return ancho;
    }

        public void establecerCostoTerreno(double x, double y) {
        costo_terreno = x * y;
    }

    public double obtenerCostoTerreno() {
        return costo_terreno;
    }

    public void establecercalculararea(double x, double y) {
        area = x * y;
    }
    public double obtenercalculararea() {
        return area;
    }
    public void establecearea(double x) {
        area = x;
    }

    public double obtenerarea() {
        return area;
    }

    public void establecervalorMetroCuadrado(double x) {
        valorMetroCuadrado = x;
    }

    public double obtenervalorMetroCuadrado() {
        return valorMetroCuadrado;
    }
}

