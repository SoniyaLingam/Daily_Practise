import java.util.*;

public class printfromthegiveninteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int start = m - 1;

        
        for (int i = start; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

       
        for (int i = 0; i < start; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}