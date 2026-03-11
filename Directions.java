The program must accept a matrix of size R × C representing R × C cities. A person visits the cities starting from the top-left position and marks the visited cities with integers starting from 1 in the order of visit. The integers in the matrix represent the cities that were visited, while the asterisk (*) represents the cities that were not visited.

The program must determine and print the directions in which the person moved to visit the cities.
The possible directions are:

N → North

S → South

E → East

W → West

The directions must be printed in the order in which the cities were visited.

Boundary Conditions
2 ≤ R, C ≤ 25

Input Format
The first line contains R and C separated by a space.
The next R lines contain C values each separated by a space.

Output Format
The first line contains the list of characters separated by a space representing the directions in which the person visited the cities.




import java.util.*;
public class Directions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String[][] mat=new String[r][c];
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                mat[u][j]=sc.next();
            }
        }
        Map<Integer,int[]>map=new HashMap<>();
        
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                if(!mat[u][j].equals("*")){
                    int n=Integer.parseInt(mat[u][j]);
                    map.put(n,new int[]{u,j});
                }
                
            }
        }
        int max = Collections.max(map.keySet());
        for(int u=1;u<max;u++){
            int[] a=map.get(u);
            int[] b=map.get(u+1);
            int r1=a[0],c1=a[1];
            int r2=b[0],c2=b[1];
            if(r1==r2 && c2==c1 + 1){
                System.out.print("E ");
            }else if(r1==r2 && c2==c1 - 1){
                System.out.print("W ");
            }else if(c1==c2 && r2==r1 + 1){
                System.out.print("S ");
            }else if(c1==c2 && r2==r1 - 1){
                System.out.print("N ");
            }
        }
    }
}


Time complexity: O(R*C)
Space complexity: O(R*C)