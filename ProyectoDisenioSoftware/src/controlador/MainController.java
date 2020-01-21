/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author CORE I7
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    private void handleButton2Action(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    private void handleButton3Action(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    private void handleButton4Action(ActionEvent event) throws IOException {
        Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Main1.fxml"));

            Scene escena = new Scene(root);
            stage.setScene(escena);
            stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
