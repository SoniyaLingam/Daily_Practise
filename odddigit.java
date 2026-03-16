The program must accept two integers X and Y as input. The program must print the integer formed by the common odd digits present in the same positions, starting from the unit digit (rightmost digit) of X and Y.

Note: There will be at least one common odd digit in X and Y at the same position.

Boundary Conditions:
1 ≤ X, Y ≤ 10⁸

Input Format:

The first line contains the integer X.

The second line contains the integer Y.

Output Format:

The first line contains the integer value formed based on the given conditions.

Example Input/Output 1

Input

1234599
31579

Output

359

Explanation:
The common odd digits starting from the unit digit position are 9, 5, and 3.
So the integer formed is 359.

Example Input/Output 2

Input

12345
12435

Output

15




import java.util.*;
public class odddigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(n1>0 && n2>0){
            int d=n1%10;
            int d1=n2%10;
            if(d==d1 && d%2!=0){
                sb.append(d);
                
            }
            n1/=10;
            n2/=10;
        }
        System.out.print(sb.reverse());
    }
}


Time complexity: O(D), where D is the number of digits in the smaller input number.
Space complexity: O(D).