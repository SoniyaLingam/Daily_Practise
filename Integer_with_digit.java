
import java.util.*;
public class Integer_with_digit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int f=1;
		for(int u=1;u<=a;u++){
			int c=u;
			
		    while(c>0){
		        int d=c%10;
		        if(d==b){
		            System.out.print(u+" ");
					f=0;
		            break;
		        }
		        c/=10;
		    }
		}
		if(f==1){
		    System.out.print("-1");
		}
	}
}