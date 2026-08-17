import java.util.*;

public class Main_mistral
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i==j || i==n-j-1) {

                    System.out.print(num + " ");
                } else {
                    System.out.print("* ");
                }

                num++;
            }

            System.out.println();
        }
    }
}