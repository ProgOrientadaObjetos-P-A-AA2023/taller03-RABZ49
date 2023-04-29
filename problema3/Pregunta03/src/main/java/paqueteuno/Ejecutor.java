/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.AdminisrarInstituciones;

/**
 *
 * @author busta
 */
public class Ejecutor {

    public static void main(String[] args) {
        AdminisrarInstituciones ai = new AdminisrarInstituciones();
        AdminisrarInstituciones calculos = new AdminisrarInstituciones();
        String nombre = "Don Hernesto Cueva";
        String tipo = "Publica";
        int numeroAlumnos = 500;
        int numeroDocentes = 30;
        int sedes = 4;
        double gastosEstudiantes = 100;
        ai.establecerNombre(nombre);
        ai.establecerTipo_de_institución(tipo);
        ai.establecerNúmero_de_alumnos(numeroAlumnos);
        ai.establecerNúmero_de_docentes(numeroDocentes);
        ai.establecerNúmero_de_sedes(sedes);

        ai.establecerGastos_proyectado_por_estudiante(gastosEstudiantes);

        calculos.establecerPresupuesto(numeroAlumnos, gastosEstudiantes);
        System.out.printf("""
                           Nombre de la institucion:           %s 
                           Tipo de instiucion:                 %s 
                           Numero de alumnos:                  %d 
                           Numero de docentes:                 %d 
                           Numero de sedes:                    %d 
                           Gastos proyectados por estudiante:  %.1f 
                           Presupuesto:                        %.1f 
                          """, ai.obtenerNombre(),
                ai.obtenerTipo_de_institución(),
                ai.obtenerNúmero_de_alumnos(),
                ai.obtenerNúmero_de_docentes(),
                ai.obtenerNúmero_de_sedes(),
                ai.obtenerGastos_proyectado_por_estudiante(),
                calculos.obtenerPresupuesto());
    }
}
