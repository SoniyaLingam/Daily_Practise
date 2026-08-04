import java.util.*;

class Same_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");

        Set<String> set = new HashSet<>();
        Set<String> counted = new HashSet<>();

        for (String word : b) {
            set.add(word);
        }

        int count = 0;

        for (String word : a) {
            if (set.contains(word) && !counted.contains(word)) {
                count++;
                counted.add(word);
            }
        }

        System.out.println(count);
    }
}