/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_michaelmartinez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael Martínez
 */
public class Lab2P2_MichaelMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList <Libros>listaLibros=new ArrayList();
        ArrayList <Articulos>listaArticulos=new ArrayList();
        ArrayList <Cursos>listaCursos=new ArrayList();
        ArrayList <conferencias>listaConferencias=new ArrayList();
        ArrayList <Usuario>listaUsuarios=new ArrayList();
        boolean bandera=true;
        int opcionMenu=0;
        //Crear usuarios
        String usuario1="michael50";
        String contra1="progra1";
        String tipo1="Estudiante";
        String usuario2="Alex50";
        String contra2="progra2";
        String tipo2="Profesor";
        String usuario3="Martinez50";
        String contra3="progra3";
        String tipo3="Bibliotecario";
        Usuario nuevoUsuario=new Usuario(usuario1, contra1,tipo1);
        Usuario nuevoUsuario2=new Usuario(usuario2, contra2,tipo2);
        Usuario nuevoUsuario3=new Usuario(usuario3, contra3,tipo3);
        listaUsuarios.add(nuevoUsuario);//agregar estudiante
        listaUsuarios.add(nuevoUsuario2);//agregar profesor
        listaUsuarios.add(nuevoUsuario3);//agregar bibliotecario
        
        //Inicio de sesion
        System.out.println("Ingrese su usuario: ");
        String usuarioInicio=entrada.next();
        System.out.println("Ingrese su contraseña");
        String contraseña=entrada.next();
        //Menu
        while (bandera) {
            System.out.println("1. Listar recurso");
            System.out.println("2. Crear Recurso");
            System.out.println("3. Eliminar recurso");
            System.out.println("4. Modificar recurso");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opcion a ejecutar: ");
            opcionMenu=entrada.nextInt();
            switch (opcionMenu) {
                case 1:
                    for (int i = 0; i < listaLibros.size(); i++) {
                        System.out.println(i+" )"+listaLibros.get(i));
                    }
                    for (int i = 0; i < listaArticulos.size(); i++) {
                        System.out.println(i+" )"+listaArticulos.get(i));
                    }
                    for (int i = 0; i < listaCursos.size(); i++) {
                        System.out.println(i+" )"+listaCursos.get(i));
                    }
                    for (int i = 0; i < listaConferencias.size(); i++) {
                        System.out.println(i+" )"+listaConferencias.get(i));
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    bandera=false;
                    break;
                
                default:
                    System.out.println("Opción incorrecta");
            }
            
        }
        
    }//fin del main
    
}
