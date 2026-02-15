Function Description

Implement a function findAllDigits.

The function findAllDigits accepts two arguments:

SIZE – an integer representing the size of the integer array arr.

arr – an integer array of size SIZE.

The function must check for the presence of all digits from 0 to 9 while traversing the array from left to right.

Digits are considered discovered by examining each number in the array and extracting its digits.

When all the digits (0–9) have been discovered:

The function must return the next integer in the array.

If there is no next integer, return -1.

If all digits (0–9) are not discovered after traversing the entire array, return -1.

Important

Do not write the main() function as it is already defined.

Example 1

Input:

10
5175 458 292 5057 6401 4376 2280 6137 8798 9083


Output:

2280

Example 2

Input:

4
12354 67821 1524 21359


Output:

-1

import java.util.*;
public class number{
public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] s=new int[n];
        int r=-1;
        
        for(int u=0;u<n;u++){
            s[u]=sc.nextInt();         
        }
        boolean[]f=new boolean[10];
        int co=0;
        for(int u=0;u<n;u++){
            int num=s[u];
            
            while(num>0){
            
                int c=num%10;
                if(!f[c]){
                    f[c]=true;
                    co++;
                }
                num/=10;
                
            }
        
        if(co==10){
            if(u+1<n){
                r=s[u+1];   
            }
            
            break;
          
        }
    }
    System.out.println(r);


    }
}

Time Complexity:O(n)
Space Complexity:O(n)