
package restaurante;

import java.util.HashMap;


public class Caja {
    
    HashMap<Integer, Double> mesa_dinero; 

    public Caja() {
        this.mesa_dinero = new HashMap<>();
    }
    
    //Añadir un cliente a la caja
    public void nuevo_cliente(int num_mesa, double costo){
        this.mesa_dinero.putIfAbsent(num_mesa,costo);
    }  
    
    public void mostrar_recibo(){
        
        System.out.println("***Valor a pagar de cada mesa***\n");
        for(HashMap.Entry<Integer, Double> entry : mesa_dinero.entrySet()) {
            System.out.println("Mesa: " + entry.getKey() + ", Costo total: " + entry.getValue());
        }
    }
}
