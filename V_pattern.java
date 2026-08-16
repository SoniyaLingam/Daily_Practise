/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class V_pattern
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=(n/2)+1;
		int k=1;
		int s=n;
		for(int u=0;u<q;u++){
		    for(int j=0;j<n;j++){
		        if(u==j){
		            System.out.print(k);
		            k++;
		        }else if(u==n-j-1){
		            System.out.print(s);
		            s--;
		        }else{
		            System.out.print("*");
		        }
		    }
			System.out.println();
		}
	}
}