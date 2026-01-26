Square Submatrix - Same Unit Digit

An integer matrix of size RC is passed as the input. Another integer N is also passed as the input. The program must print Yes if there is a submatrix of size NN where all the integers are having the same unit digit. Else the program must print No as the output.

Boundary Condition(s):
1 <= R, C <= 100
1 <= Matrix element value <= 1000
1 <= N <= 10

Input Format:
The first line contains R and C separated by a space.
The next R lines contain C values each separated by a space.
The R+2nd line contains N.

Output Format:
The first line contains Yes or No.

Example Input/Output 1:
Input:
5 6
1 2 2 2 3 5
5 4 4 8 1 1 9
7 1 2 2 6 6 8 4
9 71 901 8 9 13
1 1 1 3 2 5
2

Output:
Yes

import java.util.*;
public class dc261{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
int b=a.nextInt();
int c=a.nextInt();
int[][] d=new int[b][c];
int e=0,f=0,g=0,h=0,i=0,j=0;
for(e=0;e<b;e++)for(f=0;f<c;f++)d[e][f]=a.nextInt();
int k=a.nextInt();
for(e=0;e<=b-k;e++){
for(f=0;f<=c-k;f++){
i=1;
j=d[e][f]%10;
for(g=e;g<e+k;g++)
for(h=f;h<f+k;h++)
if(d[g][h]%10!=j)i=0;
if(i==1){System.out.print("Yes");break;}
}
if(i==1)break;
}
if(i==0)System.out.print("No");
a.close();
}
}

Time complexity: O(b * c * k^2)
Space complexity: O(b * c)