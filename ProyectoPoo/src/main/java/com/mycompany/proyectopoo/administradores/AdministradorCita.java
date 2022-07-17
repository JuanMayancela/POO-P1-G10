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
       Empleado emple1 = new Empleado("0955476128", "Samuel", "0989741246", "samuel@hotmail.com", "Activo");
       Empleado emple2 = new Empleado("2450886572", "John", "0964457823", "john@hotmail.com", "Activo");
       Cliente cl2 = new Cliente("0707398184", "Alberto", "0979651157", "alberto@hotmail.com", "Jose");
       Cliente cl1 = new Cliente("0707351234", "Javier", "0979652307", "javier@hotmail.com", "Luis");
       Servicio s1 = new Servicio("Terapia_de_Lenguaje","2:00", 22.5, "Activo");
       Servicio s2 = new Servicio("Terapia_Psicopedagogica","1:30", 30.50, "Activo");
       //se crean los objetos de clase cita y se los agregan a la lista citas
       this.citas.add(new Cita("16/07/20022", "12:30", cl1, s1, emple1));
       this.citas.add(new Cita("15/07/20022", "14h30", cl2, s2, emple2));
 
    }
    
    //metodo para recorrer la lista de las citas y mostrarlas
    public void listaCitas() {
        System.out.println("\nLas Citas existentes son: ");
            if(!citas.isEmpty()){
              
                for(int i = 0;  i < citas.size(); i++){ 
                System.out.printf("%d) %s\n", i+1, citas.get(i));
                }
            }else{
                    
                System.out.printf("no existen citas para mostrar");       
            }
        
    }
    //metodo crearCita
     public void crearCita() {
         
      
            //Pedimos los datos
            System.out.println("Ingrese la fecha de la cita(dd/mm/aa): ");
            String fecha = input.nextLine();
            
            System.out.println("Ingrese la hora de la cita(hh:mm): ");
            String hora = input.nextLine();
            
            for(Cita cita: citas){
             while (cita.getFecha().equals(fecha)&&(cita.getHora().equals(hora))){
                 System.out.println("No se puede crear cita en esa fecha y hora");
                 
                 System.out.println("Ingrese la fecha de la cita(dd/mm/aa): ");
                 fecha = input.nextLine();
            
                 System.out.println("Ingrese la hora de la cita(hh:mm): ");
                 hora = input.nextLine();
             }
         }
            
            System.out.println("Ingrese el mombre de cliente): ");
            String nombre = input.nextLine();
            
            System.out.println("Ingrese el servicio: ");
            String servicio = input.nextLine();
            
            System.out.println("Ingrese la Persona Encargada de proveer el servicio: ");
            String perEncargada = input.nextLine();
            

            Cita citaTMP = new Cita(fecha, hora, nombre, servicio, perEncargada);
            
            //Despues, agregamos la nueva cita a la lista citas
            this.citas.add(citaTMP);
        
        listaCitas();
    }
     //metodo eliminarCita
     public void eliminarCita() {

        
    }
     
     //metodo consultarCita
     public void consultarCita() {
         
         System.out.println("Ingrese la fecha a consultar ");
         String fechaConsultar = input.nextLine();
         for(Cita cita: citas){
             if(cita.getFecha().equals(fechaConsultar)){
             System.out.println(cita);
             }
         }
         
    }
        

    
    
    public void SubmenuCitas(){
        respuesta = '1';
                
        while(respuesta != '4'){
        
            System.out.println("1.Crear Cita"+"\n2.Eliminar Cita"+"\n3.Consultar citas por Fecha"+"\n4.Salir");
            System.out.println("Seleccione una opcion: ");
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
    
