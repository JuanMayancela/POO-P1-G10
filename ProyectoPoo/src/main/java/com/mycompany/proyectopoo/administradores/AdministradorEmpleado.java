/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.administradores;

import com.mycompany.proyectopoo.data.Empleado;
import com.mycompany.proyectopoo.data.Servicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mamay
 */
public class AdministradorEmpleado {
    
      private Scanner input;
    
    private List<Empleado> empleados;
    private char respuesta = '1';
    
    //Constructor
    public AdministradorEmpleado(Scanner input) {
       this.empleados = new ArrayList<>();
       this.input = input;
       //this.servicios.add(new Servicio("comer","3 horas", 22.0, "Activo"));
       this.empleados.add(new Empleado("0705398184", "Carlos", "0988", "carlos@hotmail.com", "Activo"));
 
    }
    
     //metodo para recorrer la lista de los servicios
      public void listaEmpleado() {
          System.out.println("\nLos Empleados existentes son: ");
          if(!empleados.isEmpty()){
              
            for(int i = 0;  i < empleados.size(); i++){ 
                System.out.printf("%d) %s\n", i+1, empleados.get(i));
            }
          }else{
                    
                System.out.printf("no esxisten empleados para mostrar");
                     
            }
        
    }
      
    private Empleado modificarEmple(Empleado empleado){ 
        
        System.out.println("\tIngrese el nombre del empleado: ");
        empleado.setNombre(input.nextLine());
        
        System.out.println("\tIngrese el email del empleado: ");
        empleado.setEmail(input.nextLine());
       

        System.out.println("\tIngrese la cedula del empleado: ");
        empleado.setCedula(input.nextLine());
        

        System.out.println("\tIngrese el telelfono del empleado: ");
        empleado.setTelefono(input.nextLine());
        
        System.out.println("\tIngrese el estado del empleado: ");
        empleado.setEstado(input.nextLine());
        
        return empleado;
        
    }
      
      
    public void agregarEmpleado(){
        
         int nEmpleados;
 
        System.out.println("Ingrese la cantidad de Empleados que desea agregar:");
        nEmpleados = input.nextInt();
        input.nextLine();
 
       
        System.out.println("Ingrese los empleados:");
      
        for(int i = 0;  i < nEmpleados; i++){
            Empleado empleadoTMP = new Empleado();
            
            System.out.println("Ingrese el empleado " + (i+1) + " :");
            this.empleados.add(this.modificarEmple(empleadoTMP));
          
        }
        
        listaEmpleado();
    }
    
    public void editarEmpleado(){ 
    
    }
    
    public void eliminarEmpleado(){ 
    
    }
    
    public void menuEmpleado(){
        
        respuesta = '1';
                
        while(respuesta != '4'){
        
            System.out.println("""
                1.Agregar Empleado
                2.Editar Empleado
                3.Eliminar Empleado
                4.Salir
                """);

            respuesta = input.nextLine().charAt(0);
            switch(respuesta){
                case '1':
                    agregarEmpleado();
                    break;
                case '2':
                    editarEmpleado();
                    break;
                case '3':
                    eliminarEmpleado();
                    break;
                case '4':
                    return;
                   
                default :
                    System.out.println("La opcion es incorrecta");    

            }
        }

    
    }
    
}
