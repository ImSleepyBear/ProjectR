
package projectrussian;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 *
 * @author Mohini
 */
public class FXMLGeneralInfo implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    private final ChangeScene cs = new ChangeScene();
    private final RetrieveTableviewData rtd = new RetrieveTableviewData();
    
    @FXML
    private ListView<String> infoTopics;
    
    @FXML
    private TextFlow textFlow;
    private final Text chosenTopicText = new Text();
    private final Text extraInfoText = new Text();
    
    @FXML
    private TableView tableView;
    private ObservableList<GeneralInfoTableViewHelper> tableViewData;
    
    @FXML
    private TableColumn column1;
    @FXML
    private TableColumn column2;
    
    private int selectedItem;
    
    @FXML
    private void btnReturn(ActionEvent event){
        cs.changeScene(event, listStorage.sceneDestinations[listStorage.sceneDestinations.length-1]);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        chosenTopicText.setText("Select a grammar topic to get more information\n\n");
        extraInfoText.setText("Extra info");
        textFlow.getChildren().addAll(chosenTopicText, extraInfoText);
        
        ObservableList<String> obsList = FXCollections.observableArrayList();
        obsList.addAll(Arrays.asList(listStorage.generalInfoListview));
        infoTopics.setItems(obsList);
        
        infoTopics.setOnMouseClicked((MouseEvent event) -> {
            selectedItem = infoTopics.getSelectionModel().getSelectedIndex();
            chosenTopicText.setText("Selected topic: " + infoTopics.getSelectionModel().getSelectedItem());
            System.out.println("Clicked on item: " + infoTopics.getSelectionModel().getSelectedItem());
            System.out.println("Clicked on item: " + infoTopics.getSelectionModel().getSelectedIndex());
        });
    }    
    
    private void setColumnText(String item_1, String item_2) {
        column1.setText(item_1);
        column2.setText(item_2);
    }
    
}
