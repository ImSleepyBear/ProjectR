package projectrussian;

/**
 *
 * @author mohini
 */
public class ListStorage {

    
    // lists used in the main view
    public String[] mainMenuListview = {
        "Russian alphabet", "Grammar (Work In Progress)", "Practice (Coming Soon)", "General Language and Country Info (Coming Soon)", "Settings (Coming Soon)"
    };

    public String[] sceneDestinations = {
        "AlphabetView", "Grammar", "Practice", "GeneralInfo", "Settings", "MainPage"
    };

    
    //lists that deals with the russian alphabet
    
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

    
    //lists that has to do with listviews in the grammar, and generalinfo, part
    public String[] grammarListview = {
        "Beginner - Gender", "Beginner - Case", "Beginner - Genitive Case", "Beginner - Dative Case",
        "Beginner - Accusative Case", "Beginner - Nominative Case", "Beginner - Instrumentalis Case",
        "Beginner - Locative Case", "Beginner - Substantives/Nouns", "Beginner - Adjectives",
        "Beginner - Possessive Pronouns", "Beginner - Personal Pronouns", "Beginner - Numerals",
        "Beginner - Verbs", "Beginner - Preteritum", "Beginner - Verb Aspects", "Beginner - Imperative",
        "Beginner",
        "Intermediate - Verbs in Past Tense",
        "Intermediate",
        "Advanced - Verbs in Past Futurum",
        "Advanced",
        "Demonstrative Pronouns", "Determinative Pronouns", "Interrogative Pronouns"
    };

    public String[] generalInfoListview = {
        "Alphabet/Spelling Rules", "Russian Pronunciation", "Russian Punctuation",
        "Old and Updated Alphabet Letters", "Miscellaneus - Names",
        "Miscellaneous - Weekdays", "Miscellaneous - Months"
    };
    
    
    //lists regarding general info
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

    
    //lists regarding grammar
    public String[] feminineSubstantiveEndings = {
        "Terms", "-А", "-ГА, -КА etc.", "-Я", "-ИЯ", "-Ь"
    };
    
    public String[] masculineSubstantiveEndings = {
        "Terms", "hard", "-Ь", "-Ж, -Ч, -Ш, -Щ", "-АЙ"
    };
    
    public String[] neutralSubstantiveEndings = {
        "Terms", "-О", "-Е", "-ИЕ", "-МЯ"
    };
    
    public String[][] substantivesNeutralSingular = {
        {"-О", "-А", "-У", "-О", "-ОМ", "-Е"},
        {"-Е", "-Я", "-Ю", "-Е", "-ЕМ", "-Е"},
        {"-ИЕ", "-ИЯ", "-ИЮ", "-ИЕ", "-ИЕМ", "-ИИ"},
        {"-МЯ", "-МЕНИ", "-МЕНИ", "-МЯ", "-МЕНЕМ", "-МЕНИ"},
    };
    
    public String[][] substantivesNeutralPlural = {
        {"-А", "-", "-АМ", "-А", "-АМИ", "-АХ"},
        {"-ЯА", "-ЕЙ", "-ЯМ", "-Я", "-ЯМИ", "-ЯХ"},
        {"-Я", "-Й", "-ЯМ", "-Я", "-ЯМИ", "-ЯХ"},
        {"-ЕНА", "-ЁН", "-ЕНАМ", "-ЕНА", "-ЕНАМИ", "-ЕНАХ"}
    };
    
    public String[][] substantivesMasculineSingular = {
        {"-", "-А", "-У", "-", "-ОМ", "-Е"},
        {"-Ь", "-", "-Ю", "-Я", "-ЕМ", "-Е"},
        {"-", "-А", "-У", "-", "-ОМ", "-Е"},
        {"-АЙ", "-АЯ", "-АЮ", "-АЙ", "-АЕМ", "-АЕ"}
    };
    
    public String[][] substantivesMasculinePlural = {
        {"-Ы", "-ОВ", "-АМ", "-Ы", "-АМИ", "-АХ"},
        {"-И", "-ЕЙ", "-ЯМ", "-ЕЙ", "-ЯМИ", "-ЯХ"},
        {"-И", "-ЕЙ", "-АМ", "-И", "-АМИ", "-АХ"},
        {"-Й", "-ЕВ", "-ЯМ", "-И", "-ЯМИ", "-ЯХ"}
    };
    
    public String[][] substantivesFeminineSingular = {
        {"-А", "-Ы", "-Е", "-У", "-ОЙ", "-Е"},
        {"-А", "-И", "-Е", "-У", "-ОЙ", "-Е"},
        {"-Я", "-И", "-Е", "-Ю", "-ЕЙ", "-Е"},
        {"-ИЯ", "-ИИ", "-ИИ", "-ИЮ", "-ИЕЙ", "-ИИ"},
        {"-Ь", "-И", "-И", "-Ь", "-Ю", "-И"}
    };
    
