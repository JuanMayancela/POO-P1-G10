/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectopoo;
import com.mycompany.proyectopoo.administradores.AdministradorEmpleado;
import com.mycompany.proyectopoo.administradores.AdministradorServicio;
import com.mycompany.proyectopoo.administradores.AdministradorCliente;
import com.mycompany.proyectopoo.administradores.AdministradorCita;
import com.mycompany.proyectopoo.administradores.AdministradorAtencion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoPoo {
    static Scanner input = new Scanner(System.in);
    public static char respuesta = '1';
    
    private static AdministradorServicio servicioAdmin;
    private static AdministradorEmpleado empleadoAdmin;
    private static AdministradorCliente clienteAdmin;
    private static AdministradorCita citaAdmin;
    private static AdministradorAtencion atencionAdmin;
    
    public static void inicilizarSistema(){
        
        servicioAdmin = new AdministradorServicio(input);
        empleadoAdmin = new AdministradorEmpleado(input);
        clienteAdmin = new AdministradorCliente(input);
        citaAdmin = new AdministradorCita(input);
        atencionAdmin = new AdministradorAtencion(input);
    
    
    }

    public static void main(String[] args) {
        
        inicilizarSistema();

        while(respuesta != '6'){

            //menu
            System.out.println("""
                               1.Servicios
                               2.Empleados
                               3.Clientes
                               4.Citas
                               5.Atenciones
                               6.Salir""");
            respuesta = input.nextLine().charAt(0);
            switch(respuesta){
                case '1':
                    servicioAdmin.menuServicio();
                    break;
                    
                case '2':
                    empleadoAdmin.menuEmpleado();
                    break;
                    
                case '3':
                    clienteAdmin.menuCliente();
                    break;
                    
                case '4':
                    citaAdmin.SubmenuCitas();
                    break;
                    
                case '5':
                    atencionAdmin.SubmenuAtenciones();
                    break;
                     
                case '6':
                    System.out.println("Gracias por su visita");
                default :
                    System.out.println("La opcion es incorrecta");

            }
        }

    }
    
    
    
    
}

