
package projectrussian;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Mohini
 */
public class TableviewHelperAlphabet {
    
    private SimpleStringProperty russianLetter;
    private SimpleStringProperty pronunciation;
    private SimpleStringProperty latinLetter;
    
    private final ListStorage listStorage = new ListStorage();
    
    public TableviewHelperAlphabet(String russian, String pronunciation, String latin){
        this.russianLetter = new SimpleStringProperty(russian);
        this.pronunciation = new SimpleStringProperty(pronunciation);
        this.latinLetter = new SimpleStringProperty(latin);
    }

    public String getRussian() {
        return russianLetter.get();
    }

    public void setRussian(String russian) {
        russianLetter.set(russian);
    }

    private StringProperty russianProperty(){
        return russianLetter;
    }
    
    public String getPronunciation(){
        return pronunciation.get();
    }
    
    public void setPronunciation(String word){
        pronunciation.set(word);
    }
    
    private StringProperty pronounciationProperty(){
        return pronunciation;
    }
    
    public String getLatin() {
        return latinLetter.get();
    }

    public void setLatin(String latin) {
        latinLetter.set(latin);
    }
    
    private StringProperty latinProperty(){
        return latinLetter;
    }
    
}
