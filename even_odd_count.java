
import java.util.*;
public class even_odd_count
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=0;
		int o=0;
		while(n>0){
		    int c=n%10;
		    if(c%2==0){
		        e++;
		    }else{
		        o++;
		    }
		    n/=10;
		}
		if(e==o){
		    System.out.print("-1");
		}else if(e>o){
		    System.out.print("even");
		}else{
		    System.out.print("odd");
		}
	}
}