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

    private final boolean visibility = true;
    private int selectedItem;

    @FXML
    private void btnReturn(ActionEvent event) {
        cs.changeScene(event, listStorage.sceneDestinations[listStorage.sceneDestinations.length - 1]);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

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

            /*
             0 = Accusative
             1 = Adjectives
             2 = Case
             3 = Dative
             4 = Demonstrative Pronouns
             5 = Determinative Pronouns
             6 = Emphatic Pronouns
             7 = Gender
             8 = Genitive
             9 = Imperative
             10 = Instrumentalis
             11 = Interrogative Pronouns
             12 = Locative
             13 = Nominative
             14 = Numerals
             15 = Personal Pronouns
             16 = Possessive Pronouns
             17 = Preteritum
             18 = Reflexive Pronouns
             19 = Substantives/Nouns
             20 = Verb Aspects
             21 = Verbs in Present Tense
             22 = Verbs in Past Tense
             23 = Verbs in Past Futurum
             24 = Verbs of Motion
             25 = Reflexive Verbs
             */
            if (selectedItem == 1) { //demonstrative pronouns
                extraInfoText.setText("Currently showing hard adjectives (" + listStorage.normalAdjectivesHardDescription + ")");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(visibility);
                setMenuItemVisibility(visibility, visibility, visibility, !visibility, !visibility, !visibility);
                setNameMenubuttonAndItem("Adjectives", listStorage.englishAdjectives[0],
                        listStorage.englishAdjectives[1], listStorage.englishAdjectives[2], null, null, null);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.normalAdjectivesHard, listStorage.normalAdjectivesHard,
                        listStorage.normalAdjectivesHard, listStorage.normalAdjectivesHard);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 4) { //demonstrative pronouns
                extraInfoText.setText("Currently showing demonstrative pronoun this");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(visibility);
                setMenuItemVisibility(visibility, visibility, !visibility, !visibility, !visibility, !visibility);
                setNameMenubuttonAndItem("Demonstrative pronouns", listStorage.demonstrativePronouns[0],
                        listStorage.demonstrativePronouns[1], null, null, null, null);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.demonstrativePronounsThis, listStorage.demonstrativePronounsThis,
                        listStorage.demonstrativePronounsThis, listStorage.demonstrativePronounsThis);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 5) { //determinative pronouns
                extraInfoText.setText(listStorage.englishDeterminativePronoun);
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(!visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.determinativePronouns, listStorage.determinativePronouns,
                        listStorage.determinativePronouns, listStorage.determinativePronouns);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 6) { //determinative pronouns
                extraInfoText.setText(listStorage.emphaticPronoun + ", " + listStorage.englishEmphaticPronoun);
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(!visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.emphaticPronouns, listStorage.emphaticPronouns,
                        listStorage.emphaticPronouns, listStorage.emphaticPronouns);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 7) { //gender
                extraInfoText.setText(listStorage.genderInfo);
                tableView.setVisible(!visibility);
                generalMenuButton.setVisible(!visibility);
            } else if (selectedItem == 11) { //interrogative pronouns
                extraInfoText.setText("");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(!visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableview,
                        listStorage.interrogativePronouns, listStorage.interrogativePronouns);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.englighInterrogativePronouns[0],
                        listStorage.englighInterrogativePronouns[1], null, null, null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3);
            } else if (selectedItem == 14) {
                extraInfoText.setText("");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(!visibility);
                tableViewData = rtd.getGrammarData(listStorage.numerals, listStorage.numerals, 
                        listStorage.numerals);
                tableView.setItems(tableViewData);
                setColumnText("Numbers", "Numbers", "Numbers", null, null, null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3);
            } else if (selectedItem == 15) { //personal pronouns
                extraInfoText.setText("");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(!visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
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
            } else if (selectedItem == 16) { //possessive pronouns
                extraInfoText.setText("Currently showing first person in singular");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(visibility);
                setNameMenubuttonAndItem("Person and Multiple", listStorage.possessivePronounsPerson[0],
                        listStorage.possessivePronounsPerson[1], listStorage.possessivePronounsPerson[2],
                        listStorage.possessivePronounsPerson[3], listStorage.possessivePronounsPerson[4],
                        listStorage.possessivePronounsPerson[5]);
                setMenuItemVisibility(visibility, visibility, visibility, visibility, visibility, visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.possessivePronounsFirstPersonSingular, listStorage.possessivePronounsFirstPersonSingular,
                        listStorage.possessivePronounsFirstPersonSingular, listStorage.possessivePronounsFirstPersonSingular);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 18) { //reflexive pronouns
                extraInfoText.setText("Currently showing personal reflexive pronouns");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(visibility);
                setNameMenubuttonAndItem("Reflexive Pronouns", listStorage.reflexivePronouns[0],
                        listStorage.reflexivePronouns[1], null, null, null, null);
                setMenuItemVisibility(visibility, visibility, !visibility, !visibility, !visibility, !visibility);
                tableViewData = rtd.getGGrammarData(listStorage.grammarTermsForTableviewShort, listStorage.personalReflexivePossessivePronouns);
                tableView.setItems(tableViewData);
                setColumnText("English", listStorage.englishPersonalReflexivePosessivePronoun, null,
                        null, null, null, null, null, null);
                tableView.getColumns().setAll(column1, column2);
            } else if (selectedItem == 19) { //Substantives/nouns
                extraInfoText.setText("Currently showing feminine substantives in singular");
                tableView.setVisible(visibility);
                generalMenuButton.setVisible(visibility);
                setNameMenubuttonAndItem("Substantive Endings", "Feminine Singular", "Feminine Plural",
                        "Masculine Singular", "Masculine Plural", "Neuter Singular", "Neuter Plural");
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.substantivesFeminineSingular, listStorage.substantivesFeminineSingular,
                        listStorage.substantivesFeminineSingular, listStorage.substantivesFeminineSingular);
                tableView.setItems(tableViewData);
                setColumnText(listStorage.feminineSubstantiveEndings[0], listStorage.feminineSubstantiveEndings[1],
                        listStorage.feminineSubstantiveEndings[2], listStorage.feminineSubstantiveEndings[3],
                        listStorage.feminineSubstantiveEndings[4], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else {
                tableView.setVisible(!visibility);
                generalMenuButton.setVisible(!visibility);
                extraInfoText.setText("Extra info");
            }
        });

        generalItem1.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem1 has fired");
            if (selectedItem == 1) {
                extraInfoText.setText("Currently showing hard adjectives (" + listStorage.normalAdjectivesHardDescription + ")");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.normalAdjectivesHard, listStorage.normalAdjectivesHard,
                        listStorage.normalAdjectivesHard, listStorage.normalAdjectivesHard);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 4) { //demonstrative pronouns
                extraInfoText.setText("Currently showing demonstrative pronoun this");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.demonstrativePronounsThis, listStorage.demonstrativePronounsThis,
                        listStorage.demonstrativePronounsThis, listStorage.demonstrativePronounsThis);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 16) { //possessive pronouns
                tableView.setVisible(visibility);
                extraInfoText.setText("Currently showing first person in singular");
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.possessivePronounsFirstPersonSingular, listStorage.possessivePronounsFirstPersonSingular,
                        listStorage.possessivePronounsFirstPersonSingular, listStorage.possessivePronounsFirstPersonSingular);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 18) { //reflexive pronouns
                extraInfoText.setText("Currently showing personal reflexive pronouns");
                tableViewData = rtd.getGGrammarData(listStorage.grammarTermsForTableviewShort, listStorage.personalReflexivePossessivePronouns);
                tableView.setItems(tableViewData);
                setColumnText("English", listStorage.englishPersonalReflexivePosessivePronoun, null,
                        null, null, null, null, null, null);
                tableView.getColumns().setAll(column1, column2);
            } else if (selectedItem == 19) { //Substantives/nouns
                extraInfoText.setText("Currently showing feminine substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.substantivesFeminineSingular, listStorage.substantivesFeminineSingular,
                        listStorage.substantivesFeminineSingular, listStorage.substantivesFeminineSingular);
                setColumnText(listStorage.feminineSubstantiveEndings[0], listStorage.feminineSubstantiveEndings[1],
                        listStorage.feminineSubstantiveEndings[2], listStorage.feminineSubstantiveEndings[3],
                        listStorage.feminineSubstantiveEndings[4], null, null, null, null);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem2.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem2  has fired");
            if (selectedItem == 1) {
                extraInfoText.setText("Currently showing soft adjectives (" + listStorage.normalAdjectivesSoftDescription + ")");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.normalAdjectivesSoft, listStorage.normalAdjectivesSoft,
                        listStorage.normalAdjectivesSoft, listStorage.normalAdjectivesSoft);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 4) { //demonstrative pronouns
                extraInfoText.setText("Currently showing demonstrative pronoun that");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.demonstrativePronounsThat, listStorage.demonstrativePronounsThat,
                        listStorage.demonstrativePronounsThat, listStorage.demonstrativePronounsThat);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 16) { //possessive pronouns
                tableView.setVisible(visibility);
                extraInfoText.setText("Currently showing first person in plural");
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.possessivePronounsFirstPersonPlural, listStorage.possessivePronounsFirstPersonPlural,
                        listStorage.possessivePronounsFirstPersonPlural, listStorage.possessivePronounsFirstPersonPlural);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 18) { //reflexive pronouns
                extraInfoText.setText("Currently showing possessive reflexive pronouns");
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort, listStorage.possessiveReflexivePossessivePronouns,
                        listStorage.possessiveReflexivePossessivePronouns, listStorage.possessiveReflexivePossessivePronouns,
                        listStorage.possessiveReflexivePossessivePronouns);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 19) { //Substantives/nouns
                extraInfoText.setText("Currently showing feminine substantives in plural");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.substantivesFemininePlural, listStorage.substantivesFemininePlural,
                        listStorage.substantivesFemininePlural, listStorage.substantivesFemininePlural);
                setColumnText(listStorage.feminineSubstantiveEndings[0], listStorage.feminineSubstantiveEndings[1],
                        listStorage.feminineSubstantiveEndings[2], listStorage.feminineSubstantiveEndings[3],
                        listStorage.feminineSubstantiveEndings[4], null, null, null, null);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem3.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem3 has fired");
            if (selectedItem == 1) {
                extraInfoText.setText("Currently showing short adjectives (" + listStorage.normalAdjectivesSoftDescription + ")");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.shortAdjectivesTitles,
                        listStorage.shortAdjectives, listStorage.shortAdjectives,
                        listStorage.shortAdjectives, listStorage.shortAdjectives);
                tableView.setItems(tableViewData);
                setColumnText("Terms", listStorage.gendersAndMultiple[0], listStorage.gendersAndMultiple[1],
                        listStorage.gendersAndMultiple[2], listStorage.gendersAndMultiple[3], null, null, null, null);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 16) { //possessive pronouns
                tableView.setVisible(visibility);
                extraInfoText.setText("Currently showing second person in singular");
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.possessivePronounsSecondPersonSingular, listStorage.possessivePronounsSecondPersonSingular,
                        listStorage.possessivePronounsSecondPersonSingular, listStorage.possessivePronounsSecondPersonSingular);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 19) { //Substantives/nouns
                extraInfoText.setText("Currently showing masculine substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.substantivesMasculineSingular, listStorage.substantivesMasculineSingular,
                        listStorage.substantivesMasculineSingular, listStorage.substantivesMasculineSingular);
                setColumnText(listStorage.masculineSubstantiveEndings[0], listStorage.masculineSubstantiveEndings[1],
                        listStorage.masculineSubstantiveEndings[2], listStorage.masculineSubstantiveEndings[3],
                        listStorage.masculineSubstantiveEndings[4], null, null, null, null);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem4.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem4 has fired");
            if (selectedItem == 16) { //possessive pronouns
                tableView.setVisible(visibility);
                extraInfoText.setText("Currently showing second person in plural");
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.possessivePronounsSecondPersonPlural, listStorage.possessivePronounsSecondPersonPlural,
                        listStorage.possessivePronounsSecondPersonPlural, listStorage.possessivePronounsSecondPersonPlural);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            } else if (selectedItem == 19) { //Substantives/nouns
                extraInfoText.setText("Currently showing masculine substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort,
                        listStorage.substantivesMasculinePlural, listStorage.substantivesMasculinePlural,
                        listStorage.substantivesMasculinePlural, listStorage.substantivesMasculinePlural);
                setColumnText(listStorage.masculineSubstantiveEndings[0], listStorage.masculineSubstantiveEndings[1],
                        listStorage.masculineSubstantiveEndings[2], listStorage.masculineSubstantiveEndings[3],
                        listStorage.masculineSubstantiveEndings[4], null, null, null, null);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem5.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem5 has fired");
            if (selectedItem == 16) { //possessive pronouns
                tableView.setVisible(!visibility);
                extraInfoText.setText(listStorage.possessivePronounsThirdPerson[0]);
            } else if (selectedItem == 19) { //Substantives/nouns
                extraInfoText.setText("Currently showing neuter substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort, listStorage.substantivesNeutralSingular,
                        listStorage.substantivesNeutralSingular, listStorage.substantivesNeutralSingular,
                        listStorage.substantivesNeutralSingular);
                setColumnText(listStorage.neutralSubstantiveEndings[0], listStorage.neutralSubstantiveEndings[1],
                        listStorage.neutralSubstantiveEndings[2], listStorage.neutralSubstantiveEndings[3],
                        listStorage.neutralSubstantiveEndings[4], null, null, null, null);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });

        generalItem6.setOnAction((ActionEvent event) -> {
            System.out.println("GeneralItem6 has fired");
            if (selectedItem == 16) { //possessive pronouns
                tableView.setVisible(!visibility);
                extraInfoText.setText(listStorage.possessivePronounsThirdPerson[1]);
            } else if (selectedItem == 19) { //Substantives/nouns
                extraInfoText.setText("Currently showing neuter substantives in singular");
                tableView.setVisible(visibility);
                tableViewData = rtd.getGrammarData(listStorage.grammarTermsForTableviewShort, listStorage.substantivesNeutralPlural,
                        listStorage.substantivesNeutralPlural, listStorage.substantivesNeutralPlural,
                        listStorage.substantivesNeutralPlural);
                setColumnText(listStorage.neutralSubstantiveEndings[0], listStorage.neutralSubstantiveEndings[1],
                        listStorage.neutralSubstantiveEndings[2], listStorage.neutralSubstantiveEndings[3],
                        listStorage.neutralSubstantiveEndings[4], null, null, null, null);
                tableView.setItems(tableViewData);
                tableView.getColumns().setAll(column1, column2, column3, column4, column5);
            }
        });
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }

    private void setColumnText(String item_1, String item_2, String item_3,
            String item_4, String item_5, String item_6, String item_7,
            String item_8, String item_9) {

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

    private void setNameMenubuttonAndItem(String menuButton, String item_1, String item_2, String item_3,
            String item_4, String item_5, String item_6) {
        generalMenuButton.setText(menuButton);
        generalItem1.setText(item_1);
        generalItem2.setText(item_2);
        generalItem3.setText(item_3);
        generalItem4.setText(item_4);
        generalItem5.setText(item_5);
        generalItem6.setText(item_6);
    }

    private void setMenuItemVisibility(boolean item_1, boolean item_2, boolean item_3, boolean item_4,
            boolean item_5, boolean item_6) {
        generalItem1.setVisible(item_1);
        generalItem2.setVisible(item_2);
        generalItem3.setVisible(item_3);
        generalItem4.setVisible(item_4);
        generalItem5.setVisible(item_5);
        generalItem6.setVisible(item_6);
    }
}
