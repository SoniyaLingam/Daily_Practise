Check Unbalanced Parentheses

The program must accept a string S containing only parentheses as the input.

The program must print "yes" if all the parentheses are balanced in the string S.
Otherwise, the program must print "no".

Boundary Condition(s)
2 <= Length of S <= 1000

Input Format

The first line contains the string S.

Output Format

The first line contains yes or no.

Example Input/Output 1
Input:
{}[]((()))[[]]{}

Output:
yes

Explanation:

All the parentheses in the string are balanced.

Example Input/Output 2
Input:
{}[]((()))[[]]}{

Output:
no

import java.util.Scanner;
import java.util.Stack;

public class unbalanced{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String a=sc.nextLine();
        Stack<Character>st=new Stack<>();
        int n=a.length();
        boolean b=true;
        for(int u=0;u<n;u++){
            if(a.charAt(u)=='('|| a.charAt(u)=='{'||a.charAt(u)=='['){
                st.push(a.charAt(u));
            }else{
                if(st.isEmpty()){
                    b=false;
                    break;

                }
                char top=st.pop();
                char ch=a.charAt(u);
                if((ch==')'&& top!='(')||(ch==']'&& top!='[')||(ch=='}'&& top!='{')){
                    b=false;
                    break;
                
                }
            }
        }
        if(!st.isEmpty()){
            b=false;
        }
        if(b){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}

- Time complexity: O(n)
- Space complexity: O(n)