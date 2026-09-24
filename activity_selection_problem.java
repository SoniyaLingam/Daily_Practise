import java.util.*;

public class activity_selection_problem{
    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // Sort activities based on ending time
        Integer[] index = {0, 1, 2, 3, 4, 5};

        Arrays.sort(index, (a, b) -> Integer.compare(end[a], end[b]));

        int lastEnd = -1;

        System.out.println("Selected activities:");

        for (int i : index) {
            if (start[i] >= lastEnd) {
                System.out.println("Activity " + (i + 1) +
                                   " : " + start[i] + " - " + end[i]);
                lastEnd = end[i];
            }
        }
    }
}