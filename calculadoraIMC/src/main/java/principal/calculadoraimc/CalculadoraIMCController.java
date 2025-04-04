package principal.calculadoraimc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class CalculadoraIMCController {

    @FXML
    private Button btnCalcular;

    @FXML
    private Button btnSair;

    @FXML
    private TextField txtfdAltura;

    @FXML
    private TextField txtfdPeso;

    @FXML
    void ActionCalcular(ActionEvent event) {
        
        float altura = Float.parseFloat(txtfdAltura.getText());
        float peso = Float.parseFloat(txtfdPeso.getText());
        
        float imc = peso/(altura*altura);
        
        if(txtfdAltura.getText().isEmpty() || txtfdPeso.getText().isEmpty()){
            
            Alert erro = new Alert(Alert.AlertType.ERROR);
            erro.setTitle("ERRO");
            erro.setHeaderText("Campo de Altura ou Peso, vazio");
            erro.setContentText("Verifique se há algum campo vazio e preencha!");
            erro.showAndWait();
            
        }else if(imc < 18.5){
            
            Alert IMC = new Alert(Alert.AlertType.INFORMATION);
            IMC.setTitle("IMC");
            IMC.setHeaderText("Seu IMC é: " + imc);
            IMC.setContentText("Você está abaixo do peso ideal para sua altura.");   
            IMC.showAndWait();
            
        }else if(imc < 24.9){
            
            Alert IMC = new Alert(Alert.AlertType.INFORMATION);
            IMC.setTitle("IMC");
            IMC.setHeaderText("Seu IMC é: " + imc);
            IMC.setContentText("Você está no peso ideal para sua altura."); 
            IMC.showAndWait();
        

        }else if(imc < 29.9){
            
            Alert IMC = new Alert(Alert.AlertType.INFORMATION);
            IMC.setTitle("IMC");
            IMC.setHeaderText("Seu IMC é: " + imc);
            IMC.setContentText("Você está com sobrepeso.");   
            IMC.showAndWait();
            
        }else if(imc < 34.9){
            
            Alert IMC = new Alert(Alert.AlertType.INFORMATION);
            IMC.setTitle("IMC");
            IMC.setHeaderText("Seu IMC é: " + imc);
            IMC.setContentText("Você está com obesidade grau I"); 
            IMC.showAndWait();
            
        }else if(imc < 39.9){
            
            Alert IMC = new Alert(Alert.AlertType.INFORMATION);
            IMC.setTitle("IMC");
            IMC.setHeaderText("Seu IMC é: " + imc);
            IMC.setContentText("Você está com obesidade grau II"); 
            IMC.showAndWait();
            
        }else{
            
            Alert IMC = new Alert(Alert.AlertType.INFORMATION);
            IMC.setTitle("IMC");
            IMC.setHeaderText("Seu IMC é: " + imc);
            IMC.setContentText("Você está com obesidade grau III");
            IMC.showAndWait();
        }
    }

    @FXML
    void ActionSair(ActionEvent event) {
        
        if(FecharSistema()){
            System.exit(0);
        }else{
            event.consume();
        }

    }

    private boolean FecharSistema() {
        
        Alert sairSistema = new Alert(Alert.AlertType.CONFIRMATION);
        sairSistema.setTitle("Aviso!");
        sairSistema.setHeaderText("Tem certeza que deseja fechar a aplicação?");
        sairSistema.setContentText("Todas as alterações não salvas serão perdidas");
        return sairSistema.showAndWait().filter(response -> response == ButtonType.OK).isPresent();

    }
}
