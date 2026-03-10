Snake Matrix Pattern

The program must accept an integer N as input and print the snake matrix pattern based on the following conditions.

The pattern contains N lines, where the integers from 1 to N×N occur in the horizontal zigzag direction.
In the 1st line, N−1 asterisks and the first N integers (1 to N) are printed.
In the 2nd line, N−2 asterisks and the next N integers (N+1 to 2×N) in reverse order are printed.
In the 3rd line, N−3 asterisks and the next N integers (2×N+1 to 3×N) are printed.
In the 4th line, N−4 asterisks and the next N integers (3×N+1 to 4×N) in reverse order are printed.
Similarly, the remaining lines are printed.

Boundary Conditions
2 ≤ N ≤ 50

Input Format
The first line contains N.

Output Format
The first N lines contain the snake matrix pattern based on the given conditions.




import java.util.*;
public class astericknumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int t=1;
        for(int uo=0;uo<n;uo++){
            for(int k=0;k<n-uo-1;k++){
                System.out.print("*");
            }
            if(uo%2==0){
                for(int u=0;u<n;u++){
                    System.out.print(t);
                    t++;
                }
            }else {
                int temp=t+n-1;
                for(int u=0;u<n;u++){
                    
                    System.out.print(temp);
                    temp--;
                }
                t+=n;
            }
            System.out.println();
                
                
            
        }
    }
}

- Time complexity: O(n^2)
- Space complexity: O(1)