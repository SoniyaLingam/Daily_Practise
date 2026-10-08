import java.util.*;

public class find_element_that_appears_only_once{

    public static int findUnique(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 2, 3, 4, 5};

        int result = findUnique(arr);

        System.out.println("Unique element = " + result);
    }
}