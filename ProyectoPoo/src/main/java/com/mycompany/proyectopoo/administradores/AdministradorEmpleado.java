/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.administradores;

import com.mycompany.proyectopoo.data.Empleado;

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
       //se crean los objetos de tipo Empleado y se los agregan a la lista empleados
       this.empleados.add(new Empleado("0705398184", "Carlos", "0989671287", "carlos@hotmail.com", "Activo"));
 
    }
    
     //metodo para recorrer la lista de los empleados y mostrarlos
      public void listaEmpleado() {
          System.out.println("\nLos Empleados existentes son: ");
          if(!empleados.isEmpty()){
              
            for(int i = 0;  i < empleados.size(); i++){ 
                System.out.printf("%d) %s\n", i+1, empleados.get(i));
            }
          }else{
                    
                System.out.printf("no existen empleados para mostrar");
                     
            }
        
    }
      
    private Empleado modificarEmple(Empleado empleado){ 
        
        System.out.println("\tIngrese el nombre del empleado: ");
        empleado.setNombre(input.nextLine());
        
        System.out.println("\tIngrese el email del empleado: ");
        empleado.setEmail(input.nextLine());
       

        System.out.println("\tIngrese la cedula del empleado: ");
        empleado.setCedula(input.nextLine());
        

        System.out.println("\tIngrese el telefono del empleado: ");
        empleado.setTelefono(input.nextLine());
        
        System.out.println("\tIngrese el estado del empleado(Activo o Inactivo): ");
        empleado.setEstado(input.nextLine());
        
        return empleado;
        
    }
      
      
    public void agregarEmpleado(){

            //Pedimos los datos
            System.out.println("Ingrese la cedula del empleado: ");
            String cedula = input.nextLine();
            
            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = input.nextLine();
            
            System.out.println("Ingrese el telefono del Empleado: ");
            String telefono = input.nextLine();
            
            System.out.println("Ingrese el email del Empleado: ");
            String email = input.nextLine();
            
            System.out.println("Ingrese el estado del Empleado(Activo o Inactivo): ");
            String estado = input.nextLine();
            Empleado empleadoTMP = new Empleado(cedula, nombre, telefono, email, estado);
            
            //Despues, agregamos el nuevo empleado a la lista empleados
            this.empleados.add(empleadoTMP);
        
        listaEmpleado();
    }
    
    public void editarEmpleado(){ 
        
        listaEmpleado();
      
        int nPosicion;
 
        System.out.println("Ingrese el n??mero del empleado a editar: ");
       
        nPosicion = input.nextInt();
        input.nextLine();
        
        
        if(nPosicion > empleados.size()){
          
            System.out.println("El n??mero de empleado es incorrecto");
            
        }else if(nPosicion > 0){
           
            System.out.println("Ingrese los datos del nuevo empleado:");
            empleados.set(nPosicion-1, modificarEmple(empleados.get(nPosicion - 1)));
            listaEmpleado();
        }
        
    
    }
    
    public void eliminarEmpleado(){ 
        
        listaEmpleado();
        int nPosicion;
 
        System.out.println("Ingrese el n??mero del empleado a editar: ");
       
        nPosicion = input.nextInt();
        input.nextLine();
        if(nPosicion > empleados.size()){
          
        System.out.println("El n??mero de empleado es incorrecto");
        }else if(nPosicion > 0){
            //Para eliminar el empleado se cambia el estado de "Activo" a "Inactivo"
            System.out.println("Ingrese el nuevo estado del empleado:");
            empleados.get(nPosicion - 1).setEstado("Inactivo");
            listaEmpleado();
      
        }    
    
    }
    
    public void menuEmpleado(){
        
        respuesta = '1';
                
        while(respuesta != '4'){
        
            System.out.println("1.Agregar Empleado"+"\n2.Editar Empleado"+"\n3.Eliminar Empleado"+"\n4.Salir");
            System.out.println("Seleccione una opcion: ");
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
