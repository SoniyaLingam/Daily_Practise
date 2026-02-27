The program must accept a string S containing only alphabets as the input.

The program must sort the alphabets having odd ASCII values in their positions and keep the other alphabets in their same positions in the string S.

Then the program must print the modified string S as the output.

Boundary Condition(s)

2 ≤ Length of S ≤ 100

Input Format

The first line contains the string S.

Output Format

The first line contains the modified string S.

Example Input/Output 1

Input

skillrack

Output

acillrkks


import java.util.*;
public class oddcharascii{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char[] a=new char[n];
        boolean[] f=new boolean[n];
        int k=0;
        for(int u=0;u<n;u++){
            if(s.charAt(u)%2!=0){
                a[k++]=s.charAt(u); 
                f[u]=true;

            }
   
        }
        Arrays.sort(a,0,k);
        int j=0;
        for(int u=0;u<n;u++){
            if(f[u]){
                System.out.print(a[j++]);
            }
            else{
                System.out.print(s.charAt(u));
                
            }

        }
    }
}

space complexity is O(n)
Time Complexity is O(n)