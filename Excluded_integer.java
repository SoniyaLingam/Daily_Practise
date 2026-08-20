
import java.util.*;
public class Excluded_integer
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		int c=0;
		for(int u=0;u<n;u++){
		    arr[u]=sc.nextInt();
		}
		for(int u=1;u<n-1;u++){
		    if((arr[u-1]+arr[u+1])==arr[u]){
		        continue;
		    }else{
		        c=arr[u]-arr[u-1];
		        break;
		    }
		}
		if(c==0){
		    c=arr[n-1]-arr[n-2];
		}
		System.out.print(c);
	}
}