import java.util.*;

class Toggle_Vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Check if position is odd (1st, 3rd, 5th...)
            if ((i + 1) % 2 == 1) {

                // Check if it is a vowel
                if ("AEIOUaeiou".indexOf(ch) != -1) {

                    // Toggle the case
                    if (Character.isUpperCase(ch)) {
                        ch = Character.toLowerCase(ch);
                    } else {
                        ch = Character.toUpperCase(ch);
                    }
                }
            }

            ans.append(ch);
        }

        System.out.println(ans);
    }
}