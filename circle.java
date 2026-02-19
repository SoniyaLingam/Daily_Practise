Find Area – Radius or Diameter

Write a Java program that accepts an integer Q as input.

If the value of Q is 1, then the radius of a circle is provided as the next input.

If the value of Q is 2, then the diameter of a circle is provided as the next input.

The program must calculate and print the area of the circle.

The output should be printed with precision up to 2 decimal places.

Use the formula:

Area = (22/7) × r × r


If the diameter is given, first convert it to radius using:

radius = diameter / 2

Example 1

Input:

1
5


Output:

78.57

Example 2

Input:

2
7.5


Output:

44.20



import java.util.*;
public class circle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=sc.nextDouble();
        double r=0;
        if(n==1){
            r=a*a*3.14;
        }else if(n==2){
            r=(a/2)*(a/2)*3.14;
        }else{
            System.out.print("Invalid");
            return;
        }
        System.out.printf("%.2f",r);
    }
}

time and space complexities are constant, O(1)