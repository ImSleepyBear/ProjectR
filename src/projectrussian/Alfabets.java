package projectrussian;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
