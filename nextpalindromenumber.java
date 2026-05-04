import java.util.*;

public class nextpalindromenumber{
    public static boolean isPalindrome(long n) {
        long rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        n++;

        while (true) {
            if (isPalindrome(n)) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}