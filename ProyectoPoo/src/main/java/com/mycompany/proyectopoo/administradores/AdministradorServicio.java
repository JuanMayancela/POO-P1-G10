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
       //se crean los objetos de tipo Servicio y se los agregan a la lista servicios
       this.servicios.add(new Servicio("Terapia_de_Lenguaje","2:00", 22.5, "Activo"));
       this.servicios.add(new Servicio("Terapia_Psicopedagogica","1:30", 30.50, "Activo"));
       this.servicios.add(new Servicio("Terapia_Fisica","2:30", 40.0, "Activo"));
 
    }
    
    
      //metodo para recorrer la lista de los servicios y mostrarlos
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

    
    //Metodo Modificar servicio
    public Servicio modificarSer(Servicio servicio){ 
        
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
    
          
    //Metodo agregar Servicio
    public void agregarServicio(){
        
            //Pedimos los datos
            System.out.println("Ingrese el nombre del Servicio: ");
            String nombre = input.nextLine();
            
            System.out.println("Ingrese la duracion de la Atencion ");
            String duracionAtencion = input.nextLine();
            
            System.out.println("Ingrese el estado del Servicio(Activo o Inactivo): ");
            String estado = input.nextLine();
            
            System.out.println("Ingrese el precio del Servicio: ");
            double precio = input.nextDouble();
            input.nextLine();
            
            //Se crea el objeto Servicio
            Servicio servicioTMP = new Servicio(nombre, duracionAtencion, precio, estado);
            
            //Despues, agregamos el nuevo servicio a la lista servicios
            this.servicios.add(servicioTMP);
        
        listaServicio();
 
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
 
        System.out.println("Ingrese el número del servicio a eliminar: ");
       
        nPosicion = input.nextInt();
        input.nextLine();
        if(nPosicion > servicios.size()){
          
            System.out.println("El número de servicio es incorrecto");
        }else if(nPosicion > 0){
            //Para eliminar el servicio se cambia el estado de "Activo" a "Inactivo"
            servicios.get(nPosicion - 1).setEstado("Inactivo");
            listaServicio();
      
        }    
   
    }
    
    
    //Menu Servicio
    public void menuServicio(){
        
        respuesta = '1';
                
        while(respuesta != '4'){
        
            System.out.println("1.Agregar Servicio"+"\n2.Editar Servicio"+"\n3.Eliminar Servicio"+"\n4.Salir");
            System.out.println("Seleccione una opcion: ");
            
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
