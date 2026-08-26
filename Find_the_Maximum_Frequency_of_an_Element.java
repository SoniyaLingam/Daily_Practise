import java.util.*;

public class Find_the_Maximum_Frequency_of_an_Element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> freq = new HashMap<>();

        int maxFreq = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);

            maxFreq = Math.max(maxFreq, count);
        }

        System.out.println(maxFreq);
    }
}