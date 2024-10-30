import java.util.Scanner;

public class SmallLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (type 'done' to finish):");

        int Small = Integer.MAX_VALUE;
        int Large = Integer.MIN_VALUE;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < Small) {
                    Small = number;
                }
                if (number > Large) {
                    Large = number;
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                }
            }
        }

        if (Small == Integer.MAX_VALUE && Large == Integer.MIN_VALUE) {
            System.out.println("No valid integers were entered.");
        } else {
            System.out.println("Smallest number: " + Small);
            System.out.println("Largest number: " + Large);
        }

        scanner.close();
    }
}
