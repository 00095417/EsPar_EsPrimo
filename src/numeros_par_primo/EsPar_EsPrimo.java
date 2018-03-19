/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_par_primo;

/**
 *
 * @author Carlos Ruiz
 */
public class EsPar_EsPrimo {
    
    public boolean EsPar(int dato){
    return (dato%2==0);
    }
    
    public boolean EsPrimo(int dato){
        int numero = 0;
        
        for (int i = 1; i<=dato; ++i){
            if (dato%i==0){
                numero +=1;
            }
        }
    return (numero == 2);
    }  
}
