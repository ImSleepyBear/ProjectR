/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrussian;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author mohini
 */
public class FXMLAlphabetView implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    private final ChangeScene cs = new ChangeScene();
    
    @FXML
    private TableView<Alfabets> tableView;
    
    private ObservableList<Alfabets> bothAlfabets;
    
    @FXML
    private TableColumn russian;
    
    @FXML
    private TableColumn latin;
    
    private Alfabets alfabets;
    
    @FXML
    private void btnReturn(ActionEvent event){
        cs.changeScene(event, listStorage.getSceneDestinations()[2]);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bothAlfabets = getInitialTableData();
        tableView.setItems(bothAlfabets);
        
        russian.setCellValueFactory(new PropertyValueFactory<>("russian"));
        latin.setCellValueFactory(new PropertyValueFactory<>("latin"));
        
        tableView.getColumns().setAll(russian, latin);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }    
    
    private ObservableList<Alfabets> getInitialTableData() {
        
        List<Alfabets> list = new ArrayList<>();
        
        for(int i = 0; i < listStorage.getLatinLetters().length; i++){
            list.add(new Alfabets(listStorage.getRussianLetters()[i], listStorage.getLatinLetters()[i]));
        }
        
        ObservableList<Alfabets> data = FXCollections.observableList(list);
        
        return data;
    }
    
}
