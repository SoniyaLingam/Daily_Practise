Unbalanced Parentheses


import java.util.*;
public class stack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        Stack<Integer>st=new Stack<>();
        boolean[] r=new boolean[n];
        for(int u=0;u<n;u++){
            char b=a.charAt(u);
            if(b=='('){
                st.push(u);
            }
            else if(b==')'){
                if(st.isEmpty()){
                    r[u]=true;
                }
                else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            r[st.pop()]=true;
        }
        StringBuilder s=new StringBuilder();
        for(int u=0;u<n;u++){
            if(!r[u]){
                s.append(a.charAt(u));
            }
        }
        System.out.print(s.toString());
    }
}

Time complexity: O(n)
Space complexity: O(n)