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

    private String[] latinLetters = {
        "a", "b", "v", "g", "d", "e (stressed: je, unstressed: ji)", "e (jå, always stressed)",
        "zj", "z", "i", "j", "k", "l", "m", "n", "o (stressed: å, unstressed: a)",
        "p", "r (rolling)", "s", "t", "u (o)", "f", "ch", "ts (tze)", "tj (tje)",
        "sj (sja)", "sjtj", "n/a (твёрдый знак, or hard sign)", "i (back of the mouth i)",
        "n/a (мягкий знак, or soft sign)", "e (ä)", "jo", "ja"
    };
    
    private String[] russianPronunciation = {
        
    };

    private String[] russianAndLatinLetters = new String[33];

    private String[] mainMenuListview = {
        "Russian alphabet", "Grammar (Work In Progress)", "Practice (Coming Soon)", "General Info (Coming Soon)", "Settings (Coming Soon)"
    };

    private String[] sceneDestinations = {
        "AlphabetView", "Grammar", "Practice", "GeneralInfo", "Settings", "MainPage"
    };

    private String[] grammarListview = {
        "Beginner - Alphabet/Spelling Rules", "Beginner - Russian Pronunciation", "Beginner - Russian Punctuation",
        "Beginner - Genders", "Beginner - Case", "Beginner - Genitive", "Beginner - Dative", "Beginner - Accusative",
        "Beginner - Instrumentalis", "Beginner - Locative", "Beginner - Substantives/Nouns", "Beginner - Adjectives",
        "Beginner - Possessive Pronouns in Nominative", "Beginner - Personal Pronouns", "Beginner - Numerals",
        "Beginner - Verbs in Present Tense", "Beginner - Preteritum", "Beginner - Verb Aspects",
        "Beginner - Imperative",
        "Beginner",
        "Intermediate - Verbs in Past Tense",
        "Intermediate",
        "Advanced - Verbs in Past Futurum", 
        "Advanced"
    };

    private String[] generalInfoListview = {
        "Alphabet - Old and Updated Letters", "Miscellaneus - Names"
    };

    private String[] spellingRules = {
        "Unstressed O can't follow ж, ц, ч, ш, and щ; and instead uses the letter Е",
        "Я is written as A, and Ю is written as У, after the letters Г, К, Ж, Х, Ш, and Щ",
        "Ы is written as И after Г, К, Ж, Х, Ш, and Щ"
    };

    private String[] audioFileNames = { // should contain the names of the audio files that comes with the application
    };

    private String[] imageFileNames = { // should contain the names of the image files available for the application
    };

    private String[] weekdaysLatin = {
        
    };
    
    private String[] weekdaysRussian = {
        
    };
    
    private String[] monthsLatin = {
        
    };
    
    private String[] monthsRussian = {
        
    };
    
    public String[] getRussianLetters() {
        return russianLetters;
    }

    public String[] getLatinLetters() {
        return latinLetters;
    }

    public String[] getRussianPronunciation() {
        return russianPronunciation;
    }

    public String[] getRussianAndLatinLetters() {
        russianAndLatinLetters[0] = "Russian letters: Transcribed letters";
        for (int i = 0; i < 34; i++) {
            russianAndLatinLetters[i] = getRussianLetters()[i - 1] + ": " + getLatinLetters()[i - 1];
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

    public String[] getGrammarListView() {
        return grammarListview;
    }

    public String[] getGeneralInfoListview() {
        return generalInfoListview;
    }

    public String[] getSpellingRules() {
        return spellingRules;
    }

    public String[] getAudioFileNames() {
        return audioFileNames;
    }

    public String[] getWeekdaysLatin() {
        return weekdaysLatin;
    }

    public String[] getWeekdaysRussian() {
        return weekdaysRussian;
    }

    public String[] getMonthsLatin() {
        return monthsLatin;
    }

    public String[] getMonthsRussian() {
        return monthsRussian;
    }

}
