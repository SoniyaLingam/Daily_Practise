You are given a string S consisting of lowercase English letters and Q queries.

Each query contains two integers L and R representing a substring of S.

For each query:

Consider the substring from index L to R (1-based indexing).

Check whether the characters in this substring can be rearranged to form a palindrome.

If it is possible:

Rearrange the characters to form a palindrome.

The palindrome must be the lexicographically smallest possible palindrome.

Replace the substring in the original string with this palindrome.

If it is not possible, leave the substring unchanged.

After processing all queries, print the final string.

Input Format

First line → String S

Second line → Integer Q (number of queries)

Next Q lines → Two integers L R

Output Format

Print the final modified string after processing all queries.

Example
Input
aabbc
1
1 5
Process

Substring = "aabbc"

Frequency

a → 2  
b → 2  
c → 1

Only one odd frequency, so palindrome possible.

Smallest palindrome:

abcba
Output
abcba




import java.util.*;
public class palindromefreq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[]b=a.toCharArray();
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            int l=sc.nextInt()-1;
            int r=sc.nextInt()-1;
            int[]f=new int[26];
           int odd=0;
            for(int j=l;j<=r;j++){
                f[b[j]-'a']++;
            }
            for(int q:f){
                if(q%2!=0)odd++;
            }
            char[] temp=null;
            if(odd<=1){
                temp=new char[r-l+1];
                int strt=0,end=temp.length-1;
                char mid=0;
                for(int k=0;k<26;k++){
                    while(f[k]>=2){
                         temp[strt++]=(char)(k+'a');
                         temp[end--]=(char)(k+'a');
                         f[k]-=2;
                
                    }
            
                    
                }
               for(int k=0;k<26;k++){
                if(f[k]==1){
                    mid=(char)(k+'a');
                }
               }
                if(mid!=0){
                    temp[strt]=mid;
                }
            }
            for(int k=0;k<temp.length;k++){
                b[l+k]=temp[k];
            }
        }
    System.out.println(new String(b));
    }
}

- Time complexity: O(N * n).
- Space complexity: O(N).