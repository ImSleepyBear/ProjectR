
package projectrussian;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Mohini
 */
public class TableviewHelperAlphabet {
    
    private final SimpleStringProperty russianLetter;
    private final SimpleStringProperty pronunciation;
    private final SimpleStringProperty latinLetter;
    private final SimpleStringProperty consonantVowel;
    
    private final ListStorage listStorage = new ListStorage();
    
    public TableviewHelperAlphabet(String russian, String pronunciation, String latin, String consonantVowel){
        this.russianLetter = new SimpleStringProperty(russian);
        this.pronunciation = new SimpleStringProperty(pronunciation);
        this.latinLetter = new SimpleStringProperty(latin);
        this.consonantVowel = new SimpleStringProperty(consonantVowel);
    }

    public String getRussian() {
        return russianLetter.get();
    }

    public void setRussian(String russian) {
        russianLetter.set(russian);
    }
    
    public String getPronunciation(){
        return pronunciation.get();
    }
    
    public void setPronunciation(String word){
        pronunciation.set(word);
    }
    
    public String getLatin() {
        return latinLetter.get();
    }

    public void setLatin(String latin) {
        latinLetter.set(latin);
    }
    
    public String getConsonantVowel() {
        return consonantVowel.get();
    }

    public void setConsonantVowel(String consonantVowel) {
        latinLetter.set(consonantVowel);
    }
    
}
