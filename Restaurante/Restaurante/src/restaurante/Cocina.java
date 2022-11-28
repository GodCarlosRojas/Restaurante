
package restaurante;

import java.util.ArrayList;
import java.util.HashMap;


public class Cocina implements Interfaz_cocina{
    
    HashMap<Integer,ArrayList<String>> mesa_pedido;

    public Cocina(){
        this.mesa_pedido = new HashMap<>();
    }
    
    public void nuevo_cliente(int num_mesa, ArrayList<String> comida){
        this.mesa_pedido.putIfAbsent(num_mesa, comida);
    } 
    
    public void mostrar_pedido(){
        
        System.out.println("\n***Pedidos de cada mesa***\n");
        for(HashMap.Entry<Integer, ArrayList<String>> entry : mesa_pedido.entrySet()) {
            System.out.println("Mesa: " + entry.getKey() + ", Pedido: " + entry.getValue());
        }
    }

    @Override
    public Plato dar_palto(ArrayList<String> comida) {
        Plato p = new Plato(comida);
        return p;
    }
}
