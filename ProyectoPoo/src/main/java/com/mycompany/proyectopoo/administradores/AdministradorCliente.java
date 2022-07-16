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
       
       this.clientes.add(new Cliente("0707398184", "Alberto", "0979651157", "alberto@hotmail.com", "Activo"));
       this.clientes.add(new Cliente("0705682196", "Juan", "0998672356", "juan@hotmail.com", "Activo"));
    }
    
     //metodo para recorrer la lista de los clientes
    public void listaClientes() {
        System.out.println("\nLos Clientes existentes son: ");
            if(!clientes.isEmpty()){
              
                for(int i = 0;  i < clientes.size(); i++){ 
                System.out.printf("%d) %s\n", i+1, clientes.get(i));
                }
            }else{
                    
                System.out.printf("no esxisten clientes para mostrar");       
            }
        
    }
    
    
    public void menuCliente(){
        listaClientes();
    }
}
