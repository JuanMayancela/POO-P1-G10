/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.administradores;

import com.mycompany.proyectopoo.data.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mamay
 */
public class AdministradorCliente {
    
    private Scanner input;
    
    private List<Cliente> clientes;
    private char respuesta = '1';
    
    //Constructor
    public AdministradorCliente(Scanner input) {
       this.clientes = new ArrayList<>();
       this.input = input;
       //se crean los objetos de coase Cliente y se los agregan a la lista clientes
       this.clientes.add(new Cliente("0707398184", "Alberto", "0979651157", "alberto@hotmail.com", "Activo"));
       this.clientes.add(new Cliente("0705682196", "Juan", "0998672356", "juan@hotmail.com", "Activo"));
    }
    
    //metodo para recorrer la lista de los clientes y mostrarlos
    public void listaClientes() {
        System.out.println("\nLos Clientes existentes son: ");
            if(!clientes.isEmpty()){
              
                for(int i = 0;  i < clientes.size(); i++){ 
                System.out.printf("%d) %s\n", i+1, clientes.get(i));
                }
            }else{
                    
                System.out.printf("no existen clientes para mostrar");       
            }
        
    }
    
   
    private Cliente modificarCliente(Cliente cliente){ 
        
        System.out.println("\tIngrese el nombre del Cliente: ");
        cliente.setNombre(input.nextLine());
        
        System.out.println("\tIngrese el email del cliente: ");
        cliente.setEmail(input.nextLine());

        System.out.println("\tIngrese el telefono del cliente: ");
        cliente.setTelefono(input.nextLine());
        
        System.out.println("\tIngrese los datos del Representante: ");
        cliente.setDatosRepresentante(input.nextLine());
        
        return cliente;
        
    }
      
      
    public void agregarCliente(){

            //Pedimos los datos
            System.out.println("Ingrese la cedula del cliente: ");
            String cedula = input.nextLine();
            
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = input.nextLine();
            
            System.out.println("Ingrese el telefono del cliente: ");
            String telefono = input.nextLine();
            
            System.out.println("Ingrese el email del cliente: ");
            String email = input.nextLine();
            
            System.out.println("Ingrese los datos del Representante: ");
            String datosRepresentante = input.nextLine();
            Cliente clienteTMP = new Cliente(cedula, nombre, telefono, email, datosRepresentante);
            
            //Despues, agregamos el nuevo cliente a la lista clientes
            this.clientes.add(clienteTMP);
        
        listaClientes();
    }
    
    public void editarCliente(){ 
        
        listaClientes();
      
        int nPosicion;
 
        System.out.println("Ingrese el número del cliente a editar: ");
       
        nPosicion = input.nextInt();
        input.nextLine();
        
        
        if(nPosicion > clientes.size()){
          
            System.out.println("El número de cliente es incorrecto");
            
        }else if(nPosicion > 0){
           
            System.out.println("Ingrese los datos del nuevo cliente:");
            clientes.set(nPosicion-1, modificarCliente(clientes.get(nPosicion - 1)));
            listaClientes();
        }
        
    
    }
   
    
        public void menuCliente(){
        
        respuesta = '1';
                
        while(respuesta != '4'){
        
            System.out.println("1.Agregar Cliente"+"\n2.Editar Cliente"+"\n3.Salir");
            System.out.println("Seleccione una opcion: ");
            respuesta = input.nextLine().charAt(0);
            switch(respuesta){
                case '1':
                    agregarCliente();
                    break;
                case '2':
                    editarCliente();
                    break;
                case '3':
                    return;
                   
                default :
                    System.out.println("La opcion es incorrecta");    

            }
        }

    
    }
}
