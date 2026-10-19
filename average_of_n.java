//-------------DT--------------------(Java)
import java.util.*;

public class average_of_n{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String[] b = sc.nextLine().split("\\s+");

        int sum = 0;
        for (String s : b) {
            sum += Integer.parseInt(s);
        }

        System.out.printf("%.2f%n", (double) sum / a);
    }
}