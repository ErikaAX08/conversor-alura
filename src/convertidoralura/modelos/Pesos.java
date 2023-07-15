/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidoralura.modelos;

/**
 *
 * @author Erika AX
 */
public class Pesos extends Conversor {

    public Pesos() {
    
        setNombre("Pesos");
        setUnidad(new Unidad("Gramo (G)", "G", 0.001));  
        setUnidad(new Unidad("Kilogramo (KG)", "KG", 1));    
        setUnidad(new Unidad("Hectogramo (HG)", "HG", 0.1));  
        setUnidad(new Unidad("Decagramo (DAG)", "DAG", 0.01));  
        setUnidad(new Unidad("Decigramo (DG)", "DG", 1e-4));
        setUnidad(new Unidad("Centigramo (CG)", "CG", 1e-5));
        setUnidad(new Unidad("Miligramo (MG)", "MG", 1e-6));
    }
    
}
