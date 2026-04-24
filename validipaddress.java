import java.util.*;

public class validipaddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] s = input.split("\\.");

       
        if (s.length != 4) {
            System.out.print("Invalid");
            return;
        }

        for (String u : s) {
            
            if (u.length() == 0) {
                System.out.print("Invalid");
                return;
            }

            // Check numeric
            for (char ch : u.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    System.out.print("Invalid");
                    return;
                }
            }

            int d = Integer.parseInt(u);

            
            if (d < 0 || d > 255) {
                System.out.print("Invalid");
                return;
            }
        }

        System.out.print("Valid");
    }
}