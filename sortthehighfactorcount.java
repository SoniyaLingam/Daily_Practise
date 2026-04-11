// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class sortthehighfactorcount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer>map=new HashMap<>();
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            int c=0;
            arr[u]=sc.nextInt();
            for(int j=1;j<arr[u];j++){
                if(arr[u]%j==0){
                    c++;
                }
            }
            map.put(arr[u],c);
        }
       for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int f1 = map.get(arr[i]);
                int f2 = map.get(arr[j]);

                // Sort by factor count OR by value if equal
                if (f1 > f2 || (f1 == f2 && arr[i] > arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

       
        for (int x : arr) {
            System.out.print(x + " ");
        }
        
    }
}
