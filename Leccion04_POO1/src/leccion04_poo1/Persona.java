
package leccion04_poo1;

public class Persona {
    
    //Atributos
    private String nombre;
    public String apellido;
    private int edad;
    public char genero; // M->Masculino / F -> Femenino
    
    //Métodos
    public void MostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Genero: " + this.genero);
    }
    
    // Metodos GET (Selectores) y SET (Modificadores)
    //Get
    public String GetNombre(){
        return this.nombre;
    }
    //Set
    public void SetNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    //Get 
    public int GetEdad(){
        return this.edad;
    }
    //Set
    public void SetEdad(int edad){
        if(edad < 18){
            System.out.println("Error, debe ser mayor de edad!!");
        }else{
            this.edad = edad;
        }
    }
    
}
