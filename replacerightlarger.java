Given an array of integers, replace every element with the greatest element among the elements to its right.

Since there is no element to the right of the last element, replace it with -1.

Input Format
First line contains an integer n (size of array)
Second line contains n integers

Output Format
Print the modified array after replacing each element as per the condition

Example

Input:

6
16 17 4 3 5 2

Output:

17 5 5 5 2 -1




import java.util.*;
public class replacerightlarger {
    public static int maximum(int[] arr,int strt,int end){
        int m=arr[strt];
        for(int u=strt;u<end;u++){
            if(arr[u]>m){
                m=arr[u];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
        }
        
        
        for(int u=0;u<n;u++){
            if(u==n-1){
                System.out.print("-1");
            }else{
                 System.out.print(maximum(arr,u+1,n)+" ");
            }
           
        }
        
    }
}

time complexity is O(n^2)
space complexity is O(1).