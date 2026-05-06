import java.util.*;

public class printlargestdate{
    public static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isValid(int d, int m, int y) {
        if (m < 1 || m > 12 || d < 1)
            return false;

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (isLeap(y))
            days[1] = 29;

        return d <= days[m - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] dates = line.split(" ");

        int maxDay = -1, maxMonth = -1, maxYear = -1;

        for (String s : dates) {
            String[] parts = s.split("/");

            int d = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int y = Integer.parseInt(parts[2]);

            if (isValid(d, m, y)) {

                if (y > maxYear ||
                   (y == maxYear && m > maxMonth) ||
                   (y == maxYear && m == maxMonth && d > maxDay)) {

                    maxDay = d;
                    maxMonth = m;
                    maxYear = y;
                }
            }
        }

        if (maxYear == -1) {
            System.out.println("-1");
        } else {
            System.out.printf("%02d/%02d/%04d", maxDay, maxMonth, maxYear);
        }
    }
}