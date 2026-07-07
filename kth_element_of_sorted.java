import java.util.*;

class kth_element_of_sorted{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] ar = new int[a];
        int[] arr = new int[b];
        int ko=sc.nextInt();
        for (int i = 0; i < a; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[a + b];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge the two sorted arrays
        while (i < a && j < b) {

            if (ar[i] <= arr[j]) {
                res[k++] = ar[i++];
            } else {
                res[k++] = arr[j++];
            }
        }

        // Copy remaining elements of first array
        while (i < a) {
            res[k++] = ar[i++];
        }

        // Copy remaining elements of second array
        while (j < b) {
            res[k++] = arr[j++];
        }
        for(int u=0;u<a+b;u++){
            if(u==ko-1){
                System.out.print(res[u]);
                return;
            }
        }
        

       
    }
}