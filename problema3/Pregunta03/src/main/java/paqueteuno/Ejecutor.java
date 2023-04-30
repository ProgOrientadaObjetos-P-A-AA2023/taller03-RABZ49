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
        System.out.println("-----------------------------------------------");

        ai.establecerPresupuesto(numeroAlumnos, gastosEstudiantes);
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
                ai.obtenerPresupuesto());
        AdminisrarInstituciones ai2 = new AdminisrarInstituciones();
        
        String nombre2 = "Bernardo Valdivieso";
        String tipo2 = "Publica";
        int numeroAlumnos2 = 600;
        int numeroDocentes2 = 40;
        int sedes2 = 8;
        double gastosEstudiantes2 = 200;
        ai2.establecerNombre(nombre2);
        ai2.establecerTipo_de_institución(tipo2);
        ai2.establecerNúmero_de_alumnos(numeroAlumnos2);
        ai2.establecerNúmero_de_docentes(numeroDocentes2);
        ai2.establecerNúmero_de_sedes(sedes2);

        ai2.establecerGastos_proyectado_por_estudiante(gastosEstudiantes2);
        System.out.println("-----------------------------------------------");

        ai2.establecerPresupuesto(numeroAlumnos2, gastosEstudiantes2);
        System.out.printf("""
                           Nombre de la institucion:           %s 
                           Tipo de instiucion:                 %s 
                           Numero de alumnos:                  %d 
                           Numero de docentes:                 %d 
                           Numero de sedes:                    %d 
                           Gastos proyectados por estudiante:  %.1f 
                           Presupuesto:                        %.1f 
                          """, ai2.obtenerNombre(),
                ai2.obtenerTipo_de_institución(),
                ai2.obtenerNúmero_de_alumnos(),
                ai2.obtenerNúmero_de_docentes(),
                ai2.obtenerNúmero_de_sedes(),
                ai2.obtenerGastos_proyectado_por_estudiante(),
                ai2.obtenerPresupuesto());
    }
}
