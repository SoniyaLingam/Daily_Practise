import java.util.*;

public class countofdigitinastring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = sc.nextInt();

        for(int i = 0; i < n; i++) {

            String s = sc.next();

            int count = 0;

            for(int j = 0; j < s.length(); j++) {

                if(s.charAt(j) == (char)(x + '0')) {
                    count++;
                }
            }

            System.out.print(count + " ");
        }
    }
}