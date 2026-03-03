Given a numeric string S, determine whether it can be split into two non-empty parts such that the two numbers formed are consecutive integers.

Two numbers are considered consecutive if their absolute difference is 1.

If such a split exists, print 1.
Otherwise, print 0.

Input Format

A single line containing a numeric string S.

Output Format

Print 1 if the string can be split into two consecutive numbers.

Print 0 otherwise.

Examples
Example 1

Input:

256257

Explanation:

256 | 257
257 - 256 = 1

Output:

1
Example 2

Input:

4241

Explanation:

42 | 41
|41 - 42| = 1

Output:

1
Example 3

Input:

20412024

No valid split forms consecutive numbers.

Output:

0


import java.util.*;
public class consecutivedigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        
        int n=a.length();
        int c=0;
        for(int u=1;u<n;u++){
            String f=a.substring(0,u);
            String l=a.substring(u);
            long s=Long.parseLong(f);
            long t=Long.parseLong(l);
            if(Math.abs(t - s) == 1){
               
                c= 1;
                break;
            }
        }
        System.out.println(c);
    }
} 

- Time Complexity: O(n^2)
- Space Complexity: O(n)