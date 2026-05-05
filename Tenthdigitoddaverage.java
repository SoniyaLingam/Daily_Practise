
import java.util.*;

public class Tenthdigitoddaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

            long temp = Math.abs(num);

            if (temp >= 10) {
                int digit = (int)((temp / 10) % 10);

                if (digit % 2 != 0) {
                    sum += num;
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.printf("0.00");
        } else {
            double avg = (double) sum / count;
            System.out.printf("%.2f", avg);
        }
    }
}