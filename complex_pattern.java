import java.util.*;

public class complex_pattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {

            String s = sc.nextLine();

            list.add(s);
        }

        int max = 0;

        for (String s : list) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        int width = max + 2;

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (String s : list) {

            int total = max - s.length();

            int left = (total + 1) / 2;
            int right = total / 2;

            System.out.print("*");

            for (int i = 0; i < left; i++) {
                System.out.print("-");
            }

            System.out.print(s);

            for (int i = 0; i < right; i++) {
                System.out.print("-");
            }

            System.out.println("*");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }
}