import java.util.*;

class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String temp = "";
        int i = 0;

        while(i < s.length()) {

            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
               (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {

                temp += s.charAt(i);
                i++;
            }
            else {

                int num = 0;

                while(i < s.length() &&
                      s.charAt(i) >= '0' &&
                      s.charAt(i) <= '9') {

                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                for(int j = 0; j < num; j++) {
                    System.out.print(temp);
                }

                temp = "";
            }
        }
    }
}