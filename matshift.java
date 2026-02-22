Matrix Shift Queries

You are given a matrix of size R × C.

Then you are given Q queries.
Each query is of the form:

X K CH

Where:

X → Row number or Column number (1-based index)

K → Number of shifts

CH → Type of shift

'r' → Shift the Xth row to the right

'c' → Shift the Xth column downward

🔁 Operation Rules
If CH = 'r'

Shift the given row to the right by K positions (circular shift).

Example:

1 2 3 4

Shift right by 1 →

4 1 2 3
If CH = 'c'

Shift the given column downward by K positions (circular shift).

Example column:

1
2
3
4

Shift down by 1 →

4
1
2
3
📤 Output Format

After every query:

Print:

Query <query_number>

Then print the updated matrix.

📥 Input Format
R C
<Matrix elements>
Q
X K CH   (Q lines)
📌 Constraints (Typical)

1 ≤ R, C ≤ 100

1 ≤ Q ≤ 100

1 ≤ K



import java.util.Scanner;

public class matshift {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.nextInt();
            }
        }
        int q=sc.nextInt();
      
        for(int u=0;u<q;u++){
            int x=sc.nextInt();
            int k=sc.nextInt();
            char ch=sc.next().charAt(0);
            
            if(ch=='r'){
                int[]temp=new int[c];
                k=k%c;
                for(int col=0;col<c;col++){
                    temp[(col+k)%c]=mat[x-1][col];
                }
                mat[x-1]=temp;
            }
            else if(ch=='c'){
                int[]temp=new int[r];
                k=k%r;
                for(int row=0;row<r;row++){
                    temp[(row+k)%r]=mat[row][x-1];
                }
                for(int row=0;row<r;row++){3 2
                    mat[row][x-1]=temp[row];
                }
                
            }
        System.out.println("Query " + (u+1));
        for(int uo=0;uo<r;uo++){
            for(int j=0;j<c;j++){
                System.out.print(mat[uo][j]+" ");
            }
            System.out.println();
        }
        }
    }
}

- Time complexity: O(q * (r + c) + q * r * c)
- Space complexity: O(r * c).