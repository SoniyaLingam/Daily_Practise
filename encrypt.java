import java.util.*;

public class encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();   
        int K = sc.nextInt();   
        sc.nextLine();          
        String M = sc.nextLine(); 
        if (K <= 0) K = 1;
        if (X != -1 && X != 0 && X != 1) {
            System.out.print("Invalid Input");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M.length(); i++) {
            char ch = M.charAt(i); 
            int val = ((ch - 'A' + K) % 26 + 26) % 26;
            char newChar = (char) (val + 'A');
            sb.append(newChar);
            if (X == 1) {
                K++;
            } else if (X == -1) {
                K--;
            }
        }

        System.out.print(sb.toString());
    }
}