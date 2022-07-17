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
    private Empleado perEncargada;
    private Cliente cliente;
    private Servicio servicio;

    //set&get
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

    public Empleado getPerEncargada() {
        return perEncargada;
    }

    public void setPerEncargada(Empleado perEncargada) {
        this.perEncargada = perEncargada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }


    //constructor de clase
    public Cita(String fecha, String hora,Cliente cliente, Servicio servicio, Empleado perEncargada) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.servicio = servicio;
        this.perEncargada = perEncargada;
    }
    
    //Se sobreescribe el metodo toString()
    @Override
    public String toString() {
        return String.format("Fecha: %s ,Hora: %s , Cliente: %s , Servicio: %s , Persona Encargada: %s", 
            fecha, hora, cliente, servicio, perEncargada); 
    }
    
}
