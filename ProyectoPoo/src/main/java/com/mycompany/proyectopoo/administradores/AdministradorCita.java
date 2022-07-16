/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.administradores;

import com.mycompany.proyectopoo.data.Cita;
import com.mycompany.proyectopoo.data.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mamay
 */
public class AdministradorCita {
    
    private Scanner input;
    
    private List<Cita> citas;
    private char respuesta = '1';
    
    //Constructor
    public AdministradorCita(Scanner input) {
       this.citas = new ArrayList<>();
       this.input = input;
       //this.servicios.add(new Servicio("comer","3 horas", 22.0, "Activo"));
       this.citas.add(new Cita("15/7/20022", "14h30", 1, perEncargada.setPerEncargada()));
 
    }
    
     //metodo para recorrer la lista de los clientes
    public void listaCitas() {
        System.out.println("\nLos Citas existentes son: ");
            if(!citas.isEmpty()){
              
                for(int i = 0;  i < citas.size(); i++){ 
                System.out.printf("%d) %s\n", i+1, citas.get(i));
                }
            }else{
                    
                System.out.printf("no esxisten citas para mostrar");       
            }
        
    }
    //metodo crearCita
     public void crearCita() {
        
    }
     //metodo eliminarCita
     public void eliminarCita() {

        
    }
     
     public void consultarCita() {
         //if(fecha.equals(fechaConsultar)){
             System.out.println("");

         
    }
     //metodo consultarCita
     /**public void consultarCita() {
         
         System.out.println("Ingrese la fecha a consultar ");
         String fechaConsultar = sc.nextLine();
         if(fecha.equals(fechaConsultar)){
             System.out.println();
         }
    }
        sc.close();**/
//}
    
    
    public void SubmenuCitas(){
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
                    crearCita();
                    break;
                case '2':
                    eliminarCita();
                    break;
                case '3':
                    consultarCita();
                    break;
                case '4':
                    return;
                   
                default :
                    System.out.println("La opcion es incorrecta");    

            }
        }

    
    }
      
}
    

