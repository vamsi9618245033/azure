public class RecursionExample {

    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        if (n == 0) { // Base case
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
