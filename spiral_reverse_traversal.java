import java.util.*; 
 
public class spiral_reverse_traversal
{ 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        int n = sc.nextInt(); 
 
        int[][] arr = new int[n][n]; 
 
     
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                arr[i][j] = sc.nextInt(); 
            } 
        } 
 
        int row = n / 2; 
        int col = n / 2; 
 
        System.out.print(arr[row][col] + " "); 
 
        int count = 1; 
        int step = 1; 
 
        while (count < n * n) { 
 
       
            for (int i = 0; i < step && count < n * n; i++) { 
                col++; 
                System.out.print(arr[row][col] + " "); 
                count++; 
            } 
 
          
            for (int i = 0; i < step && count < n * n; i++) { 
                row++; 
                System.out.print(arr[row][col] + " "); 
                count++; 
            } 
 
            step++; 
 
            
            for (int i = 0; i < step && count < n * n; i++) { 
                col--; 
                System.out.print(arr[row][col] + " "); 
                count++; 
            } 
 
            
            for (int i = 0; i < step && count < n * n; i++) { 
                row--; 
                System.out.print(arr[row][col] + " "); 
                count++; 
            } 
 
            step++; 
        } 
    } 
}