Write a program to:

👉 Read a single line input containing values separated by commas
👉 Split the values
👉 Print them separated by spaces

🔹 Input Format

A single line string

value1,value2,value3,...
🔹 Output Format

Print the values separated by space

🔹 Example
Input
1,3,4,566,4
Output
1 3 4 566 4




import java.util.*;
public class replacewithcomma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] a=sc.nextLine().split(",");
       
        for(String au:a){
            System.out.print(au+" ");
        }
        
    }
}

Time Complexity = O(n)
Space Complexity = O(n)