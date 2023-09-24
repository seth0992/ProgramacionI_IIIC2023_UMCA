package leccion02_ejemplo1;

/**
 *
 * @author Seth
 */

public class Leccion02_Ejemplo1 {

    public static void main(String[] args) {
       
        //Declaración de variables y tipos de datos 
        String nombre = "Jeremy"; // Declara y asignar 
        String apellido; // Declarar, sin asignacion 
        apellido= "Elizondo";
        int edad = 30;
        double salario = 1500.3 + 1250;
        
        //System.out.print("Hola, esto es programación en JAVA"); // Sin salto de linea print.
        System.out.println("Hola, esto es programación en JAVA"); // Con salto de linea println
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println("La edad es: " + (edad+5) );
        System.out.println("La edad real es: " + edad );
        System.out.println("Salario: " + salario);      
        
      
        
    }
    
}
