import java.util.Scanner;

public class Valid_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > 0 && y > 0 && z > 0 && (x + y + z == 180)) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not a valid triangle");
        }
    }
}