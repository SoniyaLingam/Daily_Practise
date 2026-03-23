Write a program to process a string S containing only digits.

The program must print the digits in the string based on the following conditions:

The digits of the same value must be printed on the same line.
The values of the digits must be printed in the order of their occurrence.
The empty spaces in each row must be filled with asterisks (*).
🔹 Boundary Condition
1
≤
1≤ Length of S 
≤
100
≤100
🔹 Input Format
The first line contains the string S
🔹 Output Format
Print the digits and asterisks as per the given conditions.
🔹 Example

Input:

1225644789964

Output:

1 * *
2 2 *
5 * *
6 6 *
4 4 4
7 * *
8 * *
9 9 *




import java.util.*;
public class Mapdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int u=0;u<a.length();u++){
            char b=a.charAt(u);
            map.put(b,map.getOrDefault(b,0)+1);
        }
        int m=0;
        for(int val:map.values()){
            if(val>m){
                m=val;
            }
        }
        for(char j:map.keySet()){
            int f=map.get(j);
            for(int u=0;u<f;u++){
                System.out.print(j+" ");
            }
            for(int z=f;z<m;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

Time complexity: O(n)
Space complexity: O(n)