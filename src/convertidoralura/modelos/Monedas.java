package convertidoralura.modelos;

/**
 *
 * @author Erika AX
 */
public class Monedas extends Conversor {
    
    public Monedas() {
        
        setNombre("Monedas");
    
        setUnidad(new Unidad("Peso mexicano (MX)", 1));        
        setUnidad(new Unidad("Dolar americano (USD)", 16.75));
        setUnidad(new Unidad("Euro (EUR)", 18.84));
        setUnidad(new Unidad("Libra esterlina (GBP)", 22.05));
        setUnidad(new Unidad("Franco suizo (CHF)", 19.56));
        setUnidad(new Unidad("Yen japonés (JPY)", 0.12));
        setUnidad(new Unidad("Dólar hongkonés (HKD)", 2.15));
        setUnidad(new Unidad("Dólar canadiense (CAD)", 12.79));
        setUnidad(new Unidad("Yuan chino (CNY)", 2.35));        
        setUnidad(new Unidad("Dólar australiano (AUD)", 11.54));        
        setUnidad(new Unidad("Real brasileño (BRL)", 3.50));
        setUnidad(new Unidad("Rublo ruso (RUB)", 0.18));
    
    }
    
}
