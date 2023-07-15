package convertidoralura.modelos;

/**
 *
 * @author Erika AX
 */
public class Unidad {

    private String nombre;
    private String abreviatura;
    private double  valor;

    public Unidad(String nombre, String abreviatura, double valor) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.valor = valor;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getAbreviatura(){
        return abreviatura;
    }
    
    public double getValor(){
        return valor;
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
