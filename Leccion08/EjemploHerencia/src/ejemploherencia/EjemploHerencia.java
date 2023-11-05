
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploherencia;
/**
 *
 * @author Seth
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cl1 = new Cliente();
        
        cl1.setNombre("Jeremy");
        cl1.setGenero('M');
        cl1.setEdad(31);
        cl1.setIdCliente(1);
        
        
        Empleado emp1 = new Empleado();
        emp1.setNombre("Juana");
        emp1.setGenero('F');
        emp1.setSueldo(3500);
        
        
        
    }
    
}
