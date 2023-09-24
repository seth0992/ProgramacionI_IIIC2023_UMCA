/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leccion02_ejemplo1;

   //Impoartar la libreria
import java.util.Scanner;


/**
 *
 * @author Seth
 */
public class Leccion02_Ejemplo2 {
 
    public static void main(String [] args){        
        
        String nombre;
        int edad;
        
        //Paso 1: Crear un objeto de Scanner -> Variable de tipo Scanner
        Scanner sc = new Scanner(System.in);
        
        //Paso 2: Utilizar un metodo de Scanner deacuardo al tipo de datos que se obtiene
        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad, en numeros");
        edad = sc.nextInt();
        
        System.out.println("Hola " + nombre + ", espero que estes muy bien...");
        System.out.println("La edad ingresada es: " + edad);
        
    }
    
}
