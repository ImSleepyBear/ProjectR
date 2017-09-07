/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrussian;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author mohini
 */
public class FXMLMainPage implements Initializable {
    
    @FXML
    private ListView<String> mainPageListView;
    
    private final ChangeScene cs = new ChangeScene();
    private final ListStorage listStorage = new ListStorage();
    
    public int selectedDestination;
    public String destination;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> mainMenuList = FXCollections.observableArrayList(listStorage.getMainMenuListview());
        mainPageListView.setItems(mainMenuList);
        
        mainPageListView.setOnMouseClicked((MouseEvent event) -> {
            System.out.println("Chosen listoption: " + mainPageListView.getSelectionModel().getSelectedItem());
            selectedDestination = mainPageListView.getSelectionModel().getSelectedIndex();
            System.out.println("selected destination: " + selectedDestination);
            destination = listStorage.getSceneDestinations()[selectedDestination];
            System.out.println("selected destination: " + destination);
            cs.changeScene(event, destination);
//            changeIt(event, destination, selectedDestination);
        });
    }    

    private void changeIt(MouseEvent event, String destination, int dest) {
        
        for (String sceneDestination : listStorage.getMainMenuListview()) {
            if(sceneDestination.equals(destination)){
                System.out.println("going to: " + sceneDestination);
                System.out.println("going to: " + dest);
                cs.changeScene(event, listStorage.getSceneDestinations()[dest]);
            }
        }
        
//        cs.changeScene(event, destination);
    }
    
}
