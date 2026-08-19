/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class swapping_unit_digit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a%10;
		int d=b%10;
		int e=a/10;
		int f=b/10;
		int s=e*10+d;
		System.out.print(s+" ");
		System.out.print(f*10+c);
		
	}
}