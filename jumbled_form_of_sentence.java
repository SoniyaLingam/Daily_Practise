import java.util.*;

class jumbled_form_of_sentence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int value = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int arrCount = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] != value) {
                arrCount++;
            }
        }

        System.out.print(arrCount);
    }
}