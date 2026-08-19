import java.util.Arrays;
import java.util.Scanner;

class Solution {

    // Check whether it is safe to give 'col' to 'node'
    public static boolean isSafe(
        int node,
        int[] color,
        boolean[][] graph,
        int n,
        int col
    ) {

        // Check all vertices
        for (int k = 0; k < n; k++) {

           
            if (graph[k][node] && color[k] == col) {
                return false;
            }
        }

        return true;
    }


    // Backtracking function
    public static boolean solve(
        int node,
        int[] color,
        int m,
        int n,
        boolean[][] graph
    ) {

        // If all nodes are colored
        if (node == n) {
            return true;
        }

        // Try colors from 1 to m
        for (int col = 1; col <= m; col++) {

            // Check whether this color is safe
            if (isSafe(node, color, graph, n, col)) {

                // Assign the color
                color[node] = col;

                // Try to color the next node
                if (solve(node + 1, color, m, n, graph)) {
                    return true;
                }

                // Backtrack
                color[node] = 0;
            }
        }

        // No color worked
        return false;
    }


    // Main graph coloring function
    public static boolean graphColoring(
        boolean[][] graph,
        int m,
        int n
    ) {

        // Initially all nodes have color 0
        int[] color = new int[n];

        Arrays.fill(color, 0);

        // Start from node 0
        return solve(0, color, m, n, graph);
    }
}


public class M_colouring_striver_backtracking{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number of vertices
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        // Get number of colors
        System.out.print("Enter number of colors: ");
        int m = sc.nextInt();

        // Get number of edges
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        // Create adjacency matrix
        boolean[][] graph = new boolean[n][n];

        // Get edges from user
        System.out.println("Enter the edges:");

        for (int i = 0; i < e; i++) {

            System.out.print("Enter edge " + (i + 1) + ": ");

            int u = sc.nextInt();
            int v = sc.nextInt();

            // Since the graph is undirected
            graph[u][v] = true;
            graph[v][u] = true;
        }

        // Check whether graph can be colored
        boolean result = Solution.graphColoring(graph, m, n);

        // Print result
        System.out.println("Can the graph be colored? " + result);

        sc.close();
    }
}