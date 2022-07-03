/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private String datosRepresentante;
    
    //Constructor
    public Cliente(char cedula, String nombre, char telefono, String email, String datosRepresentante){
        super(cedula, nombre, telefono, email);//constructor de la clase Persona
        this.datosRepresentante = datosRepresentante;
    }
    
    public String getDatosRepresentante(){
        return datosRepresentante;
    }
    public void setDatosRepresentante(String datosRepresentante){
        this.datosRepresentante = datosRepresentante;
    }
    
}
