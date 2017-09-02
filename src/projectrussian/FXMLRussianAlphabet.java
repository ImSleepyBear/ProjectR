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

/**
 * FXML Controller class
 *
 * @author mohini
 */
public class FXMLRussianAlphabet implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    
    @FXML
    private ListView<String> russianAlphabetListView;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> mainMenuList = FXCollections.observableArrayList(listStorage.getRussianAndLatinLetters());
        russianAlphabetListView.setItems(mainMenuList);
        
    }    
    
}
