The program must accept a string S as input. The string S may contain letters, digits, spaces, and special characters.

Each character in the string has a value defined as follows:

If the character is a letter, its value is its alphabet position
(a/A = 1, b/B = 2, c/C = 3, … , z/Z = 26).

If the character is a digit, its value is the numeric value of the digit.

Spaces and special characters have a value of 0.

The value of the string is the sum of the values of all its characters.

The program must determine the following:

If the value of the entire string is prime, print

Prime

If the value is not prime, remove one word at a time from the string and compute the new value.
If the new value becomes prime, print

Almost Prime

If neither of the above conditions is satisfied, print

Composite
Input Format

The first line contains the string S.

Output Format

Print one of the following:

Prime

Almost Prime

Composite

Example

Input

Lift dog

Output

Prime

Explanation

Character values:

Lift → L(12) + i(9) + f(6) + t(20) = 47
dog → d(4) + o(15) + g(7) = 26

Total value:

47 + 26 = 73

Since 73 is a prime number, the output is:

Prime



import java.util.*;
public class charprime{
    public static int value(String s){
        int sum=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                sum+=Character.toLowerCase(c) - 'a' +1;
            }else if(Character.isDigit(c)){
                sum+=c - '0';
            }
        }
        return sum;
        
    }
    public static boolean isprime(int n){
        if(n<2)return false;
        for(int u=2;u*u<=n;u++){
            if(n%u==0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int total=value(s);
        String[]w=s.split(" ");
        
        if(isprime(total)){
            System.out.println("prime");
            return;
        }
        for(int u=0;u<w.length;u++){
            int ne=total - value(w[u]);
            if(isprime(ne)){
                System.out.println("almost prime");
                return;
            }
        }
        
        System.out.println("Composite");
    }
}

approximate time complexity of O(n^2 + n√m).
space complexity is O(n).