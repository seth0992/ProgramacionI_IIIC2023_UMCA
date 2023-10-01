/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leccion03;

import java.util.Scanner;


/**
 *
 * @author Seth
 */
public class Condicionales {
    
    public static void main(String args []){
    
        //Variable edad
        int edad;  // 30
        
        Scanner teclado = new Scanner(System.in);
        
        //Mostrar un mensaje al usuario
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        
        //Si el usuario puede votar -> edad >= 18
        // 30 >= 18 = True -> False
       
        // if doble
//        if(edad>=18){
//            System.out.println("Puede Votar"); // Solo se ejecuta si la operacion es TRUE
//        }else{
//            System.out.println("No puede Votar"); // Solo se ejecuta si la operacion es FALSE
//        }
        
// if multiple
       if(edad >= 18){
           //If Anidado
           if(edad > 50){
               System.out.println("Votas con honor");
           }else{
                System.out.println("Puede Votar");
           }          
       }else if(edad>=0){
           System.out.println("No puede Votar");
       }else{
           System.out.println("No a ni nacido");
       }
        
       //If en Rango
//       if(edad>=18 && edad <= 35){
//           
//       }
       
    }
    
}
