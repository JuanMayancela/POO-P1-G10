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
   
    //Constructor

    public Cliente(String cedula, String nombre, String telefono, String email, String datosRepresentante){
        super(nombre,email, cedula, telefono);//constructor de la clase Persona

        this.datosRepresentante = datosRepresentante;
    }
    
    //Getters y setters
    public String getDatosRepresentante(){
        return datosRepresentante;
    }
    public void setDatosRepresentante(String datosRepresentante){
        this.datosRepresentante = datosRepresentante;
    }
    
    //Se sobreescribe el metodo toString()
    @Override
    public String toString() {
        //Se agrega al metodo toString de la clase Persona los datos del Representante del Cliente
        return super.toString()+"Datos Representante: "+datosRepresentante;
    }
}
