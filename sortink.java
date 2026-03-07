The program must accept a string S and an integer K as input. The length of the string S is always divisible by K.

The program must split the string S into substrings of length K, sort those substrings in ascending (lexicographical) order, and then print them separated by a space.

Input Format

The first line contains the string S.

The second line contains the integer K.

Output Format

The substrings of length K from the string S, sorted in ascending order, separated by a space.

Example Input/Output 1

Input

skillrack
3

Output

ack llr ski

Explanation
The string skillrack is divided into substrings of length 3:

ski
llr
ack

After sorting:

ack llr ski
Example Input/Output 2

Input

internationalairport
4

Output

inte iona lair port rnat

Explanation
The string is divided into substrings of length 4:

inte
rnat
iona
lair
port

After sorting:

inte iona lair port rnat



import java.util.*;
public class sortink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int k=sc.nextInt();
        int size=a.length()/k;
        String[]arr=new String[size];
        int in=0;
        for(int u=0;u<a.length();u+=k){
            arr[in++]=a.substring(u,u+k);
        }
        Arrays.sort(arr);
        for(int u=0;u<size;u++){
            System.out.println(arr[u]+" ");
        }
    }
}

Time Complexity: O(n/k).
Space complexity: O(n).