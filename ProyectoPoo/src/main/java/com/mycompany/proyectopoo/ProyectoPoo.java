/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectopoo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoPoo {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //menu
    System.out.println("""
                       1.Servicios
                       2.Empleados
                       3.Clientes
                       4.Citas
                       5.Atenciones
                       6.Salir""");
    String opcion = null;
    do{
        opcion = input.nextLine();
        //opcion 1 Servicios
        switch(opcion){
            case "1": Servicio.);
                //Recorro la lista con los objetos de clase Servicio
                for(Servicio servicio: servicios){
                    System.out.println(servicio);//muestro cada uno de los servicios
                }
        }
    }
    

    //opcion 2 Empleados
    if(opcion == "2"){
        //Recorro la lista con los objetos de clase Empleado
        for(Empleado empleado: empleados){
            System.out.println(empleado);//muestro cada uno de los empleados
        }
        
    }
    //opcion 3 Clientes
    else if(opcion == "3"){
        //Recorro la lista con los objetos de clase Cliente
        for(Cliente cliente: clientes){
            System.out.println(cliente);//muestro cada uno de los clientes
        }
        
    }
    //opcion 4 Citas
    else if(opcion == "4"){
      System.out.println("""
                         1. Crear Cita
                         2. Eliminar Cita
                         3. COnsultar citas for fecha""");
    }

    
    //opcion 5 Atenciones
    else if(opcion == "5"){
      System.out.println("""
                         1. Registrar atención
                         2. Consultar atención""");
    }
    
    
    //opcion 6 Salir
    else if(opcion == "6"){
      System.out.println("Gracias por su visita");
    }
    input.close();
  }
}
