A number N is called a special number if there exists a number X such that:

X + reverse(X) = N

Write a program to check whether the given integer N is a special number.

If such a number X exists, print "Yes".

Otherwise, print "No".

Input Format

A single integer N.

Output Format

Print "Yes" if the number N is a special number.
Otherwise, print "No".

Example 1
Input
22
Explanation

Take

X = 11

Reverse of 11:

11

Now

11 + 11 = 22

Since the condition is satisfied, 22 is a special number.

Output
Yes
Example 2
Input
10
Explanation

No number X exists such that

X + reverse(X) = 10
Output
No



import java.util.*;
public class specialnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for(int x=0;x<n;x++){
            int t=x;
            int r=0;
            while(t>0){
                int d=t%10;
                r=r*10+d;
                t/=10;
            }
            if(r+x==n){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }
    }
}

 
Time complexity: O(n * log n)
Space complexity: O(1)
