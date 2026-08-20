import java.util.Scanner;

public class divisor_bit_striver{

    public static int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine whether the answer is negative
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert both numbers to positive long values
        long dividendValue = Math.abs((long) dividend);
        long divisorValue = Math.abs((long) divisor);

        long quotient = 0;

        // Keep subtracting until dividend becomes smaller than divisor
        while (dividendValue >= divisorValue) {

            int shift = 0;

            // Find the largest power-of-2 multiple of divisor
            // that can be subtracted from dividend
            while (dividendValue >= (divisorValue << (shift + 1))) {
                shift++;
            }

            // Add 2^shift to quotient
            quotient += (1L << shift);

            // Subtract the shifted divisor
            dividendValue -= (divisorValue << shift);
        }

        // Apply the sign
        if (negative) {
            quotient = -quotient;
        }

        // Handle 32-bit integer range
        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) quotient;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Division by zero is not allowed
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {

            int result = divide(dividend, divisor);

            System.out.println("Quotient = " + result);
        }

        sc.close();
    }
}