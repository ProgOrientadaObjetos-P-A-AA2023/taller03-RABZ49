/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class CaracteristicasCelular {

    private String sistema_operativo;
    private double tamaño_de_pantalla;
    private double costo_inicial;
    private String dirección_mac;
    private String información_IMEI;
    private int iva_en_porcentaje;
    
    private double iva_del_costo_inicial_costo_final;

    public String obtenerSistema_operativo() {
        return sistema_operativo;
    }

    public void establecerSistema_operativo(String x) {
        sistema_operativo = x;
    }

    public double obtenerTamaño_de_pantalla() {
        return tamaño_de_pantalla;
    }

    public void establecerTamaño_de_pantalla(double x) {
        tamaño_de_pantalla = x;
    }

    public double obtenerCosto_inicial() {
        return costo_inicial;
    }

    public void establecerCosto_inicial(double x) {
        costo_inicial = x;
    }

    public int obtenerIva_en_porcentaje() {
        return iva_en_porcentaje;
    }

    public void establecerIva_en_porcentaje(int x) {
        iva_en_porcentaje = x;
    }

    public double obtenerIvadelcostofinal() {
        return iva_del_costo_inicial_costo_final;
    }

    public void establecerIvadelcostofinal(double x, double y) {
        iva_del_costo_inicial_costo_final = (x * y) / 100 + y;
    }

    public String obtenerDirección_mac() {
        return dirección_mac;
    }

    public void establecerDirección_mac(String x) {
        dirección_mac = x;
    }

    public String obtenerInformación_IMEI() {
        return información_IMEI;
    }

    public void establecerInformación_IMEI(String x) {
        información_IMEI = x;
    }

}
