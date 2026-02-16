Count Axis-Parallel Squares

You are given N distinct points on a 2D coordinate plane.
Each point is represented by its x and y coordinates.

Your task is to determine the number of squares that can be formed using these points such that:

The sides of the square are parallel to the X-axis and Y-axis.

All four vertices of the square must be present in the given set of points.

Duplicate points, if any, should be ignored.

🔹 Input Format

The first line contains an integer N (4 ≤ N ≤ 500), the number of points.

The next N lines each contain two integers x and y, representing the coordinates of a point.

Coordinates range from -10 to 10.

🔹 Output Format

Print a single integer representing the total number of axis-parallel squares that can be formed.

🔹 Example

Input:

5
0 0
0 2
2 2
1 1
2 0


Output:

1

🔹 Explanation

The points
(0,0), (0,2), (2,2), (2,0)
form one square parallel to the axes.

Point (1,1) does not form another square.



import java.util.*;

public class square{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        HashSet<String>set=new HashSet<>();
        for(int u=0;u<n;u++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            set.add(x+","+y);

        }
        int count=0;
        List<String>l=new ArrayList<>(set);
        int s=l.size();
        for(int u=0;u<s;u++){
            String[]d=l.get(u).split(",");
            int x1=Integer.parseInt(d[0]);
            int y1=Integer.parseInt(d[1]);
            for(int j=u+1;j<s;j++){
                String[]d1=l.get(j).split(",");
                int x2=Integer.parseInt(d1[0]);
                int y2=Integer.parseInt(d1[1]);
                if(x1==x2 && y1!=y2){
                    int side=Math.abs(y2-y1);
                    int x3=x1+side;
                    int x4=x2+side;
                    if(set.contains(x3+","+y1) && set.contains(x4+","+y2)){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}

Time complexity: O(n^2)
Space complexity: O(n)