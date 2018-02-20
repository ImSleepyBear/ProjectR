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
    
    public ObservableList<GrammarTopicsTableviewHelper> getData(String[] c1) {

        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();

        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], null, null, null, null, null, null, null, null));
        }

        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }

    public ObservableList<GrammarTopicsTableviewHelper> getData(String[] c1, String[][] c2, String[][] c3, String[][] c4, String[][] c5) {

        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();

        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], c4[2][i], c5[3][i], null, null, null, null));
        }

        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }

    public ObservableList<GrammarTopicsTableviewHelper> getData(String[] c1, String[][] c2, String[][] c3,
            String[][] c4, String[][] c5, String[][] c6, String[][] c7, String[][] c8, String[][] c9) {

        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();

        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], c4[2][i], c5[3][i], c6[4][i], c7[5][i], c8[6][i], c9[7][i]));
        }

        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }

    public ObservableList<GrammarTopicsTableviewHelper> getData(String[] c1, String[][] c2, String[][] c3,
            String[][] c4, String[][] c5, String[][] c6, String[][] c7, String[][] c8) {

        List<GrammarTopicsTableviewHelper> list = new ArrayList<>();

        for (int i = 0; i < c1.length; i++) {
            list.add(new GrammarTopicsTableviewHelper(c1[i], c2[0][i], c3[1][i], c4[2][i], c5[3][i], c6[4][i], c7[5][i], c8[6][i], null));
        }

        ObservableList<GrammarTopicsTableviewHelper> data = FXCollections.observableArrayList(list);
        return data;
    }
}
