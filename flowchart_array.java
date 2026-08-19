/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class flowchart_array
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[10];
		while(n>0){
		    arr[n%10]++;
		    n/=10;
		}
		int val=0;
		while(val<10){
		    System.out.print(arr[val]);
		    val++;
		}
		
	}
}