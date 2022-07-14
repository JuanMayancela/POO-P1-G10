package com.mycompany.proyectopoo;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {
    private String estado;
    
    public Empleado(String nombre, String email, String cedula, String telefono, String estado){
        super(nombre, email, cedula, telefono);//constructor de la clase Persona
        this.estado = estado;
    }
    //getset
    public String estado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    //eliminar empleado pasa a ser inactivo
    public void eliminarEmpleado(){
        estado = "Inactivo";
    }
    //agregar empleado
    public void agregarEmpleado(){
        
    }
    //editarEmpleado
    public void editarEmpleado(){
        
    }
}
