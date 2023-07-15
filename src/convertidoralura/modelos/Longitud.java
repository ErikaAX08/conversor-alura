package convertidoralura.modelos;

/**
 *
 * @author Erika AX
 */
public class Longitud extends Conversor {

    public Longitud() {
        
        setNombre("Longitud");
        setUnidad(new Unidad("Metro (M)","M", 1));
        setUnidad(new Unidad("Kilómetro (KM)","KM", 1000));        
        setUnidad(new Unidad("Hectómetro (HM)","HM", 100));
        setUnidad(new Unidad("Decámetro (DAM)", "DAM", 100));
        setUnidad(new Unidad("Decímetro (DM)", "DM", 0.1));
        setUnidad(new Unidad("Centímetro (CM)","CM", 0.01));
        setUnidad(new Unidad("Milímetro (MM)","MM", 0.001));
        setUnidad(new Unidad("Micrómetro (µM)","µM", 0.000001));
        setUnidad(new Unidad("Nanómetro (NM)", "NM", 0.000000001));
    
    }
    
}
