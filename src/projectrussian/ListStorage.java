package projectrussian;

/**
 *
 * @author mohini
 */
public class ListStorage {

    public String[] mainMenuListview = {
        "Russian alphabet", "Grammar (Work In Progress)", "Practice (Coming Soon)", "General Info (Coming Soon)", "Settings (Coming Soon)"
    };

    public String[] sceneDestinations = {
        "AlphabetView", "Grammar", "Practice", "GeneralInfo", "Settings", "MainPage"
    };

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

    public String[][] weekdays = {
        {"English", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"},
        {"Russian", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"}
    };

    public String[][] monthsEnglish = {
        {"English", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"},
        {"Russian", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", " Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"}
    };

    public String[][] substantivesFeminineSingular = {
        {"-О", "-Е", "-ИЕ", "-МЯ"},
        {"-О", "-Е", "-ИЕ", "-МЯ"},
        {"-А", "-Я", "-ИЯ", "-МЕНИ"},
        {"-У", "-Ю", "-ИЮ", "-МЕНИ"},
        {"-О", "-Е", "-ИЕ", "-МЯ"},
        {"-ОМ", "-ЕМ", "-ИЕМ", "-МЕНЕМ"},
        {"-Е", "-Е", "-ИИ", "-МЕНИ"},
    };
    
    public String[][] substantivesFemininePlural = {
        {"-О", "-Е", "-ИЕ", "-МЯ"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
    };
    
    public String[][] substantivesMasculineSingular = {
        {"hard", "-Ь", "-Ж, -Ч, -Ш, -Щ", "-АЙ"},
        {"N/A", "-Ь", "-", "-АЙ"},
        {"-А", "N/A", "-А", "-АЯ"},
        {"-У", "-Ю", "-У", "-АЮ"},
        {"N/A", "-Я", "-", "-АЙ"},
        {"-ОМ", "-ЕМ", "-ОМ", "-АЕМ"},
        {"-Е", "-Е", "-Е", "-АЕ"}
    };
    
    public String[][] substantivesMasculinePlural = {
        {"hard", "-Ь", "-Ж, -Ч, -Ш, -Щ", "-АЙ"},
        {"-Ы", "-И", "-И", "-Й"},
        {"-ОВ", "-ЕЙ", "-ЕЙ", "-ЕВ"},
        {"-АМ", "-ЯМ", "-АМ", "-ЯМ"},
        {"-Ы", "-ЕЙ", "-И", "-И"},
        {"-АМИ", "-ЯМИ", "-АМИ", "-ЯМИ"},
        {"-АХ", "-ЯХ", "-АХ", "-ЯХ"}
    };
    
    public String[][] substantivesNeuterSingular = {
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
    };
    
    public String[][] substantivesNeuterPlural = {
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
        {"-", "-", "-", "-"},
    };

    public String[] adjectives = {};

    public String[] verbs = {};

    public String[] grammaticalTerms = {
        "Accusative", "Adverbs", "Case", "Dative", "Gender", "Genitive", "Imperative", "Imperfect",
        "Instrumental", "Locative", "Nominative", "Perfect", "Pronouns", "Substantives", "Verbs"
    };

    public String[] grammarTermsForTableview = {
        "Nominative", "Genitive", "Dative", "Accusative", "Imperative", "Locative"
    };

    public String[] genders = { //keep this variable for labels, or dispose of it if not used?
        "Feminine", "Masculine", "Neuter"
    };

    public String[] genderRules = {};

    public String[] singularPlural = { //keep this variable, or dispose of it?
        "Singular", "Plural"
    };

    public String[][] personalPronouns = {
        {"Я", "ТЫ", "ОН", "ОНА", "МЫ", "ВЫ", "ОН"},
        {"МЕНЯ", "ТЕБЯ", "ЕГО", "ЕЁ", "НАС", "ВАС", "ИХ"},
        {"МНЕ", "ТЕБЕ", "ЕМУ", "ЕЙ", "НАМ", "ВАМ", "ИМ"},
        {"МЕНЯ", "ТЕБЯ", "ЕГО", "ЕЁ", "НАС", "ВАС", "ИХ"},
        {"МНОЙ", "ТОБОЙ", "ИМ", "ЕЙ", "НАМИ", "ВАМИ", "ИМИ"},
        {"МНЕ", "ТЕБЕ", "НЁМ", "НЕЙ", "НАС", "ВАС", "НИХ"}
    };

    public String[][] possessivePronouns = {};

    public String[] audioFileNames = { // should contain the names of the audio files that comes with the application
    };

    public String[] imageFileNames = { // should contain the names of the image files available for the application
    };

}
