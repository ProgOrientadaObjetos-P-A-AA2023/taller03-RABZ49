/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Terreno;

/**
 *
 * @author busta
 */
public class Ejecutor {

    public static void main(String[] args) {

        Terreno dt = new Terreno();
        
        
        double ancho = 100;
        double largo = 300;

        double valorMetroCuadrado = 100;

        dt.establecerancho(ancho);
        dt.establecerlargo(largo);

        dt.establecervalorMetroCuadrado(valorMetroCuadrado);
        dt.establecercalculararea(ancho, largo);
        dt.establecerCostoTerreno(ancho, valorMetroCuadrado);
        System.out.println("----------------------------------------------");
        System.out.printf("""
                          Ancho del terreno:         %.2f.
                          Largo del terreno:         %.2f.
                          Valor del metro cuadrado:  %.2f .
                          Area: del terreno:         %.2f metros cuadrados.
                          Costo del terreno:         %.2f.
                          """, dt.obtenerancho(), dt.obtenerlargo(),
                dt.obtenervalorMetroCuadrado(), dt.obtenerarea(),
                dt.obtenerCostoTerreno());
        Terreno dt2 = new Terreno();
        
        
        double ancho2 = 400;
        double largo2 = 500;

        double valorMetroCuadrado2 = 100;

        dt2.establecerancho(ancho2);
        dt2.establecerlargo(largo2);

        dt2.establecervalorMetroCuadrado(valorMetroCuadrado2);
        dt2.establecercalculararea(ancho2, largo2);
        dt2.establecerCostoTerreno(ancho2, valorMetroCuadrado2);
        System.out.println("----------------------------------------------");
        System.out.printf("""
                          Ancho del terreno:         %.2f.
                          Largo del terreno:         %.2f.
                          Valor del metro cuadrado:  %.2f .
                          Area: del terreno:         %.2f metros cuadrados.
                          Costo del terreno:         %.2f.
                          """, dt2.obtenerancho(), dt2.obtenerlargo(),
                dt2.obtenervalorMetroCuadrado(), dt2.obtenerarea(),
                dt2.obtenerCostoTerreno());
    }
}
