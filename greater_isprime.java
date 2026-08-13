/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class greater_isprime
{
    public static boolean ispri(int a){
        for(int u=2;u<a;u++){
            if(a%u==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		while(true){
		    a+=1;
		    if(ispri(a)){
		        System.out.print(a);
		        break;
		    }
		}
	}
}