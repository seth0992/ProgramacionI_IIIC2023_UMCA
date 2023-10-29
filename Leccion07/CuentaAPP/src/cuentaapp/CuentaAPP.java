
package cuentaapp;

import java.util.Scanner;

/**
 *
 * @author Seth
 */
public class CuentaAPP {
   
    public static void main(String[] args) {
     
//        Cuenta cuenta1 = new Cuenta("Braseth");
//        Cuenta cuenta2 = new Cuenta("Milton", 15000);        
//        System.out.println(cuenta1.getTitular());
//        System.out.println("" + cuenta1.getMonto());
//        
//        System.out.println(cuenta2.getTitular());
//        System.out.println(cuenta2.getMonto());
        
//        System.out.println(cuenta1);
//        System.out.println(cuenta2);
//        
//        cuenta1.ingresar(25000);
//        System.out.println(cuenta1);
//        cuenta2.retirar(25000);
//        System.out.println(cuenta2);
//        
        
        //Utilizando las herramientas previas
        
        //Crear el objeto de scanner
        Scanner sc = new Scanner(System.in);
        //Vector de 4 posiciones de cuentas de cliente   
        //int [] edades = new int [4];
        Cuenta [] cuentasClientes = new Cuenta [4];
        
        //Registro de los datos de las cuentas
        for(int contador = 0; contador<4; contador++){        
            System.out.println("Ingrese el nombre del titular de la cuenta");
            String titular = sc.nextLine();
            System.out.println("Ingrese el monto inicial de la cuenta");
            double monto = sc.nextDouble();
            sc.nextLine();
            
            //Construir el objeto de la cuenta
            Cuenta cuenta1 = new Cuenta(titular,monto);
            
            //Almacenarlo en el vector
            cuentasClientes[contador] = cuenta1;           
        }
        
        System.out.println("Mostrar todas las cuentas");
        for(int contador = 0; contador<4; contador++){
            System.out.println(cuentasClientes[contador]);
        }
 
        
    }
    
}
