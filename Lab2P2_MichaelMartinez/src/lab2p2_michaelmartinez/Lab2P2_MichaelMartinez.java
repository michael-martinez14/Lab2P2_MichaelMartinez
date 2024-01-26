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
        ArrayList listaGlobal=new ArrayList();
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
        System.out.print("Ingrese su usuario: ");
        String usuarioInicio=entrada.next();
        System.out.print("Ingrese su contraseña: ");
        String contraseñaInicio=entrada.next();
        
        String tipoUsuario="";
        int contador=0;
        boolean bandera2=true;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (usuarioInicio.equalsIgnoreCase(listaUsuarios.get(i).usuario) &&
                    contraseñaInicio.equalsIgnoreCase(listaUsuarios.get(i).contraseña)) {
                System.out.println("Bienvenido "+ listaUsuarios.get(i).tipoUsuario);
                tipoUsuario=listaUsuarios.get(i).tipoUsuario;
                
                contador++;
                break;
            }else if(i==listaUsuarios.size()-1 && contador==0){
                
                bandera2=false;
            }
        }
        
        //Menu
        if (bandera2) {
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
                    //listaGlobal.clear();
                    System.out.println("----RECURSOS----");
                    listarRecursos(listaGlobal);
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
                                listaGlobal.add(libroNuevo);
                                System.out.println("Libro agregado");
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
                                listaGlobal.add(articuloNuevo);
                                System.out.println("Articulo agregado");
                                
                                break;
                            case 3:
                                System.out.print("Ingrese el titulo del curso: ");
                                titulo=entrada.next();
                                System.out.print("Ingrese el nombre del instructor: ");
                                String instructor=entrada.next();
                                System.out.print("Ingrese la duracion en semanas: ");
                                String duracion=entrada.next();
                                System.out.print("Ingrese la plataforma de enseñanza: ");
                                String plataforma=entrada.next();
                                Cursos nuevoCurso=new Cursos(titulo,instructor,duracion,plataforma);
                                listaGlobal.add(nuevoCurso);
                                System.out.println("Curso agregado");
                                
                                break;
                            case 4:
                                System.out.print("Ingrese el titulo de la conferencia: ");
                                titulo=entrada.next();
                                System.out.print("Ingrese el nombre del conferencista: ");
                                String conferencista=entrada.next();
                                System.out.print("Ingrese la fecha de la conferencia (YYYY/MM/DD): ");
                                fecha=entrada.next();
                                System.out.print("Ingrese la duracion de la conferencia en horas: ");
                                duracion=entrada.next();
                                System.out.print("Ingrese el enlace de acceso: ");
                                String enlace=entrada.next();
                                conferencias nuevaConferencia= new conferencias(titulo,conferencista,fecha, duracion,enlace);
                                listaGlobal.add(nuevaConferencia);
                                System.out.println("Conferencia agregada");
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                    }else{
                        System.out.println("Los estudiantes no pueden crear recursos");
                    }
                    
                    break;
                case 3:
                    if (tipoUsuario.equalsIgnoreCase("Bibliotecario")) {
                        //listaGlobal.clear();
                        listarRecursos(listaGlobal);
                        System.out.print("Ingrese la posicion del recurso: ");
                        int identificador=entrada.nextInt();
                        //System.out.println(identificador);
                        if (identificador>=0 && identificador<listaGlobal.size()) {
                            listaGlobal.remove(identificador);
                        }else{
                            System.out.println("La posicion no existe");
                        }
                        
                    }else if(tipoUsuario.equalsIgnoreCase("Profesor")){
                        System.out.println("Los profesores no pueden eliminar recursos");
                    }else{
                        System.out.println("Los estudiantes no pueden eliminar recursos");
                    }
                    
                    break;
                case 4:
                    if (tipoUsuario.equalsIgnoreCase("Bibliotecario")) {
                        //listaGlobal.clear();
                        listarRecursos(listaGlobal);
                        System.out.print("Ingrese la posicion del recurso a modificar: ");
                        int identificador=entrada.nextInt();
                        if (listaGlobal.get(identificador) instanceof Libros) {
                            System.out.print("Ingrese el nuevo titulo del libro: ");
                            String titulo = entrada.next();
                            System.out.print("Ingrese el nuevo autor del libro: ");
                            String autor = entrada.next();
                            System.out.print("Ingrese el nuevo genero del libro: ");
                            String genero = entrada.next();
                            System.out.print("Ingrese el nuevo año de publicacion del libro: ");
                            int año = entrada.nextInt();
                            System.out.print("Ingrese la nueva disponibilidad del libro(Si/No): ");
                            String disponibilidad = entrada.next();
                            ((Libros)listaGlobal.get(identificador)).setAutor(autor);
                            ((Libros)listaGlobal.get(identificador)).setTitulo(titulo);
                            ((Libros)listaGlobal.get(identificador)).setGenero(genero);
                            ((Libros)listaGlobal.get(identificador)).setAño(año);
                            ((Libros)listaGlobal.get(identificador)).setDisponibilidad(disponibilidad);
                            System.out.println("Libro modificado");
                            
                        }else if(listaGlobal.get(identificador) instanceof Articulos){
                            System.out.print("Ingrese el nuevo titulo del articulo: ");
                            String titulo = entrada.next();
                            System.out.print("Ingrese el nuevo autor del articulo: ");
                            String autor = entrada.next();
                            System.out.print("Ingrese el nuevo tema del articulo: ");
                            String tema = entrada.next();
                            System.out.print("Ingrese la nueva fecha de publicacion del articulo (YYYY/MM/DD): ");
                            String fecha = entrada.next();
                            System.out.print("Ingrese la nueva disponibilidad del libro(Si/No): ");
                            String disponibilidad = entrada.next();
                            ((Articulos)listaGlobal.get(identificador)).setAcceso(disponibilidad);
                            ((Articulos)listaGlobal.get(identificador)).setTitulo(titulo);
                            ((Articulos)listaGlobal.get(identificador)).setAutor(autor);
                            ((Articulos)listaGlobal.get(identificador)).setFecha(fecha);
                            ((Articulos)listaGlobal.get(identificador)).setTema(tema);
                            System.out.println("Articulo modificado");
                            
                            
                        }else if(listaGlobal.get(identificador) instanceof Cursos){
                            System.out.print("Ingrese el nuevo titulo del curso: ");
                            String titulo = entrada.next();
                            System.out.print("Ingrese el nuevo nombre del instructor: ");
                            String instructor = entrada.next();
                            System.out.print("Ingrese la nueva duracion en semanas: ");
                            String duracion = entrada.next();
                            System.out.print("Ingrese la nueva plataforma de enseñanza: ");
                            String plataforma = entrada.next();
                            ((Cursos)listaGlobal.get(identificador)).setDuracion(duracion);
                            ((Cursos)listaGlobal.get(identificador)).setInstructor(instructor);
                            ((Cursos)listaGlobal.get(identificador)).setPlataforma(plataforma);
                            ((Cursos)listaGlobal.get(identificador)).setTitulo(titulo);
                            System.out.println("Curso modificado");
                            
                        }else if (listaGlobal.get(identificador) instanceof conferencias){
                            System.out.print("Ingrese el nuevo titulo de la conferencia: ");
                            String titulo = entrada.next();
                            System.out.print("Ingrese el nuevo nombre del conferencista: ");
                            String conferencista = entrada.next();
                            System.out.print("Ingrese la nueva fecha de la conferencia (YYYY/MM/DD): ");
                            String fecha = entrada.next();
                            System.out.print("Ingrese la nueva duracion de la conferencia en horas: ");
                            String duracion = entrada.next();
                            System.out.print("Ingrese el nuevo enlace de acceso: ");
                            String enlace = entrada.next();
                            ((conferencias)listaGlobal.get(identificador)).setConferencista(conferencista);
                            ((conferencias)listaGlobal.get(identificador)).setDuracion(duracion);
                            ((conferencias)listaGlobal.get(identificador)).setEnlace(enlace);
                            ((conferencias)listaGlobal.get(identificador)).setFecha(fecha);
                            ((conferencias)listaGlobal.get(identificador)).setTitulo(titulo);
                            System.out.println("Conferencia modificada");
                        }else{
                            System.out.println("Modulo incorrecto");
                        }
                        
                        
                        
                    }else if(tipoUsuario.equalsIgnoreCase("Profesor")){
                        System.out.println("Los profesores no pueden modificar recursos");
                    }else{
                        System.out.println("Los estudiantes no pueden modificar recursos");
                    }
                    
                    break;
                case 5:
                    bandera=false;
                    break;
                
                default:
                    System.out.println("Opción incorrecta");
            }
            
        }
            
        }else{
            System.out.println("Usuario o contraseña incorrectos");
            
        }
        
        
    }//fin del main
    
    public static void listarRecursos(ArrayList listaGlobal  ){
        for (int i = 0; i < listaGlobal.size(); i++) {
            System.out.println(i+" )"+listaGlobal.get(i));
        }
    }
    
}
