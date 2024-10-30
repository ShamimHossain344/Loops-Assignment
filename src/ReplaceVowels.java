import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        String replacedVowels = input.replaceAll("[AEIOUaeiou]", "_");

        System.out.println("String with vowels replaced: " + replacedVowels);

        scanner.close();
    }
}
