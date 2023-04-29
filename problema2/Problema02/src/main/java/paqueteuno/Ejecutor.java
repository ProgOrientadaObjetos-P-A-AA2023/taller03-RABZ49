/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.EquivalenteHora;

/**
 *
 * @author busta
 */
public class Ejecutor {

    public static void main(String[] args) {
        EquivalenteHora tt = new EquivalenteHora();
        EquivalenteHora calculos = new EquivalenteHora();
        double horas = 24;
        tt.establecerTiempo(horas);
        calculos.establecerSegundos(horas);
        calculos.establecerMinutos(horas);
        calculos.establecerDias(horas);
        System.out.printf("""
                          segundos:  %.2f.
                          minutos:   %.2f.
                          horas:     %.2f.
                          dias:      %.2f.
                         
                          """, calculos.obtenerSegundos(),
                calculos.obtenerMinutos(), tt.obtenerTiempo(),
                calculos.obtenerDias());
    }
}
