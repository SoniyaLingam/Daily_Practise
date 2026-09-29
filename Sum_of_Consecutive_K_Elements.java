import java.util.*; 
 
public class Sum_of_Consecutive_K_Elements{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        int a = sc.nextInt(); 
        int[] b = new int[a]; 
 
        for (int i = 0; i < a; i++) 
            b[i] = sc.nextInt(); 
 
        int c = sc.nextInt(); 
 
        for (int i = 0; i < a - c; i++) { 
            int sum = 0; 
 
            for (int j = i; j < i + c; j++) 
                sum += b[j]; 
 
            System.out.print(sum + " "); 
        } 
    } 
}