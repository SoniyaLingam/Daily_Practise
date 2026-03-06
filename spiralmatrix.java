The program must accept a character matrix of size R × C as input.
The program must form a string S by traversing the matrix in spiral clockwise direction.

After forming the string S, the program must check whether S is a palindrome.

If S is a palindrome, print YES.

Otherwise, print NO.

Boundary Conditions
2 ≤ R, C ≤ 50
Input Format

The first line contains two integers R and C separated by a space.

The next R lines each contain C characters separated by spaces.

Output Format

Print YES if the string formed by spiral traversal is a palindrome.
Otherwise, print NO.

Example Input
6 5
A b c d e
m l k j f
n c b i g
o d A h h
o e f g i
n m l k j
Example Output
YES



import java.util.*;
public class spiralmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][] mat=new char[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.next().charAt(0);
            }
        }
        StringBuilder s=new StringBuilder();
        int top=0,bottom=r-1;
        int left=0,right=c-1;
        while(top<=bottom && left<=right){
            for(int u=left;u<=right;u++){
                s.append(mat[top][u]);
            top++;
            }
            for(int u=top;u<=bottom;u++){
                s.append(mat[u][right]);
            right--;
            }
            for(int u=right;u>=left;u--){
                s.append(mat[bottom][u]);
            bottom--;
            }
            for(int u=bottom;u>=top;u--){
                s.append(mat[u][left]);
            left++;
            }
            String str=s.toString();
            String rev=new StringBuilder(str).reverse().toString();
            if(str.equals(rev)){
                System.out.println("Yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}

time complexity is approximately O(r * c)
space complexity is O(r * c)