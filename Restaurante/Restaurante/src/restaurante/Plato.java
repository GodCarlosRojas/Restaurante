
package restaurante;

import java.util.ArrayList;


public class Plato {
    
    private ArrayList<String> comida;

    public Plato(ArrayList<String> comida) {
        this.comida = comida;
    }
    
    public String mostrar(){
        return comida.toString();
    }
}
