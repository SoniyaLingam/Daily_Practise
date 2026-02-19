Write a Java program that takes three integer arrays as input.

First, read the sizes of the three arrays.

Then read the elements of each array.

After reading the input, perform the following operations:

Two Arrays Zip

Print the elements of the first two arrays together based on their index positions.
Each pair of elements (from the same index) should be printed on a new line.

Three Arrays Zip

Print the elements of all three arrays together based on their index positions.
Each triplet of elements (from the same index) should be printed on a new line.

⚠️ If the arrays are of different sizes, only iterate up to the smallest array length to avoid index errors.

import java.util.*;
public class zip{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int m[]=new int[a];
        int m1[]=new int[b];
        int m2[]=new int[c];
        for(int u=0;u<a;u++){
            m[u]=sc.nextInt();
        }
        for(int u=0;u<b;u++){
            m1[u]=sc.nextInt();
        }
        for(int u=0;u<c;u++){
            m2[u]=sc.nextInt();
        }
        int min1=Math.min(a,b);
        int min3=Math.min(min1,c);
        for(int u=0;u<min1;u++){
            System.out.println(m[u]+" "+m1[u]);
        }
        for(int j=0;j<min3;j++){
            System.out.println(m[j]+" "+m1[j]+" "+m2[j]);
        }
   
    }
}

Time complexity: O(a + b + c)
Space complexity: O(a + b + c)