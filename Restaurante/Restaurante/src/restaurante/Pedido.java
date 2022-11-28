
package restaurante;

import java.util.ArrayList;


public class Pedido {
    
    private int mesa;
    private ArrayList<String> comida;
    private ArrayList<Double> precio;

    public Pedido(int mesa, String plato, double costo) {
        this.mesa = mesa;
        this.comida = new ArrayList<>();
        this.precio = new ArrayList<>();
        this.comida.add(plato);
        this.precio.add(costo);
    }


    public void ordenar_mas(String plato, double costo){
        this.comida.add(plato);
        this.precio.add(costo);
    } 
    
    public double total(){
        double total=0.0;
        
        for(int i=0;i<this.precio.size();i++)
        {
            total = total + this.precio.get(i);
        }
        return total;
    }

    public int getMesa() {
        return mesa;
    }

    public ArrayList<String> getComida() {
        return comida;
    }
}
