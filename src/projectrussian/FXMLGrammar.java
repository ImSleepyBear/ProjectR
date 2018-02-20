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

    private int selectedItem;

    @FXML
    private void btnReturn(ActionEvent event) {
        cs.changeScene(event, listStorage.sceneDestinations[listStorage.sceneDestinations.length - 1]);
    }

    @FXML
    private void visibility() {
        visibility = !visibility;
        tableView.setVisible(visibility);
        menuButtonGender.setVisible(visibility);
        menuButtonMultiples.setVisible(visibility);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        /*
         Depending on which item that is clicked on in the listview with grammar options,
         the layout will always display text in a textflow, one or both menubuttons, 
         a tableview, or all previously mentioned options.
        
         The text should always be visible, but display different text depending on chosen listview item.
         From there, the menubuttons and the tableview will programmatically vary in size and location.
         The tableview should have a basic amount of tablecolumns, that further on are programmatically 
         selected to be displayed and modified depending on selected listview item. Extra classes are
         needed to display the items in the tableview columns.
        
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

        grammarTopics.setItems(obsList);

        grammarTopics.setOnMouseClicked((MouseEvent event) -> {

            selectedItem = grammarTopics.getSelectionModel().getSelectedIndex();
            chosenTopicText.setText("Selected topic: " + grammarTopics.getSelectionModel().getSelectedItem() + "\n\n");
            System.out.println("Clicked on item: " + grammarTopics.getSelectionModel().getSelectedItem());
            System.out.println("Clicked on item: " + grammarTopics.getSelectionModel().getSelectedIndex());

            if (selectedItem == 0) {

                extraInfoText.setText(listStorage.genderInfo);

                tableView.setVisible(true);

                tableViewData = rtd.getData(listStorage.grammaticalTerms);

                tableView.setItems(tableViewData);
                column1.setText("Terms");

                tableView.getColumns().setAll(column1);

            } else if (selectedItem == 10) {

                menuButtonGender.setVisible(true);
                menuButtonMultiples.setVisible(true);

            } else if (selectedItem == 11) {

                extraInfoText.setText("");

                tableView.setVisible(true);
                menuButtonGender.setVisible(false);
                menuButtonMultiples.setVisible(false);

                tableViewData = rtd.getData(listStorage.grammarTermsForTableviewShort, listStorage.personalPronouns, listStorage.personalPronouns,
                        listStorage.personalPronouns, listStorage.personalPronouns, listStorage.personalPronouns, listStorage.personalPronouns,
                        listStorage.personalPronouns, listStorage.personalPronouns);

                tableView.setItems(tableViewData);
                column1.setText("Terms");
                column2.setText("I/Me");
                column3.setText("You");
                column4.setText("He/Him");
                column5.setText("She/Her");
                column6.setText("It");
                column7.setText("We/Us");
                column8.setText("You");
                column9.setText("They/Them");

                tableView.getColumns().setAll(column1, column2, column3, column4, column5, column6, column7, column8, column9);
                tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            } else {
                tableView.setVisible(false);
                menuButtonGender.setVisible(false);
                menuButtonMultiples.setVisible(false);
                extraInfoText.setText("Extra info");
            }
        });

        menuButtonGender.getItems().addAll(FXCollections.observableArrayList(
                genderItem1 = new MenuItem(listStorage.genders[0]),
                genderItem2 = new MenuItem(listStorage.genders[1]),
                genderItem3 = new MenuItem(listStorage.genders[2])
        ));

        menuButtonMultiples.getItems().addAll(FXCollections.observableArrayList(
                multiplierItem1 = new MenuItem(listStorage.singularPlural[0]),
                multiplierItem2 = new MenuItem(listStorage.singularPlural[1])
        ));

        
        /*
        use selectedItem to differentiate between what to show in the tableview,
        if the grammar topic has several different lists to display
        
        make sure to have a standard goto list to have something to display when 
        the topic is first selected, which will be done in the above 
        grammarTopics.setOnMouseClicked
        
        also, make sure that you somehow alerts the user as to what they have in
        the tableview, whether it be any of the genders or any of the multiples.
        suggestions are to change the menubutton text, or have a label or text
        with the current chosen option
        */
        genderItem1.setOnAction((ActionEvent event) -> {

        });
        
        genderItem2.setOnAction((ActionEvent event) -> {
            
        });
        
        genderItem3.setOnAction((ActionEvent event) -> {
            
        });
        
        multiplierItem1.setOnAction((ActionEvent event) -> {
            
        });
        
        multiplierItem2.setOnAction((ActionEvent event) -> {
            
        });
    }

}
