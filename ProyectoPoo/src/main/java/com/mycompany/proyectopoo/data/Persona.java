/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.data;

/**
 *
 * @author Usuario
 */
public abstract class Persona {

    protected String nombre, email;
    protected String cedula, telefono;

    public Persona(String nombre, String email, String cedula, String telefono) {

        this.nombre = nombre;
        this.email = email;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public abstract void agregarPersona(){
        
    }
    
    public abstract void editarPersona(){
        
    }
}
