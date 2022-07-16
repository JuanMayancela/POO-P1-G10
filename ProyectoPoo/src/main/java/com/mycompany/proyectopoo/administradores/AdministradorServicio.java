/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.administradores;


import com.mycompany.proyectopoo.data.Servicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author mamay
 */
public class AdministradorServicio {
    
    private Scanner input;
    
    private List<Servicio> servicios;
    private char respuesta = '1';
    
  //Constructor
    public AdministradorServicio(Scanner input) {
       this.servicios = new ArrayList<>();
       this.input = input;
       this.servicios.add(new Servicio("comer","3 horas", 22.0, "Activo"));
       this.servicios.add(new Servicio("vender","3 horas", 22.0, "Activo"));
 
    }
    
   
    
    
   //metodo para recorrer la lista de los servicios
      public void listaServicio() {
          System.out.println("\nLos Servicios existentes son: ");
          if(!servicios.isEmpty()){
              
            for(int i = 0;  i < servicios.size(); i++){ 
                System.out.printf("%d) %s\n", i+1, servicios.get(i));
      
            }
             
          
          
          }else{
                    
                System.out.printf("no esxisten servicios");
                     
            }
        
    }
      
    //Metodo agregar Servicio
      
    
    
    public void agregarServicio(){
        
    
        int nServicios;
 
        System.out.println("Ingrese la cantidad de Servicios que desea agregar:");
        nServicios = input.nextInt();
        input.nextLine();
 
       
        System.out.println("Ingrese los Servicios:");
      
        for(int i = 0;  i < nServicios; i++){
            Servicio servicioTMP = new Servicio();
            
            System.out.println("Ingrese el servicio " + (i+1) + " :");
            this.servicios.add(this.modificarSer(servicioTMP));
          
        }
        
        listaServicio();
 
        }
    
    private Servicio modificarSer(Servicio servicio){ 
        
        System.out.println("\tIngrese el nombre del servicio: ");
        servicio.setNomServicio(input.nextLine());

        System.out.println("\tIngrese el precio del servicio: ");
        servicio.setPrecio(input.nextDouble());
        input.nextLine();

        System.out.println("\tIngrese el duracion del servicio: ");
        servicio.setDuAtencion(input.nextLine());
        
        System.out.println("\tIngrese el estado del servicio: ");
        servicio.setEstado(input.nextLine());
        
        return servicio;
        
    }
    
     //Metodo editar Servicio
    public void editarServicio(){
      
        listaServicio();
      
        int nPosicion;
 
        System.out.println("Ingrese el número del servicio a editar: ");
       
        nPosicion = input.nextInt();
        input.nextLine();
        
        
        if(nPosicion > servicios.size()){
          
            System.out.println("El número de servicio es incorrecto");
            
        }else if(nPosicion > 0){
           
            System.out.println("Ingrese los datos del nuevo servicio:");
            servicios.set(nPosicion-1, modificarSer(servicios.get(nPosicion - 1)));
            listaServicio();
        
        
        }
        
        
    }
    
    //Metodo eliminar Servicio
    public void eliminarServicio(){
        listaServicio();
        int nPosicion;
 
        System.out.println("Ingrese el número del servicio a editar: ");
       
        nPosicion = input.nextInt();
        input.nextLine();
        if(nPosicion > servicios.size()){
          
            System.out.println("El número de servicio es incorrecto");
        }else if(nPosicion > 0){
           
            System.out.println("Ingrese el nuevo estado del servicio:");
            servicios.get(nPosicion - 1).setEstado(input.nextLine());
            listaServicio();
      
        }    
   
    }
    
    
    
    public void menuServicio(){
        
        respuesta = '1';
                
        while(respuesta != '4'){
        
            System.out.println("""
                1.Agregar Servicio
                2.Editar Servicio
                3.Eliminar Servicio
                4.Salir
                """);

            respuesta = input.nextLine().charAt(0);
            switch(respuesta){
                case '1':
                    agregarServicio();
                    break;
                case '2':
                    editarServicio();
                    break;
                case '3':
                    eliminarServicio();
                    break;
                case '4':
                    return;
                   
                default :
                    System.out.println("La opcion es incorrecta");
                
                
                

            }
        }

    
    }
    
    
}
