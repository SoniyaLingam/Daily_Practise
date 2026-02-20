Question:

Write a Java program to calculate the total price from a given sentence.

The input consists of a sentence that may contain one or more floating-point numbers representing prices.
Extract all the valid decimal numbers from the sentence and print their total sum up to 2 decimal places.

Input Format:

A single line containing a sentence.

Output Format:

Print the total sum of all floating-point numbers present in the sentence, formatted to two decimal places.

Sample Input:
Cost of 5 pens is 50.98 rupees. Cost of a pencil is 4.25.
Sample Output:
55.23

import java.util.*;
public class words{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] a=sc.nextLine().split(" ");
        double t=0.0;
        for(String w:a){
            w=w.replaceAll("[^0-9.]","");
            if(w.matches("\\d+\\.\\d+")){
                t+=Double.parseDouble(w);
            }

        }
        System.out.printf("%.2f",t);

    }
}

Time complexity: O(N)
Space complexity: O(N)