A string expression is given containing lowercase alphabets and operators ‘+’ and ‘-’.

Each group of characters (word) represents a collection of alphabets.

‘+’ → add the characters of the word
‘-’ → subtract the characters of the word
🎯 Task

After evaluating the entire expression:

Print all remaining characters in sorted order
If any characters have negative count, print them after a -
📌 Rules
Each character’s frequency is increased or decreased based on + or -
Final output:
Positive frequency → print normally
Negative frequency → print after -
Output must be alphabetically sorted
📥 Input Format
A single string S
📤 Output Format
A string representing the final result
🔍 Example

Input:

aabc-ad+db-age

Output:

bbc-eg




import java.util.*;
public class alpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char po='+';
        int[]f=new int[26];
        StringBuilder sb=new StringBuilder();
        for(int u=0;u<=a.length();u++){
        
            if(u==a.length() || a.charAt(u)=='+'||a.charAt(u)=='-'){
                for(int j=0;j<sb.length();j++){
                    char d=sb.charAt(j);
                    if(po=='+'){
                        f[d-'a']++;
                    }else{
                        f[d-'a']--;
                    }
                }
            if(u<a.length()){
                po=a.charAt(u);
            }
            sb.setLength(0);
            }else{
                sb.append(a.charAt(u));
            }
        }
        StringBuilder positive=new StringBuilder();
        StringBuilder negative=new StringBuilder();
        for(int u=0;u<26;u++){
            while(f[u]>0){
                positive.append((char)(u+'a'));
                f[u]--;
            }while(f[u]<0){
                negative.append((char)(u+'a'));
                f[u]++;
            }
        }
        if(negative.length()>0){
            System.out.print(positive.toString()+"-"+negative.toString());
        }else{
            System.out.print(positive.toString());
        }
        
    }
}

time complexity is O(n)
space complexity is O(n).