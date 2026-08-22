import java.util.Scanner;

public class smaller_to_larger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a != b) {

            if (a < b) {
                System.out.print(a);
                a++;
            } else {
                System.out.print(b);
                b++;
            }
        }

        System.out.println(a);

        sc.close();
    }
}