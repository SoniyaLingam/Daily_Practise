Given a string S, find and print all substrings that start and end with the same character, where the character appears more than once in the string.

For every repeating character, print all possible substrings formed between its occurrences (including both ends).
Print each substring on a new line.
If no such substring exists, print -1.
📌 Input Format
A single string S
📌 Output Format
Print the required substrings, each on a new line
If none exist, print -1
📌 Example 1

Input:

qualification

Output:

alifica
ifi
icati
📌 Example 2

Input:

abc

Output:

-1




import java.util.*;
public class repeat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        boolean found=false;
        for(int u=0;u<s.length();u++){
            char ch=s.charAt(u);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int u=0;u<s.length();u++){
            char ch1=s.charAt(u);
            
            if(map.get(ch1)>1){
                String temp="";
                temp+=ch1;
            for(int j=u+1;j<s.length();j++){
                char ch2=s.charAt(j);
                if(ch1==ch2){
                    temp+=ch2;
                    
                    System.out.println(temp);
                    temp="";
                    temp+=ch2;
                    found=true;
                }else{
                    temp+=ch2;
                }
            }map.put(ch1,0);
        }
        }if(!found){
            System.out.println("-1");
        }
    }
}

- Time complexity: approximately O(n^2)
- Space complexity: O(n)