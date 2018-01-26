
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
 *
 * @author mohini
 */
public class FXMLAlphabetView implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    private final ChangeScene cs = new ChangeScene();
    private final AudioHandler ah = new AudioHandler();
    
    @FXML
    private TableView<TableviewHelperAlphabet> tableView;
    
    private ObservableList<TableviewHelperAlphabet> bothAlfabets;
    
    @FXML
    private TableColumn russian;
    
    @FXML
    private TableColumn latin;
    
    private TableviewHelperAlphabet alfabets;
    
    @FXML
    private void btnReturn(ActionEvent event){
        cs.changeScene(event, listStorage.getSceneDestinations()[listStorage.getSceneDestinations().length-1]);
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
    
    private ObservableList<TableviewHelperAlphabet> getInitialTableData() {
        
        List<TableviewHelperAlphabet> list = new ArrayList<>();
        
        for(int i = 0; i < listStorage.getLatinLetters().length; i++){
            list.add(new TableviewHelperAlphabet(listStorage.getRussianLetters()[i], listStorage.getLatinLetters()[i]));
        }
        
        ObservableList<TableviewHelperAlphabet> data = FXCollections.observableList(list);
        
        return data;
    }
    
}
