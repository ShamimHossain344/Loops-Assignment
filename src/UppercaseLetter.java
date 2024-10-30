import java.util.Scanner;

public class UppercaseLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        StringBuilder uppercaseLetters = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseLetters.append(c);
            }
        }

        System.out.println("Uppercase letters: " + uppercaseLetters.toString());

        scanner.close();
    }
}
