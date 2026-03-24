You are given a matrix of size R × C consisting of only 0s and 1s.

Two players, A and B, are playing a game based on this matrix.

🎯 Game Rules
A move consists of selecting a cell such that:
The cell contains 0
The entire row and entire column of that cell do not contain any 1
Once a player selects such a cell:
That row and column become unavailable for future moves
Players play alternately, starting with Player A
A player who cannot make a move loses the game
🔍 Task
Count:
Number of rows that contain no 1s
Number of columns that contain no 1s
Let:
freeRows = number of rows without any 1
freeCols = number of columns without any 1

Maximum possible moves:

moves = min(freeRows, freeCols)
🏆 Output
If moves is odd → print "A" (Player A wins)
If moves is even → print "B" (Player B wins)




import java.util.*;
public class rook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]mat=new int[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.nextInt();
            }
        }
        int fr=0,fc=0;
        for(int u=0;u<r;u++){
            int h_r=0;
            for(int j=0;j<c;j++){
                if(mat[u][j]==1){
                    h_r=1;
                    break;
                }
            }
            if(h_r==0)fr++;
        }
        for(int u=0;u<c;u++){
            int h_r=0;
            for(int j=0;j<r;j++){
                if(mat[j][u]==1){
                    h_r=1;
                    break;
                }
            }
            if(h_r==0)fc++;
        }
        int m=(fr<fc)?fr:fc;
        if(m%2==1){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}


Time complexity: O(r * c)
Space complexity: O(r * c)