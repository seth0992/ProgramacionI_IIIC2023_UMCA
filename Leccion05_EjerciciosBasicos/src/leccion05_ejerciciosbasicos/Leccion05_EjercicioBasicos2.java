
package leccion05_ejerciciosbasicos;
import java.util.Scanner;

public class Leccion05_EjercicioBasicos2 {
    
    public static void main(String args []) {
        
        //Objeto de Scanner
        Scanner sc = new Scanner(System.in);
        
        //Cantidad de palabras dinamicas
        int cantidadPalabras = 1;
        System.out.println("Ingrese la cantidad de palabras:");
        cantidadPalabras = sc.nextInt();
        sc.nextLine();
        //Como creo un vector -> De Strings
        String[] palabras = new String[cantidadPalabras]; // 5
        
        //Variable para almacenar la palabra con mayor cantidad de letras
        String palabraMax = "";
        String listaPalabras = "";
        int cantidaMaxLetras = 0;
        
        //Ingreso Datos -> Recorre cada posicion del vector y solicitar la palabra
        for(int contador = 0; contador < palabras.length; contador++){
            System.out.println("Ingrese la palabra:  " + (contador + 1));
            palabras[contador] = sc.nextLine();
        }
        
                //For each -> Para cada uno
        //System.out.println("Imprimir la lista de palabras ingresadas");
       for(String palabra : palabras){           
            if(cantidaMaxLetras < palabra.trim().length()){
              palabraMax = palabra;
           }         
        }
 System.out.println("La palabra con mayor cantidad de letras es: " + palabraMax); 
        
        //For each -> Para cada uno
        //System.out.println("Imprimir la lista de palabras ingresadas");
//       for(String palabra : palabras){           
//           //(palabraMax < palabra)
//           // ("Perros".length() < "Gatos".length())
//           System.out.println(palabra.trim());
//           if(cantidaMaxLetras < palabra.trim().length()){
//              palabraMax = palabra;
//              cantidaMaxLetras = palabra.trim().length();
//           }else if (cantidaMaxLetras  == palabra.trim().length()){
//               palabraMax = palabraMax + ", " + palabra;
//           }           
//        }
// System.out.println("La palabra con mayor cantidad de letras es: " + palabraMax); 

       for(String palabra : palabras){                     
           System.out.println(palabra.trim());
           if(palabraMax.trim().length() < palabra.trim().length()){
              palabraMax = palabra;
              listaPalabras = palabra;
           }else if (palabraMax.trim().length()  == palabra.trim().length()){
               listaPalabras = listaPalabras + ", " + palabra;
           }           
        }
        System.out.println("La palabra con mayor cantidad de letras es: " + listaPalabras); 
    }
}
