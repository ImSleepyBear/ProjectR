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
public class GrammarTopicsTableviewHelper {
    
    private final SimpleStringProperty c1;
    private final SimpleStringProperty c2;
    private final SimpleStringProperty c3;
    private final SimpleStringProperty c4;
    private final SimpleStringProperty c5;
    private final SimpleStringProperty c6;
    private final SimpleStringProperty c7;
    private final SimpleStringProperty c8;
    private final SimpleStringProperty c9;
    
    public GrammarTopicsTableviewHelper(String item_1, String item_2, String item_3, String item_4,
            String item_5, String item_6, String item_7, String item_8, String item_9){
        this.c1 = new SimpleStringProperty(item_1);
        this.c2 = new SimpleStringProperty(item_2);
        this.c3 = new SimpleStringProperty(item_3);
        this.c4 = new SimpleStringProperty(item_4);
        this.c5 = new SimpleStringProperty(item_5);
        this.c6 = new SimpleStringProperty(item_6);
        this.c7 = new SimpleStringProperty(item_7);
        this.c8 = new SimpleStringProperty(item_8);
        this.c9 = new SimpleStringProperty(item_9);
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
    
    public String getC3() {
        return c3.get();
    }

    public void setC3(String c3) {
        this.c3.set(c3);
    }

    public String getC4() {
        return c4.get();
    }
    
    public void setC4(String c4) {
        this.c4.set(c4);
    }

    public String getC5() {
        return c5.get();
    }

    public void setC5(String c5) {
        this.c5.set(c5);
    }

    public String getC6() {
        return c6.get();
    }

    public void setC6(String c6) {
        this.c6.set(c6);
    }

    public String getC7() {
        return c7.get();
    }
    
    public void setC7(String c7) {
        this.c7.set(c7);
    }

    public String getC8() {
        return c8.get();
    }

    public void setC8(String c8) {
        this.c8.set(c8);
    }

    public String getC9() {
        return c9.get();
    }

    public void setC9(String c9) {
        this.c9.set(c9);
    }
    
}
