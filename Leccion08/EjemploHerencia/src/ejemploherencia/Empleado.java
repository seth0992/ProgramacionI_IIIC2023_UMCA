/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author Seth
 */
public class Empleado extends Persona{
    
    double sueldo;
    
    public void setSueldo(double Sueldo){
        this.sueldo = Sueldo;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    
}
