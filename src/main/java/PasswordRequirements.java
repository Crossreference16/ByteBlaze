public class PasswordRequirements {
    private int length;
    private boolean includeUpper;
    private boolean includeLower;
    private boolean includeDigits;
    private boolean includeSpecial;

    public PasswordRequirements(int length, boolean includeUpper, boolean includeLower, boolean includeDigits, boolean includeSpecial) {
        this.length = length;
        this.includeUpper = includeUpper;
        this.includeLower = includeLower;
        this.includeDigits = includeDigits;
        this.includeSpecial = includeSpecial;
    }

    public int getLength() {
        return length;
    }

    public boolean isIncludeUpper() {
        return includeUpper;
    }

    public boolean isIncludeLower() {
        return includeLower;
    }

    public boolean isIncludeDigits() {
        return includeDigits;
    }

    public boolean isIncludeSpecial() {
        return includeSpecial;
    }

    public boolean isValidPassword(String password) {
        boolean hasUpper = !includeUpper || password.chars().anyMatch(Character::isUpperCase);
        boolean hasLower = !includeLower || password.chars().anyMatch(Character::isLowerCase);
        boolean hasDigits = !includeDigits || password.chars().anyMatch(Character::isDigit);
        boolean hasSpecial = !includeSpecial || password.chars().anyMatch(c -> CharacterSet.getSpecialChars().indexOf((char) c) >= 0);

        return hasUpper && hasLower && hasDigits && hasSpecial;
    }
}
