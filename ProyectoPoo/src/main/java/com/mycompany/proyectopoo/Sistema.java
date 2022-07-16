/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;


import com.mycompany.proyectopoo.data.Cliente;
import com.mycompany.proyectopoo.data.Empleado;
import com.mycompany.proyectopoo.data.Servicio;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author JuanMayancela
 */
public class Sistema {
    public static List<Empleado> empleados;
    public static List<Cliente> clientes;
    public static List<Servicio> servicios;
    
    //Metodo inicializar sistema
    public static void inicializarSistema(){
        //Creamos los objetos y los agregamos a la lista que le corresponde
        //Empleado
        empleados = new ArrayList<>();
        Empleado empl = new Empleado("Juan", "juangp20@gmail.com", "0926441132", "0985470321" ,"Activo");
        empleados.add(empl);
        //clientes
        clientes = new ArrayList<>();
        Cliente c1 = new Cliente("Bruno", "elbruno@gmail.com", "0912345678", "0981234567" ,"info adicional");
        Cliente c2 = new Cliente("Samuel", "elsamuel@gmail.com", "0923452345", "0988888888" ,"info adicional");
        clientes.add(c1);
        clientes.add(c2);
        //servicios
        servicios = new ArrayList<>();
        Servicio serv1 = new Servicio("Terapia_de_Lenguaje", "1:00", 23.50, "Activo");
        Servicio serv2 = new Servicio("Terapia_de_Lenguaje", "2:30", 40.00, "Activo");
        Servicio serv3 = new Servicio("Terapia_Psicopedagogica", "3:00", 70.00, "Inactivo");
        servicios.add(serv1);
        servicios.add(serv2);
        servicios.add(serv3);
        
        
    }
    
    //Metodo salir del sistema
    public void salir(){
        System.out.println("Gracias por su visita");
    
    }
}
