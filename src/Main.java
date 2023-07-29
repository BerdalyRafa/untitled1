import java.util.Scanner;

public class Main {
    // gcd of a and b using recursion/euclidian algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Sorry, try again by entering non-negative numbers");
        } else {
            int result = gcd(a, b);
            System.out.println(result);
        }

        scanner.close();
    }
}
