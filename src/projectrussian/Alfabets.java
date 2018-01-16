package projectrussian;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * Used as an extenstion to help populate tableviews with items in the columns
 */

/**
 *
 * @author Mohini
 */
public class Alfabets {
    
    private SimpleStringProperty russianLetter;
    private SimpleStringProperty latinLetter;
    
    private final ListStorage listStorage = new ListStorage();
    
    public Alfabets(String russian, String latin){
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
