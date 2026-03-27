A calculator uses a 7-segment display to show digits from 0 to 9.
Each digit requires a specific number of segments to be lit.

The number of segments required for each digit is:

Digit	Segments
0	6
1	2
2	5
3	5
4	4
5	5
6	6
7	3
8	7
9	6
🎯 Task

You are given an integer N, representing the total number of segments available.

Your task is to:

Form a 4-digit number
Use exactly N segments
Each digit must be between 0–9
The number formed should be the maximum possible
📥 Input
A single integer N
📤 Output
Print the maximum 4-digit number that can be formed using exactly N segments
📌 Constraints
You must form exactly 4 digits
All segments must be used
If multiple answers are possible, return the largest number
🔹 Example

Input

13

Output

9711




import java.util.*;
public class calcdisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]seg={6,2,5,5,4,5,6,3,7,6};
        String re="";
        for(int u=0;u<4;u++){
            for(int j=9;j>=0;j--){
                int d=seg[j];
                if(n-d<0)continue;
                int r=4-u-1;
                int min=r*2;
                int max=r*7;
                if(n-d>=min && n-d<=max){
                    re+=j;
                    n-=d;
                    break;
                }
            }
        }
        System.out.println(re);
    }
}

- Time complexity: O(1)
- Space complexity: O(1)