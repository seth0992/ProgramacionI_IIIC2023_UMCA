
package leccion04_poo1;

public class Leccion04_POO1 {

    public static void main(String[] args) {
        
        //Crear un objeto de la clase Persona
        Persona p1 = new Persona();  
       
        //p1.nombre = "Jeremy";
        p1.SetNombre("Jeremy");
        p1.apellido = "Elizondo";        
        //p1.edad = 16;
        p1.SetEdad(31);
        p1.genero = 'M';        
        p1.MostrarDatos();
        
        //Crear un objeto
        Persona juanPablo = new Persona();        
        //juanPablo.MostrarDatos();
        //juanPablo.edad = 25;
        juanPablo.SetEdad(15);
        juanPablo.genero = 'M';
       // juanPablo.nombre = "Juan Pablo";
       juanPablo.SetNombre("Juan Pablo");
        juanPablo.apellido = "Molina";    
        juanPablo.MostrarDatos();
        
        if(p1.GetEdad() > 30){
            System.out.println("Edad");    
        }
     
        
        /// Clase Animal -> Nombre, Genero, Edad, Especie, peso
    }
    
}
