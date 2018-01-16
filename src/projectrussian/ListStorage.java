/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrussian;

/**
 *
 * @author mohini
 */
public class ListStorage {
    
    private String[] russianLetters = {
        "А а", "Б б", "В в", "Г г", "Д д", "Е е", "Ё ё", "Ж ж", "З з", "И и", "Й й", "К к", 
        "Л л", "М м", "Н н", "О о", "П п", "Р р", "С с", "Т т", "У у", "Ф ф", "Х х", "Ц ц", 
        "Ч ч", "Ш ш", "Щ щ", "Ъ ъ", "Ы ы", "Ь ь", "Э э", "Ю ю", "Я я"
    };
    
    private String[] transcribedLetters = {
        "a", "b", "v", "g", "d", "e (je)", "e (jo)", "zj", "z", "i", "j", "k", "l", "m", "n", "o (å)",
        "p", "r", "s", "t", "u (o)", "f", "ch", "ts (tze)", "tj (tje)", "sj (sja)", "sjtj", 
        "n/a (твёрдый знак, or hard sign)", "y", "n/a (мягкий знак, or soft sign)", "e (ä)", "ju", "ja"
    };
    
    private String[] russianAndLatinLetters = new String[34];
    
    private String[] mainMenuListview = {
        "Russian alphabet (Coming Soon)", "Practice on russian alphabet (Coming Soon)", "Russian Grammar (Coming Soon)"
    };
    
    private String[] sceneDestinations = {
        "RussianAlphabet", "Test", "MainPage"
    };
    

    public String[] getRussianLetters() {
        return russianLetters;
    }

    public String[] getLatinLetters() {
        return transcribedLetters;
    }
    
    public String[] getRussianAndLatinLetters(){
        russianAndLatinLetters[0] = "Russian letters: Transcribed letters";
        for(int i = 0; i < 34; i++){
            russianAndLatinLetters[i] = getRussianLetters()[i-1] + ": " + getLatinLetters()[i-1];
            System.out.println(russianAndLatinLetters[i]);
        }
        return russianAndLatinLetters;
    }

    public String[] getMainMenuListview() {
        return mainMenuListview;
    }

    public String[] getSceneDestinations() {
        return sceneDestinations;
    }
    
}
