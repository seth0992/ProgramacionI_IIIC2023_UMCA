/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author Seth
 */
public class Cliente extends Persona{
    
    int idCliente;
    String fechaRegistro;
    boolean vip;
    
    
    public void setIdCliente(int idcliente){
        this.idCliente  = idcliente;
    }
    
    public int getIdCliente(){
        return this.idCliente;
    }
    
}
