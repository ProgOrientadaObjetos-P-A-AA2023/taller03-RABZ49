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
        System.out.println("-----------------------------------------------");
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
        CaracteristicasCelular cc2 = new CaracteristicasCelular();
        
        String sistema_operativo2 = "androit";
        double tamaño_de_pantalla2 = 7.5;
        double costo_inicial2 = 330;
        int iva_en_porcentaje2 = 12;
        String dirección_mac2 = "1146";
        String información_IMEI2 = "2656";
        cc2.establecerSistema_operativo(dirección_mac2);
        cc2.establecerTamaño_de_pantalla(tamaño_de_pantalla2);
        cc2.establecerCosto_inicial(costo_inicial2);
        cc2.establecerIva_en_porcentaje(iva_en_porcentaje2);
        cc2.establecerDirección_mac(dirección_mac2);
        cc2.establecerInformación_IMEI(información_IMEI2);
        cc2.establecerIvadelcostofinal(iva_en_porcentaje2, costo_inicial2);
        System.out.println("-----------------------------------------------");
        System.out.printf("""
                          Sistema operativo:             %s 
                           Tamaño de pantalla:           %.0f 
                           Costo inicial:                %.0f 
                           Iva en porcentaje:            %d
                           Direccion mac:                %s 
                           Informacion IMEI:             %s 
                           Costo final con iva aplicado: %.1f 
                           """, cc2.obtenerSistema_operativo(),
                cc2.obtenerTamaño_de_pantalla(),
                cc2.obtenerCosto_inicial(),
                cc2.obtenerIva_en_porcentaje(),
                cc2.obtenerDirección_mac(),
                cc2.obtenerInformación_IMEI(),
                cc2.obtenerIvadelcostofinal());
    }
}
