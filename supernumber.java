The program must accept an integer N as input. The program must print YES if the given integer N is a super digit integer. Otherwise, the program must print NO.

A super digit integer is an integer N such that D × (N^D) contains a substring made of D digits of D, where 2 ≤ D ≤ 9.

Boundary Condition
1 ≤ N ≤ 10^8
Input Format

The first line contains N.

Output Format

The first line contains YES or NO.

Example Input/Output 1

Input

753

Output

YES

Explanation
If D = 3

3 × (753^3) = 3 × (753 × 753 × 753)
            = 1280873331

The result 1280873331 contains 333 (three 3s).
Hence the output is YES.

Example Input/Output 2

Input

333

Output

YES

Explanation
If D = 2

2 × (333^2) = 2 × (333 × 333)
            = 221778

The result 221778 contains 22 (two 2s).
Hence the output is YES.


import java.util.*;
import java.math.*;
public class Supernumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        long n=sc.nextLong();
        for(int d=2;d<=9;d++){
            BigInteger ni=BigInteger.valueOf(n);
            BigInteger p=ni.pow(d);
            BigInteger r=p.multiply(BigInteger.valueOf(d));
            String s=r.toString();
            String t="";
            for(int u=0;u<d;u++){
                t+=d;
            }
            if(s.contains(t)){
                flag=true;
                break;
            }
            
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}

Time Complexity: Approximately O(log n * M(k))
Space Complexity: O(k)