import java.util.*;

class String_formation_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int[] freq = new int[256];
        int[] freq1 = new int[256];

        for(int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
        }

        for(int i = 0; i < b.length(); i++) {
            freq1[b.charAt(i)]++;
        }

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < 256; i++) {
            if(freq1[i] > 0) {
                ans = Math.min(ans, freq[i] / freq1[i]);
            }
        }

        System.out.print(ans);
    }
}