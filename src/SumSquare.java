public class SumSquare {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("The sum of the squares of all integers between 1 and 100 is: " + sum);
    }
}
