/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.data;

import com.mycompany.proyectopoo.data.Empleado;

/**
 *
 * @author mamay
 */
public class Atencion {
    private String duracionAtencion;
    private String registroServicio;
    private Empleado empleadoAtencion; 

    public String getDuracionAtencion() {
        return duracionAtencion;
    }

    public void setDuracionAtencion(String duracionAtencion) {
        this.duracionAtencion = duracionAtencion;
    }

    public String getRegistroServicio() {
        return registroServicio;
    }

    public void setRegistroServicio(String registroServicio) {
        this.registroServicio = registroServicio;
    }

    public Empleado getEmpleadoAtencion() {
        return empleadoAtencion;
    }

    public void setEmpleadoAtencion(Empleado empleadoAtencion) {
        this.empleadoAtencion = empleadoAtencion;
    }

    public Atencion(String duracionAtencion, String registroServicio, Empleado empleadoAtencion) {
        this.duracionAtencion = duracionAtencion;
        this.registroServicio = registroServicio;
        this.empleadoAtencion = empleadoAtencion;
    }
    
     public void registrarAtencion() {
        
    }
    //Hacemos sobrecarga de metodos
    //Consultar atencion con la cedula del empleado
     public void consultarAtencion() {
        
    }
    //Consultar atencion con la cedula del cliente
    //public void consultarAtencion() {
        
    //}
    //Consultar atencion con la fecha
    //public void consultarAtencion() {
        
   // }
    
    
}
