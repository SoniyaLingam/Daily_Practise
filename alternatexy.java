You are given a string S and two integers X and Y.

You must repeatedly perform the following two operations alternately on the string S until it becomes the original string again:

Move the last X characters of the string to the beginning.

Move the last Y characters of the string to the beginning.

Count the total number of operations performed until the string becomes equal to the original string again.

Input Format:

First line contains the string S.

Second line contains two integers X and Y separated by a space.

Constraints:

1 ≤ Length of S ≤ 100

1 ≤ X, Y ≤ Length of S

Output Format:

Print a single integer representing the number of operations performed until the string returns to its original form.

Example:

Input:

high
1 2

Output:

3


import java.util.*;
public class alternatexy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int x=sc.nextInt();
        int y=sc.nextInt();
        String o=a;
        boolean user=true;
        int c=0;
        do{
            int m=user?x:y;
            int l=a.length();
            m=m%l;
            String la=a.substring(l-m);
            String f=a.substring(0,l-m);
            a=la+f;
            c++;
            user=!user;

        }while(!a.equals(o));
        System.out.print(c);

       
    }
}

- Time Complexity: O(l^2) 
- Space Complexity: O(l).