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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author mohini
 */
public class FXMLRussianAlphabet implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    private final ChangeScene cs = new ChangeScene();
    
    @FXML
    private ListView<String> russianAlphabetListView;
    
    @FXML
    private void btnReturn(ActionEvent event){
        cs.changeScene(event, listStorage.getSceneDestinations()[1]);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> mainMenuList = FXCollections.observableArrayList(listStorage.getRussianAndLatinLetters());
        russianAlphabetListView.setItems(mainMenuList);
        
    }    
    
}
