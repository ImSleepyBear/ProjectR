/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrussian;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Mohini
 */
public class FXMLTestController implements Initializable {

    @FXML
    private TableView<String> tableView;
    
    @FXML
    private TableColumn russian;
    
    @FXML
    private TableColumn latin;
    
    private SimpleStringProperty tableObjectR;
    private SimpleStringProperty tableObjectT;
    
    ObservableList<String> columnRussian = FXCollections.observableArrayList();
    ObservableList<String> columnLatin = FXCollections.observableArrayList();
    
    private final ListStorage listStorage = new ListStorage();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for(int i = 0; i < 33; i++){
            columnRussian.add(listStorage.getRussianLetters()[i]);
            System.out.println("adding russian letter: " + listStorage.getRussianLetters()[i]);
            columnLatin.add(listStorage.getLatinLetters()[i]);
            System.out.println("adding latin letter: " + listStorage.getLatinLetters()[i]);
        }
        
        tableView.setItems(columnLatin);
    }    
    
}
