/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.data;

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
    
    public Empleado(){
         super("","","","");
    
    }

    public Empleado(String cedula, String nombre,String telefono, String email, String estado) {
        super(nombre, email, cedula, telefono);
        this.estado = estado;
    }
    
    @Override
      public String toString() {
       return String.format("Nombre: %s ,email: %s ,cedula: %s ,telefono: %s ,estado: %s", 
            nombre, email, cedula, telefono, estado); 
      
    }
}
