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
            case "1":
                //Recorro la lista con los objetos de clase Servicio
                for(Servicio servicio: servicios){
                    System.out.println(servicio);//muestro cada uno de los servicios
                }
                //Se podrán agregar servicios, editar y eliminar(Submenu)
                //submenu
                System.out.println("""
                       1.Agregar Servicios
                       2.Editar Servicios
                       3.Eliminar Servicios""");
                String opServ = null;
                do{
                    opServ = input.nextLine();
                switch(opServ){
                        case "1":
                        agregarServicio();
                        break;
                        case "2":
                        editarServicio();
                        break;
                        case "3":
                        eliminarServicio();
                        break;
                  }
                }
                break;
            case "2":
                //Recorro la lista con los objetos de clase Empleado
                for(Empleado empleado: empleados){
                    System.out.println(empleado);//muestro cada uno de los empleados
                }
                //Se podrán agregar empleados, editar y eliminar
                //submenu
                System.out.println("""
                       1.Agregar Empleados
                       2.Editar Empleados
                       3.Eliminar Empleados""");
                String opEmp = null;
                do{
                    opEmp = input.nextLine();
                switch(opEmp){
                        case "1":
                        agregarEmpleado();
                        break;
                        case "2":
                        editarEmpleado();
                        break;
                        case "3":
                        eliminarEmpleado();
                        break;
                  }                
                break;
           case "3":
                //Recorro la lista con los objetos de clase Cliente
                for(Cliente cliente: clientes){
                    System.out.println(cliente);//muestro cada uno de los clientes 
                }
                //Se podrán agregar clientes y editar (todos los campos menos la cédula) 
                //submenu
                System.out.println("""
                       1.Agregar Clientes
                       2.Editar Clientes""");
                String opCl = null;
                do{
                    opCl = input.nextLine();
                switch(opCl){
                        case "1":
                        agregarCliente();
                        break;
                        case "2":
                        editarCliente();
                        break;
                  }   
                break;
    }
    

    }
    //opcion 4 Citas
    if(opcion == "4"){
      System.out.println("""
                         1. Crear Cita
                         2. Eliminar Cita
                         3. COnsultar citas for fecha""");
    }

    
    //opcion 5 Atenciones
    if(opcion == "5"){
      System.out.println("""
                         1. Registrar atención
                         2. Consultar atención""");
    }
    
    
    //opcion 6 Salir
    if(opcion == "6"){
      System.out.println("Gracias por su visita");
    }
    input.close();
  }
}
