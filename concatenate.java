import java.util.*;

public class concatenate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().replaceAll("\\s+", "");
        int a = Integer.parseInt(s);

        int root = (int) Math.sqrt(a);

        System.out.println(root * root == a ? "Yes" : "No");
    }
}