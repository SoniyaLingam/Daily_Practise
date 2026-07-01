import java.util.*;

class rock_paper_scissor_game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        int c = 0;
        int co = 0;

        for(int u = 0; u < n; u++) {

            String s = sc.next();
            String t = sc.next();

            if(s.equals(t)) {
                continue;
            }

            if(s.equals("rock")) {
                if(t.equals("paper")) {
                    co++;
                }
                else if(t.equals("scissors")) {
                    c++;
                }
            }

            if(s.equals("paper")) {
                if(t.equals("rock")) {
                    c++;
                }
                else if(t.equals("scissors")) {
                    co++;
                }
            }

            if(s.equals("scissors")) {
                if(t.equals("rock")) {
                    co++;
                }
                else if(t.equals("paper")) {
                    c++;
                }
            }
        }

        if(c == co) {
            System.out.print("Tie");
        }
        else if(c > co) {
            System.out.print("1");
        }
        else {
            System.out.print("2");
        }
    }
}