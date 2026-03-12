The program must accept a string S containing one or more words separated by space as input. For each word in the string, the program must reverse the characters of the word, but the uppercase and lowercase positions must remain the same as in the original word.

Finally, the program must print the modified words separated by a space.

Boundary Conditions
1 ≤ Length of S ≤ 1000

Input Format
The first line contains S.

Output Format
The first line contains the string after reversing each word 

Example

Input
Chennai TamilNadu

Output
iannehC udanllmaT




import java.util.*;
public class rev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] a=sc.nextLine().split(" ");
        for(int u=0;u<a.length;u++){
            String b=a[u];
            System.out.print(new StringBuilder(b).reverse()+" ");
        }
        
    }
}

Time complexity: O(N)
Space complexity: O(N)