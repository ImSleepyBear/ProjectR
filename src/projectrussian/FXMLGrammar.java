
package projectrussian;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 *
 * @author Mohini
 */
public class FXMLGrammar implements Initializable {
    
    private final ListStorage listStorage = new ListStorage();
    private final ChangeScene cs = new ChangeScene();
    
    @FXML
    private ListView<String> grammarTopics;
    
    @FXML
    private void btnReturn(ActionEvent event){
        cs.changeScene(event, listStorage.getSceneDestinations()[listStorage.getSceneDestinations().length-1]);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> obsList = FXCollections.observableArrayList();
        obsList.addAll(Arrays.asList(listStorage.getGrammarListView()));
        
        grammarTopics.setItems(obsList);
    }
    
}
