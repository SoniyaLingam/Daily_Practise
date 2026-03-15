Given a string S consisting only of the characters ( and ), determine the length of the longest valid (well-formed) parentheses substring.

A substring is considered valid if every opening parenthesis ( has a corresponding closing parenthesis ) in the correct order.

If there is no valid substring, print 0.

Input

A single line containing a string S of parentheses.

Output

Print a single integer representing the length of the longest valid parentheses substring.

Example

Input

)(()))(())())

Output

6

Explanation

The longest valid substring is:

(())()

Length:

6




import java.util.*;
public class bracket{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        int c=0;
        for(int u=0;u<a.length();u++){
            if(a.charAt(u)=='('){
                st.push(u);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(u);
                }else{
                    
                    c=Math.max(c,u-st.peek());
                }
            }
            
        }
        System.out.println(c);
    }
}


Time Complexity: O(n)
Space Complexity: O(n)