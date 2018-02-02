
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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

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
    private TextFlow textflow;
    
    @FXML
    private TableView tableView;
    
    @FXML
    private TableColumn column1;
    @FXML
    private TableColumn column2;
    @FXML
    private TableColumn column3;
    @FXML
    private TableColumn column4;
    @FXML
    private TableColumn column5;
    @FXML
    private TableColumn column6;
    
    @FXML
    private MenuButton menuButtonGender;
    
    @FXML
    private MenuItem genderItem1;
    @FXML
    private MenuItem genderItem2;
    @FXML
    private MenuItem genderItem3;
    
    @FXML
    private MenuButton menuButtonMultiples;
    
    @FXML
    private MenuItem multiplierItem1;
    @FXML
    private MenuItem multiplierItem2;
    
    private boolean visibility = false;
    
    @FXML
    private void btnReturn(ActionEvent event){
        cs.changeScene(event, listStorage.sceneDestinations[listStorage.sceneDestinations.length-1]);
    }
    
    @FXML
    private void tableVisibility(){
        visibility = !visibility;
        tableView.setVisible(visibility);
        menuButtonGender.setVisible(visibility);
        menuButtonMultiples.setVisible(visibility);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> obsList = FXCollections.observableArrayList();
        obsList.addAll(Arrays.asList(listStorage.grammarListview));
        
        grammarTopics.setItems(obsList);

        tableView.setVisible(visibility);
        menuButtonGender.setVisible(visibility);
        menuButtonMultiples.setVisible(visibility);
        
        menuButtonGender.getItems().addAll(FXCollections.observableArrayList(
                genderItem1 = new MenuItem(listStorage.genders[0]),
                genderItem2 = new MenuItem(listStorage.genders[1]),
                genderItem3 = new MenuItem(listStorage.genders[2])
        ));
        
        menuButtonMultiples.getItems().addAll(FXCollections.observableArrayList(
                multiplierItem1 = new MenuItem(listStorage.singularPlural[0]),
                multiplierItem2 = new MenuItem(listStorage.singularPlural[1])
        ));
        
        Text text = new Text();
        text.setText("Hello World!");
        textflow.getChildren().addAll(text);
    }
    
}
