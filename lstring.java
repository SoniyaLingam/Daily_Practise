Given a string s, find the length of the longest substring without duplicate
characters.
Sample Test Case 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and
"cab" are also correct answers.
Sample Test Case 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Sample Test Case 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not
a substring.


import java.sql.Time;
import java.util.Scanner;
public class lstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[]d=new int[256];
        for(int u=0;u<256;u++){
            d[u]=-1;
        }
        int l=0;
        int m=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(d[c]>=l){
                l=d[c]+1;
            }
            d[c]=r;
            int curr=r-l+1;
            if(curr>m){
                m=curr;
            }
        }
        System.out.print(m);
    }
    
}

Time Complexity:O(n)
Space Complexity:O(1)
