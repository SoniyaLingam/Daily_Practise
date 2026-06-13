import java.util.*;

class Isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        boolean flag = true;

        for(int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2;
                map2[c2] = c1;
            }
            else if(map1[c1] != c2 || map2[c2] != c1) {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Isomorphic");
        else
            System.out.println("Not Isomorphic");
    }
}