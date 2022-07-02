/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {
    private String estado;
    
    //getset
    public String estado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void eliminarEmpleado(){
        estado = "Inactivo";
    }
}