    public String[][] substantivesFemininePlural = {
        {"-Ы", "-", "-АМ", "-Ы", "-АМИ", "-АХ"},
        {"-КИ", "-ЕК", "-КАМ", "-ЕК", "-КАМИ", "-КАХ"},
        {"-И", "-Ь", "-ЯМ", "-И", "-ЯМИ", "-ЯХ"},
        {"-ИИ", "-ИЙ", "-ИЯМ", "-ИИ", "-ИЯМИ", "-ИЯХ"},
        {"-И", "-ЕЙ", "-ЯИ", "-И", "-ЯМИ", "-ЯХ"}
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
    
    public String[] grammarTermsForTableviewShort = {
        "N", "G", "D", "A", "I", "L"
    };

    public String[] genders = { //keep this variable for labels, or dispose of it if not used?
        "Feminine", "Masculine", "Neuter"
    };

    public String genderInfo = "Russian has three genders, namely feminine, masculine, and neuter. They "
            + "can most of the time be identified by the last letter.";
    
    public String[] genderRules = {};

    public String[] singularPlural = { //keep this variable, or dispose of it?
        "Singular", "Plural"
    };

    public String[] englishPersonalPronouns = {
        "Terms", "I/Me", "You", "He/Him", "She/Her", "It", "We/Us", "You", "They/Them"
    };
    
    public String[][] personalPronouns = {
        {"Я", "МЕНЯ", "МНЕ", "МЕНЯ", "МНОЙ", "МНЕ"},
        {"ТЫ", "ТЕБЯ", "ТЕБЕ", "ТЕБЯ", "ТОБОЙ", "ТЕБЕ"},
        {"ОН", "ЕГО", "ЕМУ", "ЕГО", "ИМ", "НЁМ"},
        {"ОНА", "ЕЁ", "ЕЙ", "ЕЁ", "ЕЙ", "НЕЙ"},
        {"ОНО", "ЕГО", "ЕГО", "ЕМУ", "ИМ", "НЁМ"},
        {"МЫ", "НАС", "НАМ", "НАС", "НАМИ", "НАС"},
        {"ВЫ", "ВАС", "ВАМ", "ВАС", "ВАМИ", "ВАС"},
        {"ОН", "ИХ", "ИМ", "ИХ", "ИМИ", "НИХ"}
    };

    public String[] possessivePronounsPerson = {
        "First person singular", "First person plural", "Second person singular", "Second person plural",
        "Third person singular", "Third person plural"
    };
    
    public String[][] possessivePronounsFirstPersonSingular = {
        {"МОЙ", "МОЕГО", "МОЕМУ", "МОЙ, МОЕГО", "МОИМ", "МОЁМ"},
        {"МОЯ", "МОЕЙ", "МОЕЙ", "МОЮ", "МОЕЙ", "МОЕЙ"},
        {"МОЁ", "МОЕГО", "МОЕМУ", "МОЁ", "МОИМ", "МОЁМ"},
        {"МОИ", "МОИХ", "МОИМ", "МОИ, МОИХ", "МОИМИ", "МОИХ"}
    };
    
    public String[][] possessivePronounsFirstPersonPlural = {
        {"НАШ", "НАШЕГО", "НАШЕМУ", "НАШ, НАШЕГО", "НАШИМ", "НАШЕМ"},
        {"НАША", "НАШЕЙ", "НАШЕЙ", "НАШУ", "НАШЕЙ", "НАШЕЙ"},
        {"НАШЕ", "НАШЕГО", "НАШЕМУ", "НАШЕ", "НАШИМ", "НАШЕМ"},
        {"НАШИ", "НАШИХ", "НАШИМ", "НАШИ, НАШИХ", "НАШИМИ", "НАШИХ"}
    };
    
    public String[][] possessivePronounsSecondPersonSingular = {
        {"ТВОЙ", "ТВОЕГО", "ТВОЕМУ", "ТВОЙ, ТВОЕГО", "ТВОИМ", "ТВОЁМ"},
        {"ТВОЯ", "ТВОЕЙ", "ТВОЕЙ", "ТВОЮ", "ТВОЕЙ", "ТВОЕЙ"},
        {"ТВОЁ", "ТВОЕГО", "ТВОЕМУ", "ТВОЁ", "ТВОИМ", "ТВОЁМ"},
        {"ТВОИ", "ТВОИХ", "ТВОИМ", "ТВОИ, ТВОИХ", "ТВОИМИ", "ТВОИХ"}
    };
    
    public String[][] possessivePronounsSecondPersonPlural = {
        {"ВАШ", "ВАШЕГО", "ВАШЕМУ", "ВАШ, ВАШЕГО", "ВАШИМ", "ВАШЕМ"},
        {"ВАША", "ВАШЕЙ", "ВАШЕЙ", "ВАШУ", "ВАШЕЙ", "ВАШЕЙ"},
        {"ВАШЕ", "ВАШЕГО", "ВАШЕМУ", "ВАШЕ", "ВАШИМ", "ВАШЕМ"},
        {"ВАШИ", "ВАШИХ", "ВАШИМ", "ВАШИ, ВАШИХ", "ВАШИМИ", "ВАШИХ"}
    };
    
    public String[] possessivePronounsThirdPerson = {
        "Third person singular always use Его (m., n.) or Её (f) regardless of the case of the noun modifier",
        "Third person plural always use Их regardless of gender and case of the nound modifier"
    };
    
    public String[][] reflexivePossessivePronouns = {};

    
    //lists that deals with possible audio, and image files
    public String[] audioFileNames = { // should contain the names of the audio files that comes with the application
    };

    public String[] imageFileNames = { // should contain the names of the image files available for the application
    };

}
