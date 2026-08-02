import java.util.*;

class odd_even_fre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] fre = new int[26];

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            fre[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {

            if (fre[i] != 0) {

                if (fre[i] % 2 == 0)
                    even.append((char) (i + 'a'));
                else
                    odd.append((char) (i + 'a'));
            }
        }

        char[] arr = even.toString().toCharArray();
        char[] arr1 = odd.toString().toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        String evenStr = new String(arr);
        String oddStr = new String(arr1);

        String result = oddStr + new StringBuilder(evenStr).reverse().toString();

        System.out.println(result);
    }
}