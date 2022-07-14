/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;
 

/**
 *
 * @author JuanMayancela
 */
public class Servicio {
    private String nomServicio;
    private String duAtencion;
    private double precio;
    private String estado;
    
// getters y setters
    public String getNomServicio() {
        return nomServicio;
    }

    public void setNomServicio(String nomServicio) {
        this.nomServicio = nomServicio;
    }

    public String getDuAtencion() {
        return duAtencion;
    }

    public void setDuAtencion(String duAtencion) {
        this.duAtencion = duAtencion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  //Constructor
    public Servicio(String nomServicio, String duAtencion, double precio, String estado) {
        this.nomServicio = nomServicio;
        this.duAtencion = duAtencion;
        this.precio = precio;
        this.estado = estado;
    }
    
    //Metodo agregar Servicio
    public void agregarServicio(){
    
    }
    public void agregarServicio(Servicio s){
        
    }
    //Metodo editar Servicio
    public void editarServicio(){
    
    }
    
        @Override
    public String toString() {
        return "Servicios{" +
                "name='" + nomServicio + '\'' +
                ", duration='" + duAtencion + '\'' +
                ", price='" + precio + '\'' +
                ", state='" + estado + '\'' +
                '}';
    }
    //Metodo eliminar Servicio
    public void eliminarServicio(){
     estado = "Inactivo";
    }
    
    
}
