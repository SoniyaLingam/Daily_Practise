import java.util.*;

class Generate_all_binary_strings{

    public static void generate(int n, String curr) {

        // Base case
        if (curr.length() == n) {
            System.out.println(curr);
            return;
        }

        // Add 0
        generate(n, curr + "0");

        // Add 1
        generate(n, curr + "1");
    }

    public static void main(String[] args) {

        int n = 3;

        generate(n, "");
    }
}