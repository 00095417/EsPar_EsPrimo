/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_par_primo;

import java.util.Scanner;
/**
 *
 * @author Carlos Ruiz
 */
public class Numeros_Par_Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        EsPar_EsPrimo numero = new EsPar_EsPrimo();
        
        System.out.println("Ingrese un numero: ");
        
        int dato = entrada.nextInt();
        
        if (numero.EsPar(dato)){
            System.out.println(dato + " es un numero par");        
        }else{
            System.out.println(dato + " no es un numero par");
        }
        
        if (numero.EsPrimo(dato)){
            System.out.println(dato + " es un numero primo");
        }else{
            System.out.println(dato + " no es un numero primo");
        }
    }  
}
