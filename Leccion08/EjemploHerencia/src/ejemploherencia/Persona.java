/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author Seth
 */
public class Persona {
    
        //Atributos
        String nombre;
        int edad;
        char genero;
        String direccion;
        
        //Metodos Get y Set
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        
        public String getNombre(){
            return this.nombre;
        }
        
        public void setEdad(int edad){
            this.edad = edad;
        }
        
        public int getEdad(){
           return this.edad;
        }
        
        public char getGenero(){
            return this.genero;
        }
        
        public void setGenero(char genero){
            this.genero = genero;
        }
}
