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
        
        //usuario1 Estudiante
        String usuario1="michael50";
        String contra1="progra1";
        String tipo1="Estudiante";
        
        //usuario2 profesor
        String usuario2="Alex50";
        String contra2="progra2";
        String tipo2="Profesor";
        
        //usuario3 biblioteario
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
        String contraseñaInicio=entrada.next();
        
        String tipoUsuario="";
        int contador=0;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (usuarioInicio.equalsIgnoreCase(listaUsuarios.get(i).usuario) &&
                    contraseñaInicio.equalsIgnoreCase(listaUsuarios.get(i).contraseña)) {
                System.out.println("Bienvenido "+ listaUsuarios.get(i).tipoUsuario);
                tipoUsuario=listaUsuarios.get(i).tipoUsuario;
                contador++;
                break;
            }else if(i==listaUsuarios.size()-1 && contador==0){
                System.out.println("Usuario o contraseña incorrectos");
            }
        }
        
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
                    if (tipoUsuario.equalsIgnoreCase("Profesor") || tipoUsuario.equalsIgnoreCase("Bibliotecario")) {
                        int opcionSubmenu=0;
                        System.out.println("1. Libros");
                        System.out.println("2. Articulos");
                        System.out.println("3. Cursos");
                        System.out.println("4. Conferencias");
                        System.out.print("Elija el tipo de recurso que desea agregar: ");
                        opcionSubmenu=entrada.nextInt();
                        switch (opcionSubmenu) {
                            case 1:
                                System.out.print("Ingrese el titulo del libro: ");
                                String titulo=entrada.next();
                                System.out.print("Ingrese el autor del libro: ");
                                String autor=entrada.next();
                                System.out.print("Ingrese el genero del libro: ");
                                String genero=entrada.next();
                                System.out.print("Ingrese el año de publicacion del libro: ");
                                int año=entrada.nextInt();
                                String disponibilidad="Sí";
                                Libros libroNuevo=new Libros(titulo,autor,genero,año,disponibilidad);
                                listaLibros.add(libroNuevo);
                                break;
                            case 2:
                                System.out.print("Ingrese el titulo del articulo: ");
                                titulo=entrada.next();
                                System.out.print("Ingrese el autor del articulo: ");
                                autor=entrada.next();
                                System.out.print("Ingrese el tema del articulo: ");
                                String tema=entrada.next();
                                System.out.print("Ingrese la fecha de publicacion del articulo (YYYY/MM/DD): ");
                                String fecha=entrada.next();
                                disponibilidad="Sí";
                                Articulos articuloNuevo=new Articulos(titulo,autor,tema,fecha,disponibilidad);
                                listaArticulos.add(articuloNuevo);
                                
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                    }else{
                        System.out.println("Los estudiantes no pueden crear recursos");
                    }
                    
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
