import java.util.*;

class car {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = n; // Current number of parked cars

        String[] arr = new String[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int m = sc.nextInt();

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int option = sc.nextInt();
            String reg = sc.next();

            if (option == 1) {

                if (k < m) {
                    arr[k] = reg;
                    k++;
                    System.out.println("Car parked at position: " + k);
                } else {
                    System.out.println("No space for parking");
                }

            } else if (option == 2) {

                boolean found = false;

                for (int j = 0; j < k; j++) {

                    if (arr[j].equals(reg)) {
                        System.out.println("Car position: " + (j + 1));
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Car does not exists");
                }

            } else {

                System.out.println("Invalid");

            }
        }
    }
}