public class CharacterSet {
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    public static String getUpperCase() {
        return UPPER_CASE;
    }

    public static String getLowerCase() {
        return LOWER_CASE;
    }

    public static String getDigits() {
        return DIGITS;
    }

    public static String getSpecialChars() {
        return SPECIAL_CHARS;
    }
}
