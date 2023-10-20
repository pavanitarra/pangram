import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Create a set to store the unique characters in the input
        Set<Character> uniqueCharacters = new HashSet<>();

        // Iterate over the input and add each character to the set
        for (int i = 0; i < input.length(); i++) {
            uniqueCharacters.add(input.charAt(i));
        }

        // Check if the set contains all 26 letters of the alphabet
        return uniqueCharacters.size() == 26;
    }

    public static void main(String[] args) {
        // Get the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input is a pangram
        boolean isPangram = isPangram(input);

        // Print the result
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}