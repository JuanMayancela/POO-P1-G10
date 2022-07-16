/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.data;

import com.mycompany.proyectopoo.data.Empleado;
import com.mycompany.proyectopoo.data.Servicio;
/**
 *
 * @author mamay
 */
public class Atencion {
    private String duracionAtencion;
    private Servicio registroServicio;
    private Empleado empleadoAtencion; 
    
    //Getters y setters
    public String getDuracionAtencion() {
        return duracionAtencion;
    }

    public void setDuracionAtencion(String duracionAtencion) {
        this.duracionAtencion = duracionAtencion;
    }

    public Servicio getRegistroServicio() {
        return registroServicio;
    }

    public void setRegistroServicio(Servicio registroServicio) {
        this.registroServicio = registroServicio;
    }

    public Empleado getEmpleadoAtencion() {
        return empleadoAtencion;
    }

    public void setEmpleadoAtencion(Empleado empleadoAtencion) {
        this.empleadoAtencion = empleadoAtencion;
    }
    //Constructor
    public Atencion(String duracionAtencion, Servicio registroServicio, Empleado empleadoAtencion) {
        this.duracionAtencion = duracionAtencion;
        this.registroServicio = registroServicio;
        this.empleadoAtencion = empleadoAtencion;
    }
    
}
