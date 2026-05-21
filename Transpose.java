import java.util.*;

public class Transpose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();

            if (line.length() == 0)
                break;

            String[] arr = line.split(" ");

            ArrayList<Integer> row = new ArrayList<>();

            for (String s : arr) {
                row.add(Integer.parseInt(s));
            }

            matrix.add(row);
        }

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix.get(i).get(j));

                if (i != rows - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}