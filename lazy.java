Lazy Robot – Ignoring Commands

In a straight line, a robot is placed at position 0 (that is, at time t = 0, the robot is at position 0).
The robot receives N moving commands. Each command contains two integers T and X, where T represents the time at which the robot receives the command and X represents the destination point on the straight line.

When the robot receives a command, it starts moving towards the destination point X with a speed of 1 unit per second and stops when it reaches the destination point.
The robot ignores any command it receives while it is moving.

The N commands are given in chronological order based on time T.

The program must print:

The number of commands ignored by the robot

The final position of the robot after processing all commands

Boundary Conditions:

1 ≤ N ≤ 100

1 ≤ T ≤ 10⁴

−100 ≤ X ≤ 100

Input Format:

The first line contains N

The next N lines each contain two integers T and X

Output Format:

The first line contains an integer representing the number of commands ignored

The second line contains an integer representing the final position of the robot

Example Input:
6
1 -5
2 4
3 5
4 0
7 6
10 1

Example Output:
4
6


import java.util.*;
public class lazy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ct=0;
        int cp=0;
        int ft=0;
        int s=0;
        for(int u=0;u<n;u++){
            int t=sc.nextInt();
            int x=sc.nextInt();
            if(t<ft){
                s++;
            }
            else{
                ct=t;
                ft=t+Math.abs(x-cp);
                cp=x;


            }
        }
        System.out.println(s);
        System.out.print(cp);
    }}

- Time complexity: O(n)
- Space complexity: O(1)

