import java.util.*;
public class left_rotation_of_given{
    public static String left_rot(String arr[],String k,int v){
        int p=Integer.parseInt(k);
        String[]res=new String[v];
        p=p%v;
        StringBuilder sb=new StringBuilder();
        for(int u=0;u<v;u++){
            res[u]=arr[p%v];
            p++;
        }
        for(int u=0;u<v;u++){
            sb.append(res[u]).append(" ");
        }
        return sb.toString();
    } 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]arr=s.split(" ");
        String a=sc.nextLine();
        String[]arr1=a.split(" ");
        int n=arr1.length;
        int m=arr.length;
        for(int u=0;u<n;u++){
            String b=left_rot(arr,arr1[u],m);
            System.out.println(b);
            
        }
    }
}