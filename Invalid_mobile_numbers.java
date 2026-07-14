import java.util.*;

class Invalid_mobile_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int invalid = 0;

        while (sc.hasNext()) {

            String s = sc.next();

            if (s.equalsIgnoreCase("Q")) {
                break;
            }

            boolean ok = true;

            if (s.length() != 10) {
                ok = false;
            } else {
                for (int i = 0; i < 10; i++) {
                    if (!Character.isDigit(s.charAt(i))) {
                        ok = false;
                        break;
                    }
                }
            }

            if (!ok) {
                invalid++;
            }
        }

        System.out.print(invalid);
    }
}