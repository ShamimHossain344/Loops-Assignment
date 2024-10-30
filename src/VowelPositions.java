import java.util.Scanner;

public class VowelPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        StringBuilder positions = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if ("AEIOUaeiou".indexOf(input.charAt(i)) != -1) {
                positions.append(i).append(" ");
            }
        }

        System.out.println("Positions of vowels: " + positions.toString().trim());

        scanner.close();
    }
}
