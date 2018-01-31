
package projectrussian;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Mohini
 */
public class FXMLGeneralInfo implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    private final ChangeScene cs = new ChangeScene();
    
    @FXML
    private void btnReturn(ActionEvent event){
        cs.changeScene(event, listStorage.sceneDestinations[listStorage.sceneDestinations.length-1]);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
