import java.util.*;

class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }

            if(i == 0 || arr[i - 1] == ' ') {
                if(arr[i] >= 'a' && arr[i] <= 'z') {
                    arr[i] = (char)(arr[i] - 32);
                }
            }
        }

        System.out.println(new String(arr));
    }
}