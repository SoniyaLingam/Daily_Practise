Remove the actual word and the reverse of the word in the sentence

import java.util.*;
public class teversewords{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] a=sc.nextLine().split(" ");
        String b=sc.nextLine();
        String d=new StringBuilder(b).reverse().toString();
        StringBuilder r=new StringBuilder();

        for(int u=0;u<a.length;u++){
            if(a[u].equals(b) || a[u].equals(d))continue;
            else{
                r.append(a[u]).append(" ");
            }
        }
        System.out.print(r.toString());
    }
}


- Time complexity: O(M * K)
- Space complexity: O(M * K)