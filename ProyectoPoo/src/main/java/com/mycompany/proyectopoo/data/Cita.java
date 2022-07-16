/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.data;

import com.mycompany.proyectopoo.data.Empleado;

/**
 *
 * @author Juan Mayancela
 */
public class Cita {
    
    private String fecha;
    private String hora;
    private int citasPendientes;
    private Empleado perEncargada; 

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCitasPendientes() {
        return citasPendientes;
    }

    public void setCitasPendientes(int citasPendientes) {
        this.citasPendientes = citasPendientes;
    }

    public Empleado getPerEncargada() {
        return perEncargada;
    }

    public void setPerEncargada(Empleado perEncargada) {
        this.perEncargada = perEncargada;
    }

    public Cita(String fecha, String hora, int citasPendientes, Empleado perEncargada) {
        this.fecha = fecha;
        this.hora = hora;
        this.citasPendientes = citasPendientes;
        this.perEncargada = perEncargada;
    }
    
     public void crearCita() {
        
    }
     
     public void eliminarCita() {
        
    }
     
     public void consultarCita(String fechaConsultar) {
         if(fecha.equals(fechaConsultar)){
             System.out.println("");
         
         }
        
    }
    
    
    
}
