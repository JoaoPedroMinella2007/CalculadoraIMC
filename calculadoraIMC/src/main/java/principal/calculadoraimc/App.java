package principal.calculadoraimc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraIMC.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("Calculadora de IMC");
        stage.setScene(scene);
        stage.show();

    }
}