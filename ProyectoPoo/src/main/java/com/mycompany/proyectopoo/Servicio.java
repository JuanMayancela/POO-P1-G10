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
    private nomServicio nomServicio;
    private String duAtencion;
    private double precio;
    private String estado;
    
// getters y setters
    public nomServicio getNomServicio() {
        return nomServicio;
    }

    public void setNomServicio(nomServicio nomServicio) {
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
    public Servicio(nomServicio nomServicio, String duAtencion, double precio, String estado) {
        this.nomServicio = nomServicio;
        this.duAtencion = duAtencion;
        this.precio = precio;
        this.estado = estado;
    }
    
    //Metodo agregar Servicio
    public void agregarServicio(){
    
    }
    
    //Metodo editar Servicio
    public void editarServicio(){
    
    }
    
    //Metodo eliminar Servicio
    public void eliminarServicio(){
     estado = "Inactivo";
    }
    
    
}
