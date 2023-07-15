package convertidoralura.modelos;

import java.util.ArrayList;

/**
 *
 * @author Erika AX
 */

public class Conversor {
    
    private String nombre;
    private ArrayList<Unidad> unidades;

    public Conversor() {
        unidades = new ArrayList<>();
    }
    
    public double convertir(double monto, Unidad deUnidad, Unidad aUnidad) {
        return (monto * (deUnidad.getValor() / aUnidad.getValor()));
    }
    
    public void setUnidad(Unidad unidad){
        unidades.add(unidad);
    }
    
    public Unidad getUnidad(int index) {
        return unidades.get(index);
    }
    
    public ArrayList<Unidad> getUnidades()
    {
        return unidades;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}
