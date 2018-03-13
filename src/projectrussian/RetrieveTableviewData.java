/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrussian;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Mohini
 */
public class RetrieveTableviewData {
    
    //one item
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[] c1) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], null, null, null, null, null, null, null, null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    public ObservableList<GeneralInfoTableViewHelper> getGeneralInfoData(String[] c1) {
        List<GeneralInfoTableViewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GeneralInfoTableViewHelper(c1[i], null));
        }
        ObservableList<GeneralInfoTableViewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }

    //two items
    public ObservableList<GrammarTopicsTableviewHelper> getGGrammarData(String[] c1, String[] c2) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[i], null, null, null, null, null, null, null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    
    public ObservableList<GeneralInfoTableViewHelper> getGeneralInfoData(String[] c1, String[] c2) {
        List<GeneralInfoTableViewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GeneralInfoTableViewHelper(c1[i], c2[i]));
        }
        ObservableList<GeneralInfoTableViewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    
    //three items
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[] c1, String[][] c2, String[][] c3) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], null, null, null, null, null, null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[][] c1, String[][] c2, String[][] c3) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1[0].length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[0][i], c2[1][i], c3[2][i], null, null, null, null, null, null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    
    //four items
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[] c1, String[] c2, String[] c3, String[] c4) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[i], c3[i], c4[i], null, null, null, null, null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    
    //five items
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[] c1, String[][] c2, String[][] c3, String[][] c4, 
            String[][] c5) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], c4[2][i], c5[3][i], null, null, null, null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    //six items
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[] c1, String[][] c2, String[][] c3, String[][] c4, 
            String[][] c5, String[][] c6) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], c4[2][i], c5[3][i], c6[4][i], null, null, null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    //seven items
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[] c1, String[][] c2, String[][] c3, String[][] c4, 
            String[][] c5, String[][] c6, String[][] c7) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], c4[2][i], c5[3][i], c6[4][i], c7[5][i], null, null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }

    //eight items
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[] c1, String[][] c2, String[][] c3,
            String[][] c4, String[][] c5, String[][] c6, String[][] c7, String[][] c8) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], c4[2][i], c5[3][i], c6[4][i], c7[5][i], c8[6][i], null));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
    
    
    //nine items
    public ObservableList<GrammarTopicsTableviewHelper> getGrammarData(String[] c1, String[][] c2, String[][] c3,
            String[][] c4, String[][] c5, String[][] c6, String[][] c7, String[][] c8, String[][] c9) {
        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], c4[2][i], c5[3][i], c6[4][i], c7[5][i], c8[6][i], c9[7][i]));
        }
        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }

}
