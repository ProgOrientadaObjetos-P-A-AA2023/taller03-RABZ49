/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class AdminisrarInstituciones {

    private String nombre;
    private String tipo_de_institución;
    private int número_de_alumnos;
    private int número_de_docentes;
    private int número_de_sedes;
    private double gastos_proyectado_por_estudiante;
            
    private double presupuesto;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public String obtenerTipo_de_institución() {
        return tipo_de_institución;
    }

    public void establecerTipo_de_institución(String x) {
        tipo_de_institución = x;
    }

    public int obtenerNúmero_de_alumnos() {
        return número_de_alumnos;
    }

    public void establecerNúmero_de_alumnos(int x) {
        número_de_alumnos = x;
    }

    public int obtenerNúmero_de_docentes() {
        return número_de_docentes;
    }

    public void establecerNúmero_de_docentes(int x) {
        número_de_docentes = x;
    }

    public int obtenerNúmero_de_sedes() {
        return número_de_sedes;
    }

    public void establecerNúmero_de_sedes(int x) {
        número_de_sedes = x;
    }

    public double obtenerGastos_proyectado_por_estudiante() {
        return gastos_proyectado_por_estudiante;
    }

    public void establecerGastos_proyectado_por_estudiante(double x) {
        gastos_proyectado_por_estudiante = x;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public void establecerPresupuesto(double x, double y) {
        presupuesto = x * y;
    }

}
