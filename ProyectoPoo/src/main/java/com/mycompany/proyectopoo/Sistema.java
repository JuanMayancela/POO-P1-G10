/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author JuanMayancela
 */
public class Sistema {
    public static ArrayList<Empleado> empleados;
    public static ArrayList<Cliente> clientes;
    public static ArrayList<Servicio> servicios;
    
    //Metodo inicializar sistema
    public static void inicializarSistema(){
        //Empleado
        empleados = new ArrayList<>();
        Empleado e1 = new Empleado("0926441132", "Juan", "0985470321", "juangp20@gmail.com", "Activo");
        empleados.add(e1);
    
    }
    
    //Metodo salir del sistema
    public void salir(){
        System.out.println("Gracias por su visita");
    
    }
}
