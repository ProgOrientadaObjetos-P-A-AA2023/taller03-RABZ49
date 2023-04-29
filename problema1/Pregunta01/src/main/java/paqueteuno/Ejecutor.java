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
        Terreno calculos = new Terreno();
        
        double ancho = 100;
        double largo = 300;

        double valorMetroCuadrado = 100;

        dt.establecerancho(ancho);
        dt.establecerlargo(largo);

        dt.establecervalorMetroCuadrado(valorMetroCuadrado);
        calculos.establecercalculararea(ancho, largo);
        calculos.establecerCostoTerreno(ancho, valorMetroCuadrado);
        System.out.printf("""
                          Ancho del terreno:         %.2f.
                          Largo del terreno:         %.2f.
                          Valor del metro cuadrado:  %.2f .
                          Area: del terreno:         %.2f metros cuadrados.
                          Costo del terreno:         %.2f.
                          """, dt.obtenerancho(), dt.obtenerlargo(),
                dt.obtenervalorMetroCuadrado(), calculos.obtenerarea(),
                calculos.obtenerCostoTerreno());
    }
}
