/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocampeon;

/**
 *
 * @author Seth
 */
public class EjemploCampeon {
    

    public static void main(String[] args) {
                
        //Crear las instacias de la Clase -> Objetos
        Campeon superman = new Campeon("Clark Kent", "Luchador");
        Campeon batman = new Campeon("Bruce", "Estratega", 80, 60);
        Campeon MujerMaravilla = new Campeon("Diana", "Luchador", 110, 40);
        Campeon flash = new Campeon("Bary Alen", "Velocista");
        Campeon aquaman = new Campeon();
        
        
        //Mostar los datos del campeon
        System.out.println(superman.mostrarInfo());
        batman.mostrarInfo1();
        
        //Modificar los datos
         System.out.println(MujerMaravilla.mostrarInfo());
        MujerMaravilla.setRol("Tanque");
        MujerMaravilla.setHp(250);
        System.out.println(MujerMaravilla.mostrarInfo());
        
        
        System.out.println(flash.mostrarInfo());
        System.out.println(flash.getMp());
        flash.setMp(flash.getMp() + 50);
        System.out.println(flash.mostrarInfo());
        
        
        aquaman.mostrarInfo1();
        //Dar forma
        aquaman.setNombre("Aquaman");
        aquaman.setRol("Mago");
        aquaman.setHp(150);
        aquaman.setMp(90);
        
        aquaman.mostrarInfo1();
        
        System.out.println("Total de Campeones: " + Campeon.numCampeones);
    }
    
}


