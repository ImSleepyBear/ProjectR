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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 *
 * @author Mohini
 */
public class FXMLGrammar implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    private final ChangeScene cs = new ChangeScene();
    private final RetrieveTableviewData rtd = new RetrieveTableviewData();

    @FXML
    private ListView<String> grammarTopics;

    @FXML
    private TextFlow textflow;
    private final Text chosenTopicText = new Text();
    private final Text extraInfoText = new Text();

    @FXML
    private TableView<GrammarTopicsTableviewHelper> tableView;
    private ObservableList<GrammarTopicsTableviewHelper> tableViewData;

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
    private TableColumn column7;
    @FXML
    private TableColumn column8;
    @FXML
    private TableColumn column9;

    @FXML
    private MenuButton generalMenuButton;
    @FXML
    private MenuItem generalItem1;
    @FXML
    private MenuItem generalItem2;
    @FXML
    private MenuItem generalItem3;
    @FXML
    private MenuItem generalItem4;
    @FXML
    private MenuItem generalItem5;
    @FXML
    private MenuItem generalItem6;

    private boolean visibility = true;
    private int selectedItem;

    @FXML
    private void btnReturn(ActionEvent event) {
        cs.changeScene(event, listStorage.sceneDestinations[listStorage.sceneDestinations.length - 1]);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        /*
         Depending on which item that is clicked on in the listview with grammar options,
         the layout will always display text in a textflow, one or both menubuttons, 
         a tableview, or all previously mentioned options.
        
         The text should always be visible, but display different text depending on chosen listview item.
         From there, the menubutton and the tableview will programmatically vary in size and location.
         The tableview should have a basic amount of tablecolumns, that further on are programmatically 
         selected to be displayed and modified depending on selected listview item. 
        
         Variables are needed to keep track of which listview item that is selected, and what
         related info that should be displayed.
         */
        chosenTopicText.setText("Select a grammar topic to get more information\n\n");
        extraInfoText.setText("Extra info");
        textflow.getChildren().addAll(chosenTopicText, extraInfoText);

        ObservableList<String> obsList = FXCollections.observableArrayList();
        obsList.addAll(Arrays.asList(listStorage.grammarListview));

        column1.setCellValueFactory(new PropertyValueFactory("c1"));
        column2.setCellValueFactory(new PropertyValueFactory("c2"));
        column3.setCellValueFactory(new PropertyValueFactory("c3"));
        column4.setCellValueFactory(new PropertyValueFactory("c4"));
        column5.setCellValueFactory(new PropertyValueFactory("c5"));
        column6.setCellValueFactory(new PropertyValueFactory("c6"));
        column7.setCellValueFactory(new PropertyValueFactory("c7"));
        column8.setCellValueFactory(new PropertyValueFactory("c8"));
        column9.setCellValueFactory(new PropertyValueFactory("c9"));

        generalMenuButton.getItems().setAll(
                generalItem1 = new MenuItem("Editable"),
                generalItem2 = new MenuItem("Editable"),
                generalItem3 = new MenuItem("Editable"),
                generalItem4 = new MenuItem("Editable"),
                generalItem5 = new MenuItem("Editable"),
                generalItem6 = new MenuItem("Editable")
        );

        grammarTopics.setItems(obsList);

        grammarTopics.setOnMouseClicked((MouseEvent event) -> {
            selectedItem = grammarTopics.getSelectionModel().getSelectedIndex();
            chosenTopicText.setText("Selected topic: " + grammarTopics.getSelectionModel().getSelectedItem() + "\n\n");
            System.out.println("Clicked on item: " + grammarTopics.getSelectionModel().getSelectedItem());
            System.out.println("Clicked on item: " + grammarTopics.getSelectionModel().getSelectedIndex());

            if (selectedItem == 0) {
                extraInfoText.setText(listStorage.genderInfo);
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(!visibility);
                tableViewData = rtd.getData(listStorage.grammaticalTerms);
                tableView.setItems(tableViewData);
                column1.setText("Terms");
                tableView.getColumns().setAll(column1);
            } else if (selectedItem == 8) {
                extraInfoText.setText("Currently showing feminine substantives in singular");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(visibility);
                setNameMenubuttonAndItem("Substantive Endings", "Feminine Singular", "Feminine Plural", 
                        "Masculine Singular", "Masculine Plural", "Neuter Singular", "Neuter Plural");
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.substantivesFeminineSingular, listStorage.substantivesFeminineSingular, 
                        listStorage.substantivesFeminineSingular, listStorage.substantivesFeminineSingular);
                tableView.setItems(tableViewData);
                setColumnText(listStorage.feminineSubstantiveEndings[0], listStorage.feminineSubstantiveEndings[1], 
                        listStorage.feminineSubstantiveEndings[2], listStorage.feminineSubstantiveEndings[3], 
                        listStorage.feminineSubstantiveEndings[4], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 10) {
                extraInfoText.setText("Currently showing first person in singular");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(visibility);
                setNameMenubuttonAndItem("Person and Multiple", listStorage.possessivePronounsPerson[0], 
                        listStorage.possessivePronounsPerson[1], listStorage.possessivePronounsPerson[2], 
                        listStorage.possessivePronounsPerson[3], listStorage.possessivePronounsPerson[4], 
                        listStorage.possessivePronounsPerson[5]);
                setMenuItemVisibility(visibility, visibility, visibility, visibility, visibility, visibility);
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.possessivePronounsFirstPersonSingular, listStorage.possessivePronounsFirstPersonSingular, 
                        listStorage.possessivePronounsFirstPersonSingular, listStorage.possessivePronounsFirstPersonSingular);
                tableView.setItems(tableViewData);
                setColumnText("Terms", "Masculine", "Feminine", "Neuter", "Plural", null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 11) {
                extraInfoText.setText("");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(!visibility);
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.personalPronouns, listStorage.personalPronouns, listStorage.personalPronouns, 
                        listStorage.personalPronouns, listStorage.personalPronouns, listStorage.personalPronouns,
                        listStorage.personalPronouns, listStorage.personalPronouns);
                tableView.setItems(tableViewData);
                setColumnText(listStorage.englishPersonalPronouns[0], listStorage.englishPersonalPronouns[1], 
                        listStorage.englishPersonalPronouns[2], listStorage.englishPersonalPronouns[3], 
                        listStorage.englishPersonalPronouns[4], listStorage.englishPersonalPronouns[5], 
                        listStorage.englishPersonalPronouns[6], listStorage.englishPersonalPronouns[7], 
                        listStorage.englishPersonalPronouns[8]);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5, column6, column7, column8, column9);
            } else {
                tableView.setVisible(!visibility);
                generalMenuButton.setVisible(!visibility);
                extraInfoText.setText("Extra info");
            }
        });

        
        generalItem1.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem1 has fired");
            if (selectedItem == 8){
                extraInfoText.setText("Currently showing feminine substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.substantivesFeminineSingular, listStorage.substantivesFeminineSingular, 
                        listStorage.substantivesFeminineSingular, listStorage.substantivesFeminineSingular);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if(selectedItem == 10) {
                tableView.setVisible(visibility);
                extraInfoText.setText("Currently showing first person in singular");
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.possessivePronounsFirstPersonSingular, listStorage.possessivePronounsFirstPersonSingular, 
                        listStorage.possessivePronounsFirstPersonSingular, listStorage.possessivePronounsFirstPersonSingular);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem2.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem2  has fired");
            if (selectedItem == 8){
                extraInfoText.setText("Currently showing feminine substantives in plural");
                tableView.setVisible(visibility);
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.substantivesFemininePlural, listStorage.substantivesFemininePlural, 
                        listStorage.substantivesFemininePlural, listStorage.substantivesFemininePlural);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 10) {
                tableView.setVisible(visibility);
                extraInfoText.setText("Currently showing first person in plural");
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.possessivePronounsFirstPersonPlural, listStorage.possessivePronounsFirstPersonPlural, 
                        listStorage.possessivePronounsFirstPersonPlural, listStorage.possessivePronounsFirstPersonPlural);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem3.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem3 has fired");
            if (selectedItem == 8){
                extraInfoText.setText("Currently showing masculine substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.substantivesMasculineSingular, listStorage.substantivesMasculineSingular, 
                        listStorage.substantivesMasculineSingular, listStorage.substantivesMasculineSingular);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 10) {
                tableView.setVisible(visibility);
                extraInfoText.setText("Currently showing second person in singular");
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.possessivePronounsSecondPersonSingular, listStorage.possessivePronounsSecondPersonSingular, 
                        listStorage.possessivePronounsSecondPersonSingular, listStorage.possessivePronounsSecondPersonSingular);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem4.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem4 has fired");
            if (selectedItem == 8){
                extraInfoText.setText("Currently showing masculine substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.substantivesMasculinePlural, listStorage.substantivesMasculinePlural, 
                        listStorage.substantivesMasculinePlural, listStorage.substantivesMasculinePlural);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 10) {
                tableView.setVisible(visibility);
                extraInfoText.setText("Currently showing second person in plural");
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, 
                        listStorage.possessivePronounsSecondPersonPlural, listStorage.possessivePronounsSecondPersonPlural, 
                        listStorage.possessivePronounsSecondPersonPlural, listStorage.possessivePronounsSecondPersonPlural);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem5.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem5 has fired");
            if (selectedItem == 8){
                extraInfoText.setText("Currently showing neuter substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, listStorage.substantivesNeutralSingular,
                        listStorage.substantivesNeutralSingular, listStorage.substantivesNeutralSingular,
                        listStorage.substantivesNeutralSingular);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 10) {
                tableView.setVisible(!visibility);
                extraInfoText.setText(listStorage.possessivePronounsThirdPerson[0]);
            }
        });

        generalItem6.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem6 has fired");
            if (selectedItem == 8){
                extraInfoText.setText("Currently showing neuter substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, listStorage.substantivesNeutralPlural,
                        listStorage.substantivesNeutralPlural, listStorage.substantivesNeutralPlural,
                        listStorage.substantivesNeutralPlural);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 10) {
                tableView.setVisible(!visibility);
                extraInfoText.setText(listStorage.possessivePronounsThirdPerson[1]);
            }
        });
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }

    private void setColumnText(String item_1, String item_2, String item_3, 
            String item_4, String item_5, String item_6, String item_7,
            String item_8, String item_9){
        
        column1.setText(item_1);
        column2.setText(item_2);
        column3.setText(item_3);
        column4.setText(item_4);
        column5.setText(item_5);
        column6.setText(item_6);
        column7.setText(item_7);
        column8.setText(item_8);
        column9.setText(item_9);
    }
    
    private void setNameMenubuttonAndItem (String menuButton, String item_1, String item_2, String item_3, 
            String item_4, String item_5, String item_6){
        generalMenuButton.setText(menuButton);
        generalItem1.setText(item_1);
        generalItem2.setText(item_2);
        generalItem3.setText(item_3);
        generalItem4.setText(item_4);
        generalItem5.setText(item_5);
        generalItem6.setText(item_6);
    }
    
    private void setMenuItemVisibility(boolean item_1, boolean item_2, boolean item_3, boolean item_4, 
            boolean item_5, boolean item_6){
        generalItem1.setVisible(item_1);
        generalItem2.setVisible(item_2);
        generalItem3.setVisible(item_3);
        generalItem4.setVisible(item_4);
        generalItem5.setVisible(item_5);
        generalItem6.setVisible(item_6);
    }
}
