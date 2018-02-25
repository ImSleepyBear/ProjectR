
package projectrussian;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Mohini
 */
public class FXMLSettings implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    private final ChangeScene cs = new ChangeScene();
    
    @FXML
    private MenuButton languageGrammar;
    @FXML
    private MenuItem grammarItem;
    
    @FXML
    private MenuButton languageProgram;
    @FXML
    private MenuItem programItem;
    
    @FXML
    private void btnReturn(ActionEvent event){
        cs.changeScene(event, listStorage.sceneDestinations[listStorage.sceneDestinations.length-1]);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
