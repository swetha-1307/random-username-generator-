
import java.util.Random;

public class RandomUsernameGenerator {
    private static final String[] ADJECTIVES = {
        "Quick", "Happy", "Brave", "Clever", "Silly", "Mighty", "Sneaky", "Bold", "Swift", "Charming"
    };

    private static final String[] NOUNS = {
        "Lion", "Dragon", "Eagle", "Shark", "Panda", "Fox", "Wolf", "Tiger", "Bear", "Phoenix"
    };

    public static void main(String[] args) {
        Random random = new Random();
        
        String adjective = ADJECTIVES[random.nextInt(ADJECTIVES.length)];
        String noun = NOUNS[random.nextInt(NOUNS.length)];
        int number = random.nextInt(100); // Random number between 0 and 99

        String username = generateUsername(adjective, noun, number);
        System.out.println("Random Username: " + username);
    }

    private static String generateUsername(String adjective, String noun, int number) {
        return adjective + noun + number;
    }
}