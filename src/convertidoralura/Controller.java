package convertidoralura;

import convertidoralura.modelos.Convertidor;
import convertidoralura.modelos.Longitud;
import convertidoralura.modelos.Monedas;
import convertidoralura.modelos.Pesos;
import convertidoralura.modelos.Unidad;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.collections.FXCollections;

/**
 *
 * @author Erika AX
 */
public class Controller implements Initializable {
    
    @FXML
    private Button btnConvertir;
    
    @FXML
    private TextField inputMonto;
    
    @FXML
    private ComboBox<Unidad> unidadDe;
    
    @FXML
    private ComboBox<Unidad> unidadA;
    
    @FXML
    private Text textResultado;
    
    Convertidor convertidor = new Convertidor(); 
    Monedas conversorMonedas = new Monedas();
    Longitud conversorLongitud = new Longitud();    
    Pesos conversorPeso = new Pesos();

    
    @FXML
    private void convertir(ActionEvent event){
        
        try {
            double resultado = convertidor.getConversor().convertir(Double.parseDouble(inputMonto.getText()), unidadDe.getValue(), unidadA.getValue());
            textResultado.setText(inputMonto.getText() + " " + unidadDe.getValue().getAbreviatura() +  " = " + Double.toString(resultado) + " " + unidadA.getValue().getAbreviatura());
        } catch (Exception e) {
            System.out.println("NumberFormat Exception");
        }
        
    }
    
    @FXML
    private void setConversorMonedas(){
        convertidor.setConversor(conversorMonedas);
        actualizarUI();
    }
    
    @FXML 
    private void setConversorLongitud(){
        convertidor.setConversor(conversorLongitud);
        actualizarUI();
    }
    
    @FXML 
    private void setConversorPesos(){
        convertidor.setConversor(conversorPeso);
        actualizarUI();
    }
    
    @FXML
    private void clearInput(){
        inputMonto.setText("");
    }
    
    private void actualizarUI(){
        unidadDe.setItems(FXCollections.observableArrayList(convertidor.getConversor().getUnidades()));
        unidadA.setItems(FXCollections.observableArrayList(convertidor.getConversor().getUnidades()));
        unidadDe.getSelectionModel().select(1);
        unidadA.getSelectionModel().select(0);
        System.out.println(convertidor.getConversor().getUnidad(0).getNombre());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        convertidor.setConversor(conversorMonedas);
        actualizarUI();
    }
    
}
