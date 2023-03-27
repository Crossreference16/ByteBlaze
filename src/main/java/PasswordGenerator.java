import java.security.SecureRandom;

public class PasswordGenerator {
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomPassword(PasswordRequirements requirements) {
        int length = requirements.getLength();
        if (length < 1) {
            throw new IllegalArgumentException("Invalid password length.");
        }

        StringBuilder password;
        do {
            password = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                String charSet = buildCharacterSet(requirements);
                password.append(charSet.charAt(random.nextInt(charSet.length())));
            }
        } while (!requirements.isValidPassword(password.toString()));

        return password.toString();
    }

    private static String buildCharacterSet(PasswordRequirements requirements) {
        StringBuilder charSet = new StringBuilder();
        if (requirements.isIncludeUpper()) {
            charSet.append(CharacterSet.getUpperCase());
        }
        if (requirements.isIncludeLower()) {
            charSet.append(CharacterSet.getLowerCase());
        }
        if (requirements.isIncludeDigits()) {
            charSet.append(CharacterSet.getDigits());
        }
        if (requirements.isIncludeSpecial()) {
            charSet.append(CharacterSet.getSpecialChars());
        }
        return charSet.toString();
    }

    public static void main(String[] args) {
        PasswordRequirements requirements = new PasswordRequirements(10, true, true, true, true);
        String password = generateRandomPassword(requirements);
        System.out.println(password);
    }
}

