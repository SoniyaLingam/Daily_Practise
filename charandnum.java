The program must accept two strings S1 and S2 as input.
The string S2 contains letters and digits.

The digits in S2 represent the number of characters to be skipped in S1.

The program must determine whether S2 correctly represents S1.

If a letter appears in S2, it must match the corresponding character in S1.

If a number appears in S2, skip that many characters in S1.

The comparison must be case-insensitive.

The program must print YES if S2 matches S1. Otherwise, print NO.

Input Format

The first line contains the string S1.

The second line contains the string S2.

Output Format

Print YES if the pattern in S2 matches the string S1.

Otherwise, print NO.

Example
Input
InternationalAirport
I18t
Output
YES
Explanation

Pattern:

I18t

Meaning:

I + skip 18 characters + t

String:

InternationalAirport

Structure:

I + nternationalairpor + t

So the pattern matches the string. Hence the output is YES.



import java.util.*;
public class charandnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        a=a.toLowerCase();
        b=b.toLowerCase();
        int i=0;
        int j=0;
        
        while(j<b.length()){
            char ch=b.charAt(j);
            if(Character.isLetter(ch)){
                if(i>=a.length() || a.charAt(i)!=ch){
                    System.out.println("NO");
                    return;
                }
                i++;
                j++;
            }else{
                int num=0;
                while(j<b.length() && Character.isDigit(b.charAt(j))){
                    num=num*10+(b.charAt(j)-'0');
                    j++;
                }
                i+=num;
            }
        }
        if(i==a.length()){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }
    }
}

- Time complexity: O(n)
- Space complexity: O(1).