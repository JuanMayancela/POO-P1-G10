/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.administradores;

import com.mycompany.proyectopoo.data.Atencion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mamay
 */
public class AdministradorAtencion {
    
    private Scanner input;
    
    private List<Atencion> atenciones;
    private char respuesta = '1';
    
    //Constructor
    public AdministradorAtencion(Scanner input) {
       this.atenciones = new ArrayList<>();
       this.input = input;
       //this.servicios.add(new Servicio("comer","3 horas", 22.0, "Activo"));
       this.atenciones.add(new Atencion("15/7/20022", "14h30", 1, empleado.setEmpleadoAtencion()));
 
    }
    
     //metodo para recorrer la lista de los clientes
    public void listaAtenciones() {
        System.out.println("\nLos Atenciones existentes son: ");
            if(!atenciones.isEmpty()){
              
                for(int i = 0;  i < atenciones.size(); i++){ 
                System.out.printf("%d) %s\n", i+1, atenciones.get(i));
                }
            }else{
                    
                System.out.printf("no esxisten atenciones para mostrar");       
            }
    }  
    
    public void registrarAtencion(){
    
    }
    
    public void consultarAtencion(){
    
    }
    
    
    public void SubmenuAtenciones(){
          respuesta = '1';
                
        while(respuesta != '3'){
        
            System.out.println("""
                1.Agregar Empleado
                2.Editar Empleado
                3.Eliminar Empleado
                4.Salir
                """);

            respuesta = input.nextLine().charAt(0);
            switch(respuesta){
                case '1':
                    registrarAtencion();
                    break;
                    
                case '2':
                    consultarAtencion();
                    break;
                
                case '3':
                    return;
                   
                default :
                    System.out.println("La opcion es incorrecta");    

            }
        }

    
    }
}
