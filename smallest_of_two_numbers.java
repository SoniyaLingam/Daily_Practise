import java.util.*;

public class  smallest_of_two_numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while(sc.hasNextInt()) {
            int num = sc.nextInt();

            if(num < min1) {
                min2 = min1;
                min1 = num;
            }
            else if(num < min2) {
                min2 = num;
            }
        }

        System.out.println(min1 + min2);
    }
}