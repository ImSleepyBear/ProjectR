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
        "a", "b", "v", "g", "d", "e, ie, je (see spelling rules)", "o, io, jo (see spelling rules)",
        "zj", "z", "i", "j", "k", "l", "m", "n", "o (stressed: å, unstressed: a)",
        "p", "r (rolling)", "s", "t", "u (o)", "f", "ch", "ts", "tj", "sj", "sjtj",
        "n/a", "i (back of the mouth i)", "n/a", "e (ä)", "iu, ju", "ia, ja"
    };

    public String[] russianPronunciation = {
        "а", "бэ", "вэ", "гэ", "дэ", "е", "ё", "жэ", "зэ", "и", "и краткое", "ка", "эль", "эм",
        "эн", "о", "пэ", "эр", "эс", "тэ", "у", "эф", "ха", "цэ", "чэ", "ша", "ща", "твёрдый знак (hard sign)",
        "ы", "мягкий знак (soft sign)", "э оворотное", "йу", "йа"
    };

    public String[] consonantsAndVowels = { //Consonant Vowel
        "Vowel", "Consonant", "Consonant", "Consonant", "Consonant", "Vowel", "Vowel", "Consonant",
        "Consonant", "Vowel", "Consonant", "Consonant", "Consonant", "Consonant", "Consonant", "Vowel",
        "Consonant", "Consonant", "Consonant", "Consonant", "Vowel", "Consonant", "Consonant", "Consonant",
        "Consonant", "Consonant", "Consonant", "Consonant", "Vowel", "Consonant", "Vowel", "Vowel", "Vowel"
    };

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
        "Old and Updated Alphabet Letters", "Miscellaneus - Names", 
        "Miscellaneous - Weekdays", "Miscellaneous - Months"
    };

    public String[] spellingRules = {
        "Unstressed O can't follow ж, ц, ч, ш, and щ; and instead uses the letter Е",
        "Я is written as A, and Ю is written as У, after the letters Г, К, Ж, Х, Ш, and Щ",
        "Ы is written as И after Г, К, Ж, Х, Ш, and Щ",
        "The letter Ы, and the signs Ь and Ъ, aren't used in the beginning of words. The letter Й is only used with a vowel",
        "Stressing accents and the dots over Ё aren't used in ordinary russian texts"
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

    public String[] substantives = {};

    public String[] adjectives = {};

    public String[] verbs = {};

    public String[] grammaticalTerms = {
        "Accusative", "Adverbs", "Case", "Dative", "Gender", "Genitive", "Imperative", "Imperfect",
        "Instrumental", "Locative", "Nominative", "Perfect", "Pronouns", "Substantives", "Verbs"
    };

    public String[] grammarTermsTableview = {
        "Nominative", "Genitive", "Dative", "Accusative", "Imperative", "Locative"
    };

    public String[] genders = {
        "Feminine", "Masculine", "Neuter"
    };

    public String[] genderRules = {};

    public String[] singularPlural = {
        "Singular", "Plural"
    };

    public String[] audioFileNames = { // should contain the names of the audio files that comes with the application
    };

    public String[] imageFileNames = { // should contain the names of the image files available for the application
    };

}
