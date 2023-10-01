/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leccion03;

import java.util.Scanner;

/**
 *
 * @author Seth
 */
public class Leccion03 {

    /**
     * @param args the command line arguments
     */
    
    //Operaciones Matematicas
    public static void main(String[] args) {
        
        // TipoDatos nombreVariable;
        int numero1;
        int numero2;
        int resultado;
        double resultadoDiv;
        
        //Objeto de tipo scanner 
        Scanner teclado = new Scanner(System.in);
                
        System.out.println("Ingrese el primer numero");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero2 = teclado.nextInt();
        
        //Procesamiento 
        resultado = numero1 * numero2;
        resultadoDiv = numero1 / numero2;
        
        //Salidad
        System.out.println("El resultado de la multiplicación es: " + resultado);
        System.out.println("El resultado de la división es: " + resultadoDiv);
        
        
    }
    
}
