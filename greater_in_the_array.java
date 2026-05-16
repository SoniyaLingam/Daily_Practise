import java.util.*;

public class greater_in_the_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {

            if(arr[i] > m) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}