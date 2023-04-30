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
        
        double horas = 24;
        tt.establecerTiempo(horas);
        tt.establecerSegundos(horas);
        tt.establecerMinutos(horas);
        tt.establecerDias(horas);
        System.out.println("-----------------------------------------------");
        System.out.printf("""
                          segundos:  %.2f.
                          minutos:   %.2f.
                          horas:     %.2f.
                          dias:      %.2f.
                         
                          """, tt.obtenerSegundos(),
                tt.obtenerMinutos(), tt.obtenerTiempo(),
                tt.obtenerDias());
        EquivalenteHora tt2 = new EquivalenteHora();
        
        double horas2 = 48;
        tt2.establecerTiempo(horas2);
        tt2.establecerSegundos(horas2);
        tt2.establecerMinutos(horas2);
        tt2.establecerDias(horas2);
        System.out.println("-----------------------------------------------");
        System.out.printf("""
                          segundos:  %.2f.
                          minutos:   %.2f.
                          horas:     %.2f.
                          dias:      %.2f.
                         
                          """, tt2.obtenerSegundos(),
                tt2.obtenerMinutos(), tt2.obtenerTiempo(),
                tt2.obtenerDias());
    }
}
