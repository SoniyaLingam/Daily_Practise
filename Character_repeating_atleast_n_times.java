import java.util.*;

class  Character_repeating_atleast_n_times{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();

        int count = 1;

        for(int i = 1; i <= s.length(); i++) {

            if(i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            else {
                if(count >= n) {
                    System.out.print(s.charAt(i - 1));
                }
                count = 1;
            }
        }
    }
}