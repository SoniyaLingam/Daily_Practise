import java.util.*;

class oddmanout1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int evenCount = 0, oddCount = 0;
        int evenIndex = -1, oddIndex = -1;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0) {
                evenCount++;
                evenIndex = i;
            } else {
                oddCount++;
                oddIndex = i;
            }
        }

        if (evenCount == 1)
            System.out.println(evenIndex+1);
        else
            System.out.println(oddIndex+1);
    }
}