
package leccion05_ejerciciosbasicos;

import java.util.Scanner;

public class Leccion05_EjerciciosBasicos {

    public static void main(String[] args) {
        //Objeto de tipo Scanner
        Scanner sc = new Scanner(System.in);
        
        //Variable
        String palabra; // Variable con el nombre de palabra que almacena un string
        String palabraConEspacios = "";
        
           
        //Solicitar el dato al usuario
        System.out.println("Ingrese la palabra:");
        palabra = sc.nextLine();
        
        System.out.println("Cantidad de letras en la palabra: " + palabra.length());        
        for(int contador = 0; contador<palabra.length();contador++){
           palabraConEspacios += palabra.charAt(contador) + " ";             
        }
        System.out.println(palabraConEspacios);
        System.out.println("");      
    }
    
}
