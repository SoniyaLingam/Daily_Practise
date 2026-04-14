import java.util.*;
public class minimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] m = n.toCharArray();
        Arrays.sort(m);
        int j = m.length;
        int mid = j/2 + 1;
        if (m[0] == '0') {
            for (int i = 1; i < j; i++) {
                if (m[i] != '0') {
                    char temp = m[0];
                    m[0] = m[i];
                    m[i] = temp;
                    break;
                }
            }
        }
        for (int i = 0; i < mid; i++) {
            System.out.print(m[i]);
        }
        System.out.println();        
        ArrayList<Character> second = new ArrayList<>();
        for (int i = mid; i < j; i++) {
            second.add(m[i]);
        }
        Collections.sort(second, Collections.reverseOrder());
        for (char c : second) {
            System.out.print(c);
        }
    }
}