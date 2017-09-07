/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrussian;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author mohini
 */
public class ChangeScene {
    
//    public String mainPage = "MainPage";
//    public String russianAlphabet = "RussianAlphabet";
    
    public void changeScene(ActionEvent event, String destination){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML" + destination + ".fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
            System.out.println("Destination: " + destination);
        } catch (Exception e) {
        }
    }
    
    public void changeScene(MouseEvent event, String destination) {        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML" + destination + ".fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
            System.out.println("Destination: " + destination);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } 
}
