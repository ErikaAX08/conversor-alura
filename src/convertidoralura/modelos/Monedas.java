package convertidoralura.modelos;

/**
 *
 * @author Erika AX
 */
public class Monedas extends Conversor {
    
    public Monedas() {
        
        setNombre("Monedas");
    
        setUnidad(new Unidad("Peso mexicano (MX)", "MX", 1));        
        setUnidad(new Unidad("Dolar americano (USD)","USD", 16.75));
        setUnidad(new Unidad("Euro (EUR)","EUR", 18.84));
        setUnidad(new Unidad("Libra esterlina (GBP)", "GBP", 22.05));
        setUnidad(new Unidad("Franco suizo (CHF)", "CHF", 19.56));
        setUnidad(new Unidad("Yen japonés (JPY)","JPV", 0.12));
        setUnidad(new Unidad("Dólar hongkonés (HKD)", "HKD", 2.15));
        setUnidad(new Unidad("Dólar canadiense (CAD)","CAD", 12.79));
        setUnidad(new Unidad("Yuan chino (CNY)","CNY", 2.35));        
        setUnidad(new Unidad("Dólar australiano (AUD)","AUD", 11.54));        
        setUnidad(new Unidad("Real brasileño (BRL)", "BRL", 3.50));
        setUnidad(new Unidad("Rublo ruso (RUB)","RUB", 0.18));
    
    }
    
}
