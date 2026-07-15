import java.util.*;

class Train_departure_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String start = sc.next();

        // Print first station time
        System.out.print(start + " ");

        // Current time of Train Y
        String[] t = start.split(":");
        int curHour = Integer.parseInt(t[0]);
        int curMin = Integer.parseInt(t[1]);

        for (int i = 1; i < n; i++) {

            // Previous station of Train X
            String[] p = arr[i - 1].split(":");
            int ph = Integer.parseInt(p[0]);
            int pm = Integer.parseInt(p[1]);

            // Current station of Train X
            String[] c = arr[i].split(":");
            int ch = Integer.parseInt(c[0]);
            int cm = Integer.parseInt(c[1]);

            // Convert to minutes
            int prev = ph * 60 + pm;
            int curr = ch * 60 + cm;

            // Interval between stations
            int diff = curr - prev;

            // Add interval to Train Y
            int total = curHour * 60 + curMin + diff;

            curHour = (total / 60) % 24;
            curMin = total % 60;

            System.out.printf("%02d:%02d", curHour, curMin);

            if (i != n - 1)
                System.out.print(" ");
        }
    }
}