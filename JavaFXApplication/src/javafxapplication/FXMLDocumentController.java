/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

/**
 *
 * @author Yordanov
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextFlow label;
    @FXML
    private Button button;
    @FXML
    private Button btn;
    @FXML
    private TextField text;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       String x = text.getText();
     label.setTextAlignment(TextAlignment.CENTER);
    
       
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cancel(ActionEvent event) {
       
        text.clear();
    }

    @FXML
    private void enter(ActionEvent event) {
       
       
        
    }
    
}
