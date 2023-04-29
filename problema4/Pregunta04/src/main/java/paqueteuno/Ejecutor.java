/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.CaracteristicasCelular;

/**
 *
 * @author busta
 */
public class Ejecutor {

    public static void main(String[] args) {
        CaracteristicasCelular cc = new CaracteristicasCelular();
        CaracteristicasCelular Calculos = new CaracteristicasCelular();
        String sistema_operativo = "androit";
        double tamaño_de_pantalla = 6.5;
        double costo_inicial = 230;
        int iva_en_porcentaje = 12;
        String dirección_mac = "1046";
        String información_IMEI = "2678";
        cc.establecerSistema_operativo(dirección_mac);
        cc.establecerTamaño_de_pantalla(tamaño_de_pantalla);
        cc.establecerCosto_inicial(costo_inicial);
        cc.establecerIva_en_porcentaje(iva_en_porcentaje);
        cc.establecerDirección_mac(dirección_mac);
        cc.establecerInformación_IMEI(información_IMEI);
        cc.establecerIvadelcostofinal(iva_en_porcentaje, costo_inicial);
        System.out.printf("""
                          Sistema operativo:             %s 
                           Tamaño de pantalla:           %.0f 
                           Costo inicial:                %.0f 
                           Iva en porcentaje:            %d
                           Direccion mac:                %s 
                           Informacion IMEI:             %s 
                           Costo final con iva aplicado: %.1f 
                           """, cc.obtenerSistema_operativo(),
                cc.obtenerTamaño_de_pantalla(),
                cc.obtenerCosto_inicial(),
                cc.obtenerIva_en_porcentaje(),
                cc.obtenerDirección_mac(),
                cc.obtenerInformación_IMEI(),
                cc.obtenerIvadelcostofinal());
    }
}
