Given a string S consisting of lowercase English letters, perform the following operation repeatedly:

Find the first lowercase vowel in the string.

Find the last lowercase vowel in the string.

Convert both of them to uppercase.

Print the updated string.

Repeat the process until there are no lowercase vowels left in the string.

Notes

Only lowercase vowels (a, e, i, o, u) should be considered.

There will be at least one vowel in the input string.

After each conversion step, print the modified string on a new line.

Stop when all vowels are converted to uppercase.

Example

Input:

greenapple

Output:

grEenapplE
grEEnApplE



import java.util.*;
public class vowelconversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        String v="aeiou";
        
        while(true){
            int l=-1;
            int r=-1;
            for(int u=0;u<n;u++){
                if(v.indexOf(a.charAt(u))!=-1){
                    l=u;
                    break;
                }
                
            }
            for(int j=n-1;j>0;j--){
                if(v.indexOf(a.charAt(j))!=-1){
                    r=j;
                    break;
                }
            }
            if(l==-1){
                break;
            }
            char[] arr=a.toCharArray();
            arr[l]=Character.toUpperCase(arr[l]);
            if(l!=r){
                arr[r]=Character.toUpperCase(arr[r]);
            }
            a=new String(arr);
            System.out.println(a);
        }
    }
}

- Time complexity: O(n^2) in the worst case.
- Space complexity: O(n).