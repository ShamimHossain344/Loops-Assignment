import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("The sum of all odd numbers between " + a + " and " + b + " is: " + sum);

        scanner.close();
    }
}
