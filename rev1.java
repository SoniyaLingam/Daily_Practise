The program must accept a string S containing one or more words separated by space as input. For each word in the string, the program must reverse the characters of the word, but the uppercase and lowercase positions must remain the same as in the original word.

Finally, the program must print the modified words separated by a space.

Boundary Conditions
1 ≤ Length of S ≤ 1000

Input Format
The first line contains S.

Output Format
The first line contains the string after reversing each word while retaining the case positions.

Example

Input
Chennai TamilNadu

Output
Iannehc Udanllmat




import java.util.*;
public class rev1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[]a=sc.nextLine().split(" ");
        StringBuilder str=new StringBuilder();
        for(int u=0;u<a.length;u++){
            String n=a[u];
            char[]b=new StringBuilder(n.toLowerCase()).reverse().toString().toCharArray();
            char[]o=new char[n.length()];
            int id=0;
            for(int j=0;j<n.length();j++){
                if(Character.isUpperCase(n.charAt(j))){
                    o[j]=Character.toUpperCase(b[id++]);
                }else if(Character.isLowerCase(n.charAt(j))){
                    o[j]=Character.toLowerCase(b[id++]);
                }
            }
            str.append(new String(o));
            if(u!=a.length-1){
                str.append(" ");
            }
        }
        System.out.println(str);
    }
}


- Time complexity: O(N)
- Space complexity: O(N)