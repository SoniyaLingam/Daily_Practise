
import java.util.*;
public class find_smallest_word
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		String[]arr=sc.nextLine().split(" ");
		int a=arr.length;
		String t="";
		for(int u=0;u<a;u++){
		    int b=arr[u].length();
		    if(b<min){
		        t=arr[u];
		        min=b;
		    }
		}
		System.out.print(t);
	}
}