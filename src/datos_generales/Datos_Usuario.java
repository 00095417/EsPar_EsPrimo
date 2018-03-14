package datos_generales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Ruiz
 */
public class Datos_Usuario{
    
    String nombre, apellido;
    int edad;
    double altura;
    
    public Datos_Usuario(String nombre,String apellido, int edad, double altura){
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }
    
    public void Mostrar_Usuario(){
    
        System.out.println("Nombre: "+ nombre +"\n"+"Apellido: "+ apellido +"\n"+
                           "Edad: "+ edad +" años\n"+"Altura: "+ altura + "m");
    }   
}
