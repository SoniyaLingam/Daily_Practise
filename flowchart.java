import java.util.*;

class flowchart{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int temp = M;
        int N = 0;

        while (temp > 0) {
            N = N * 10 + temp % 10;
            temp /= 10;
        }

        while (M > 0) {
            System.out.println((N % 10) + " " + (M % 10));
            N /= 10;
            M /= 10;
        }
    }
}