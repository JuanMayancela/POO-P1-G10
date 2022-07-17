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
    
    //Constructor
    public Empleado(String cedula, String nombre,String telefono, String email, String estado) {
        super(nombre, email, cedula, telefono);//llamamos  al constructor de la clase Padre que es Persona mediante super()
        this.estado = estado;
    }
    
    //Se sobreescribe el metodo toString()
    @Override
    public String toString() {
        //Agregamos al metodo toString de la clase Padre el estado del Empleado
        return super.toString()+", Estado: "+estado;
    }
}
