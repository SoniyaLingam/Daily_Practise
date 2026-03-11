The program must accept an integer N as input. The program must print all the pronic integers formed by the series of continuously occurring digits (in the same order) in N.

A pronic number is a number that can be expressed in the form:

n × (n + 1)

The pronic integers must be printed in the order of their occurrence.

Boundary Conditions
1 ≤ N ≤ 10²⁰

Input Format
The first line contains N.

Output Format
The first line contains the pronic integers separated by a space.

Example

Input
93042861

Output
930 30 0 42 2 6

Explanation

930 = 30 × 31
30 = 5 × 6
0 = 0 × 1
42 = 6 × 7
2 = 1 × 2
6 = 2 × 3




import java.util.*;
public class Pronic {
    static boolean pronic(long b){
        long d=(long)Math.sqrt(b);
        return d*(d-1)==b || d*(d+1)==b;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int len=a.length();
        for(int u=0;u<len;u++){
            for(int j=u+1;j<=len;j++){
                long b=Long.parseLong(a.substring(u,j));
                
                if(pronic(b)){
                    System.out.print(b+" ");
                }
            }
        }
    }
}

Time complexity: O(n^3)
Space complexity: O(n)
