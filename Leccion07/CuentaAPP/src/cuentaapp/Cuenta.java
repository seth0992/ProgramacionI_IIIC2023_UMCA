package cuentaapp;

/**
 *
 * @author Seth
 */
public class Cuenta {
    
    //Abributos de la clase
    private String titular;
    private double monto;
    
    //Constructores
    public Cuenta(String titular){
       this.titular = titular;
       this.monto = 0;
    }
    
    public Cuenta(String titular, double monto){
        this.titular = titular;
        this.monto = monto;
    }
    
    //Metodos GET y SET
    //Metodo get - obtener - titular
    //ModificarAcceso TipoDatoDevolucion NombreDelMetodo(Parametros){instrucciones}
    public String getTitular(){        
        return this.titular;
    }
    
    //Metodo Set - Modificar - Titular
    public void setTitular(String titular){
        this.titular = titular;
    }
       
    //Get Monto
    public double getMonto(){
        return this.monto;
    }
    
    //Set Monto
    public void setMonto(double monto){
        this.monto = monto;
    }
    
    //Metodos especiales
    public void ingresar(double cantidad){
     //ingresar (double monto): se ingresa un monto a la cuenta, 
     //si el monto introducido es negativo, no se hará nada.    
     if(cantidad>0){
           this.monto += cantidad; 
     }
 
    }
    
    public void retirar(double cantidad){
    //Se retira un monto a la cuenta, si restando el monto actual a la 
    //que nos  pasan es negativa, el monto de la cuenta pasa a ser 0.
    //(Monto = 1000 -> cantidad 900) < 0
    // (100) < 0    
        if( (this.monto - cantidad) < 0 ){
            this.monto = 0;
        }else{
            this.monto -= cantidad; // this.monto = this.monto - cantidad;
        }      
    }
    
    //ToString
    @Override
    public String toString(){
        return "El titular " + this.titular + " tiene "+ this.monto + " colones en la cuenta";
    }
    
  
    
}
