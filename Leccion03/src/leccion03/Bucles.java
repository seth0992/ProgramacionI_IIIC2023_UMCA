/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leccion03;

/**
 *
 * @author Seth
 */
public class Bucles {
    
    public static void main(String args []){
        
        //While -> Mientras -> String y Bandera de tipo Boolean
        int contador = 0;
        
        //Mostrar los numeros del 0 al 10
        while(contador <= 10){
            System.out.println("Contador: " + contador);
            contador++;
        }
        
        contador = 0;
        do{
            System.out.println("Contador Do: " + contador);
            contador++;
        }while(contador < 10);
            
        
    }
}
