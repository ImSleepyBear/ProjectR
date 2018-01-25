
package projectrussian;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Mohini
 */
public class TableviewHelperAlphabet {
    
    private SimpleStringProperty russianLetter;
    private SimpleStringProperty latinLetter;
    
    private final ListStorage listStorage = new ListStorage();
    
    public TableviewHelperAlphabet(String russian, String latin){
        russianLetter = new SimpleStringProperty(russian);
        latinLetter = new SimpleStringProperty(latin);
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
