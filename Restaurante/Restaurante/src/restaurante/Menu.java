
package restaurante;

import java.util.ArrayList;


public class Menu {
    
    private ArrayList<String> comida;
    private ArrayList<Double> precio;

    public Menu() {
        this.comida = new ArrayList<>();
        this.precio = new ArrayList<>();
        crear_menu();
    }

    private void crear_menu(){
        this.comida.add("Almuerzo del dia");
        this.precio.add(12000.0);
        
        this.comida.add("Sopita");
        this.precio.add(4000.0);
        
        this.comida.add("Bebida");
        this.precio.add(2500.0);
    }
    
    public String pedir_comida(int index){
        return this.comida.get(index);
    }
    
    public double pedir_precio(int index){
        return this.precio.get(index);
    }
    
}
