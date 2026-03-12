The program must accept a string S containing only lowercase alphabets as the input. The program must split the string into the minimum number of substrings such that no alphabet occurs more than once in any substring. Finally, the program must print the number of substrings obtained.

Boundary Condition
1 ≤ Length of S ≤ 1000

Input Format
The first line contains S.

Output Format
The first line contains an integer representing the minimum number of substrings that can be formed such that each substring contains only unique alphabets.




import java.util.*;
public class countofsubstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        List<Character>list=new ArrayList<>();
        int c=1;
        for(int u=0;u<a.length();u++){
            char b=a.charAt(u);
            if(list.contains(b)){
                c++;
                list.clear();
            }
            list.add(b);
            
        }
        System.out.println(c);
    }
}

- Time Complexity: O(n^2) in the worst case.
- Space Complexity: O(n).