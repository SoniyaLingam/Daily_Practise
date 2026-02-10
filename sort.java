Sort Integers In-Place in a String

The program must accept a string S containing words and integers separated by spaces as input.
The program must sort only the integers in ascending order while keeping the positions of the words unchanged.

The sorted integers must be placed back only in the positions where integers originally occurred.

Input Format

The first line contains the string S

Output Format

Print the modified string after sorting the integers

Constraints

The string contains at least one word and one integer

Integers contain only digits (0–9)

Example Input 1
skillrack 50 20 code 105 how are 40 you 30

Example Output 1
skillrack 20 30 code 40 how are 50 you 105

Example Input 2
135 cat 9841 dog rat 12 987 cow

Example Output 2
12 cat 135 dog rat 987 9841 cow


import java.util.*;
public class sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[]b=a.split(" ");
        int n=b.length;
        ArrayList<Integer>d=new ArrayList<>();
        ArrayList<Integer>p=new ArrayList<>();
        for(int u=0;u<n;u++){
            if(b[u].matches("\\d+")){
                d.add(Integer.parseInt(b[u]));
                p.add(u);
            }
        }
        Collections.sort(d);
        for(int u=0;u<p.size();u++){
            b[p.get(u)]=String.valueOf(d.get(u));
        }
        StringBuilder r=new StringBuilder();
        for(int u=0;u<n;u++){
            r.append(b[u]);
            if(u<b.length-1){
                r.append(" ");
            }

        }
        System.out.println(r.toString());


    }
}

Time complexity: O(n log n) in the worst case.
Space complexity: O(n).