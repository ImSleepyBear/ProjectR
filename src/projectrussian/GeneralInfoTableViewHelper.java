/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrussian;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Mohini
 */
public class GeneralInfoTableViewHelper {

    private final SimpleStringProperty c1;
    private final SimpleStringProperty c2;

    public GeneralInfoTableViewHelper(String item_1, String item_2) {
        this.c1 = new SimpleStringProperty(item_1);
        this.c2 = new SimpleStringProperty(item_2);
    }

    public String getC1() {
        return c1.get();
    }

    public void setC1(String c1) {
        this.c1.set(c1);
    }

    public String getC2() {
        return c2.get();
    }

    public void setC2(String c2) {
        this.c2.set(c2);
    }

}
