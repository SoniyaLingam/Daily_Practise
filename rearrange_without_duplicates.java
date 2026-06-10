// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class rearrange_without_duplicates{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]mat=new int[r][c];
        boolean[][]b=new boolean[r][c];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.nextInt();
                map.put(mat[u][j],map.getOrDefault(mat[u][j],0)+1);
            }
        }
        for(int u:map.values()){
            if(u>r){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
        
    }
}