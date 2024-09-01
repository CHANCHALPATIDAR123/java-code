import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

class PasswordGenerator {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?";
    private static final String ALL_CHARACTERS = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARACTERS;
    private static final int PASSWORD_LENGTH = 12;

    private static SecureRandom random = new SecureRandom();
    private static Set<String> generatedPasswords = new HashSet<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateUniquePassword());
        }
    }

    public static String generateUniquePassword() {
        String password;
        do {
            password = generatePassword();
        } while (generatedPasswords.contains(password));
        generatedPasswords.add(password);
        return password;
    }

    private static String generatePassword() {
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int index = random.nextInt(ALL_CHARACTERS.length());
            password.append(ALL_CHARACTERS.charAt(index));
        }
        return password.toString();
    }
}
