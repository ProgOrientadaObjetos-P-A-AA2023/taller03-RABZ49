/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class EquivalenteHora {

    private double horas;
    
    private double minutos;
    private double segundos;
    private double dias;

    public void establecerTiempo(double x) {
        horas = x;

    }

    public double obtenerTiempo() {
        return horas;
    }

    public void establecerMinutos(double x) {
        minutos = x * 60;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public void establecerSegundos(double x) {
        segundos = x * 3600;
    }

    public double obtenerSegundos() {
        return segundos;
    }

    public void establecerDias(double x) {
        dias = x / 24;
    }

    public double obtenerDias() {
        return dias;
    }
}
