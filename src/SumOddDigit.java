import java.util.Scanner;

public class SumOddDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        int sum = 0;
        for (char c : input.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit % 2 != 0) {
                sum += digit;
            }
        }

        System.out.println("The sum of all odd digits is: " + sum);

        scanner.close();
    }
}
