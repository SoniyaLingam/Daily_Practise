Tap Code Decryption – Question (Text Version)

The program must accept a string S and a character matrix of size 5 × 5 as input.

The string S represents a tap code containing groups of dots (.) and spaces.

The 5 × 5 matrix represents the tap code table which contains 26 unique lowercase alphabets.

Exactly one cell in the matrix contains two alphabets separated by a slash ( / ).

While decrypting, the program must consider only the alphabet on the left side of the slash ( / ).

Each pair of groups of dots in the string S represents:

First group → row number

Second group → column number

The program must:

Decode the tap code using the matrix.

Print the decrypted string as output.

🔹 Boundary Condition
1 ≤ Number of pairs of groups of dots ≤ 100

🔹 Input Format

First line → Tap code string S

Next 5 lines → 5 × 5 character matrix

🔹 Output Format

Print the decrypted string.

🔹 Example
Input:
.... ... .... ... .. ... . ... ...
a b c/k d e
f g h i j
l m n o p
q r s t u
v w x y z

Output:
store 

import java.util.*;
public class pu{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[][] m=new String[5][5];
        for(int u=0;u<5;u++){
            String[]row=sc.nextLine().split(" ");
            for(int j=0;j<5;j++){
                if(row[j].contains("/")){
                    m[u][j]=row[j].split("/")[0];
                }
                else{
                    m[u][j]=row[j];
                }

            }
        }
        String[]d=a.split(" ");
        StringBuilder t=new StringBuilder();
        for(int u=0;u<d.length;u+=2){
            int rows=d[u].length()-1;
            int col=d[u+1].length()-1;
            t.append(m[rows][col]);
        }
        System.out.print(t.toString());
    }
}

Time complexity: O(N)
Space complexity: O(N)