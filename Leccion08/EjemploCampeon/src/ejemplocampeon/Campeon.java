/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocampeon;

/**
 *
 * @author Seth
 */
public class Campeon {
    
    //Creo los atributos de la clase
    public static int numCampeones = 1;
    private int numCampeon;
    private String nombre;
    private String rol;
    private int Hp;
    private int Mp;
    
    //Metodos Get y Set
    
    //Nombre
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Rol
    public String getRol(){
        return this.rol;
    }
    public void setRol(String rol){
        this.rol = rol;
    }
    
    //HP
    public int getHp(){
        return this.Hp;
    }
    public void setHp(int hp){
        this.Hp = hp;
    }
    
    //MP
    public int getMp(){
        return this.Mp;
    }
    public void setMp(int mp){
        this.Mp = mp;
    }
    
    //Mostrar Info
    public String mostrarInfo(){
        return "NumCampeon: " + this.numCampeon+ " Nombre: " + this.nombre + " Rol: " + this.rol + " HP: " + this.Hp + " MP: " + this.Mp;
    }
    
    public void mostrarInfo1(){
        System.out.println("num: " + this.numCampeon);
          System.out.println("Nombre: " + this.nombre);   
          System.out.println("Rol: " + this.rol);
          System.out.println("HP: " + this.Hp);
          System.out.println("MP: " + this.Mp);          
    }
    
    //Constructor class
    public Campeon(String nombre, String rol, int hp, int mp){
        this.nombre = nombre;
        this.rol = rol;
        this.Hp = hp;
        this.Mp = mp;
        numCampeon = numCampeones++;
    }
    
    public Campeon(String nombre, String rol){
        this.nombre = nombre;
        this.rol = rol;
        this.Hp = 100;
        this.Mp = 50;
        numCampeon= numCampeones++;
    }
  
    //Constructor vacio
    public Campeon(){
        numCampeon= numCampeones++;
    }
    
    
}
