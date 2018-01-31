package projectrussian;

/**
 *
 * @author mohini
 */
public class ListStorage {

    public String[] russianLetters = {
        "А а", "Б б", "В в", "Г г", "Д д", "Е е", "Ё ё", "Ж ж", "З з", "И и", "Й й", "К к",
        "Л л", "М м", "Н н", "О о", "П п", "Р р", "С с", "Т т", "У у", "Ф ф", "Х х", "Ц ц",
        "Ч ч", "Ш ш", "Щ щ", "Ъ ъ", "Ы ы", "Ь ь", "Э э", "Ю ю", "Я я"
    };

    public String[] latinLetters = {
        "a", "b", "v", "g", "d", "e (stressed: je, unstressed: ji)", "e (jå, always stressed)",
        "zj", "z", "i", "j", "k", "l", "m", "n", "o (stressed: å, unstressed: a)",
        "p", "r (rolling)", "s", "t", "u (o)", "f", "ch", "ts (tze)", "tj (tje)",
        "sj (sja)", "sjtj", "n/a (твёрдый знак, or hard sign)", "i (back of the mouth i)",
        "n/a (мягкий знак, or soft sign)", "e (ä)", "jo", "ja"
    };
    
    public String[] russianPronunciation = {
        
    };

    public String[] russianAndLatinLetters = new String[33];

    public String[] mainMenuListview = {
        "Russian alphabet", "Grammar (Work In Progress)", "Practice (Coming Soon)", "General Info (Coming Soon)", "Settings (Coming Soon)"
    };

    public String[] sceneDestinations = {
        "AlphabetView", "Grammar", "Practice", "GeneralInfo", "Settings", "MainPage"
    };

    public String[] grammarListview = {
        "Beginner - Gender Endings", "Beginner - Case", "Beginner - Genitive Case", "Beginner - Dative Case", 
        "Beginner - Accusative Case", "Beginner - Nominative Case", "Beginner - Instrumentalis Case", 
        "Beginner - Locative Case", "Beginner - Substantives/Nouns", "Beginner - Adjectives", 
        "Beginner - Possessive Pronouns", "Beginner - Personal Pronouns", "Beginner - Numerals",
        "Beginner - Verbs", "Beginner - Preteritum", "Beginner - Verb Aspects", "Beginner - Imperative",
        "Beginner",
        "Intermediate - Verbs in Past Tense",
        "Intermediate",
        "Advanced - Verbs in Past Futurum", 
        "Advanced"
    };

    public String[] generalInfoListview = {
        "Alphabet/Spelling Rules", "Russian Pronunciation", "Russian Punctuation",
        "Old and Updated Alphabet Letters", "Miscellaneus - Names"
    };

    public String[] spellingRules = {
        "Unstressed O can't follow ж, ц, ч, ш, and щ; and instead uses the letter Е",
        "Я is written as A, and Ю is written as У, after the letters Г, К, Ж, Х, Ш, and Щ",
        "Ы is written as И after Г, К, Ж, Х, Ш, and Щ",
        "The letter Ы, and the signs Ь and Ъ, aren't used in the beginning of words. The letter Й is only used with a vowel",
        "Stressing accents and the dots over Ё aren't used in ordinary russian texts"
    };

    public String[] audioFileNames = { // should contain the names of the audio files that comes with the application
    };

    public String[] imageFileNames = { // should contain the names of the image files available for the application
    };

    public String[] weekdaysLatin = {
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };
    
    public String[] weekdaysRussian = {
        "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"
    };
    
    public String[] monthsLatin = {
        "January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"
    };
    
    public String[] monthsRussian = {
        "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", " Август",
        "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
    };
    
    public String[] substantives = {
        
    };
    
    public String[] adjectives = {
        
    };
    
    public String[] verbs = {
        
    };
    
    public String[] grammaticalTerms = {
        "Accusative", "Adverbs", "Case", "Dative", "Gender", "Genitive", "Imperative", "Imperfect",
        "Instrumental", "Locative", "Nominative", "Perfect", "Pronouns", "Substantives", "Verbs"
    };
    
    public String[] grammarTermsTableview = {
        "Nominative", "Genitive", "Dative", "Accusative", "Imperative", "Locative"
    };
    
    public String[] basicCase = {
        "Feminine", "Masculine", "Neuter"
    };
    
    public String[] singularPlural = {
        "Singular", "Plural"
    };

    public String[] getRussianAndLatinLetters() {
        russianAndLatinLetters[0] = "Russian letters: Transcribed letters";
        for (int i = 0; i < 34; i++) {
            russianAndLatinLetters[i] = russianLetters[i - 1] + ": " + latinLetters[i - 1];
            System.out.println(russianAndLatinLetters[i]);
        }
        return russianAndLatinLetters;
    }
    
}
