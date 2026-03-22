Write a Java program to print consecutive vowels from a given string.

Traverse the string character by character.
If vowels appear continuously, group them together.
When a consonant is encountered, print the collected group of vowels on a new line.
Continue this process till the end of the string.
🔹 Example

Input:

eagle

Output:

ea
e




import java.util.*;
public class consecutivevowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        
        for(int u=0;u<a.length();u++){
            char b=a.charAt(u);
            if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u' || b=='A' || b=='E' || b=='I' || b=='O' || b=='U'){
                sb.append(b);
            }else{
                if(sb.length()>0){
                    System.out.println(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if(sb.length()>0){
            System.out.println(sb.toString());
        }else{
            System.out.println("-1");
        }
    }
}


- Time complexity: O(n)
- Space complexity: O(n)