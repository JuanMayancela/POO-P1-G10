/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.data;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private String datosRepresentante;
   
    //lista de clientes
    
    
    //Constructor
    
     public Cliente(){
         super("","","","");
    
    }

    public Cliente(String cedula, String nombre, String telefono, String email, String datosRepresentante){
        super(nombre,email, cedula, telefono);//constructor de la clase Persona

        this.datosRepresentante = datosRepresentante;
    }
    
    @Override
      public String toString() {
       return String.format("Nombre: %s ,email: %s ,cedula: %s ,telefono: %s ,datosRepresentante: %s", 
            nombre, email, cedula, telefono, datosRepresentante); 
      
    }
    
    public String getDatosRepresentante(){
        return datosRepresentante;
    }
    public void setDatosRepresentante(String datosRepresentante){
        this.datosRepresentante = datosRepresentante;
    }
    
}
