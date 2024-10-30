import java.util.Scanner;

public class EverySecondLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        StringBuilder everySecondLetter = new StringBuilder();

        for (int i = 1; i < input.length(); i += 2) {
            everySecondLetter.append(input.charAt(i));
        }

        System.out.println("Every second letter: " + everySecondLetter.toString());

        scanner.close();
    }
}
