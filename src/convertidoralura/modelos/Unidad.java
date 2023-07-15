package convertidoralura.modelos;

/**
 *
 * @author Erika AX
 */
public class Unidad {

    private String nombre;
    private double  valor;

    public Unidad(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getValor(){
        return valor;
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
