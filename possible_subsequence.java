import java.util.*;

class possible_subsequence {

    public static void generate(String s, int index, String curr) {

        // Base case
        if (index == s.length()) {
            System.out.println(curr);
            return;
        }

        // Include current character
        generate(s, index + 1, curr + s.charAt(index));

        // Exclude current character
        generate(s, index + 1, curr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        generate(s, 0, "");
    }
}