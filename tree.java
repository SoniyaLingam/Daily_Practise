You are given a set of parent-child relationships representing a tree structure.

Input:

An integer n representing the number of parent-child pairs.

n pairs of integers (p, c) where:

p = parent

c = child

An integer m representing the number of queries.

An array of m integers where each element is a node.

Task:

For each query node x, print all its cousins.

Definition:

The parent of x is the node directly connected above it.

The grandparent of x is the parent of its parent.

The cousins of x are:

The children of the siblings of x's parent.

Output:

For each query:

Print all cousin nodes of x in a single line.

If no cousins exist, print an empty line.

Example
Input:
5
1 2
1 3
2 4
2 5
3 6
3
4 5 6
Output:
6
6
4 5




import java.util.*;
public class tree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][2];
        for(int u=0;u<n;u++){
            for(int j=0;j<2;j++){
                arr[u][j]=sc.nextInt();
            }
        }
        int m=sc.nextInt();
        int[]a=new int[m];
        for(int u=0;u<m;u++){
            a[u]=sc.nextInt();
        }
        for(int u=0;u<m;u++){
            int s=a[u];
            for(int j=0;j<n;j++){
                if(arr[j][1]==s){
                    int c=arr[j][0];
                    for(int k=0;k<n;k++){
                        if(arr[k][1]==c){
                            int q=arr[k][0];
                            for(int l=0;l<n;l++){
                                if(arr[l][0]==q && arr[l][1]!=c){
                                    System.out.print(arr[l][1]+" ");
                                }
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}

Time Complexity:O(m * n^3)
Space Complexity: O(n + m)