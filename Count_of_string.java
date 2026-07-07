import java.util.*;
class Count_of_string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int n=a.length();
        int n1=b.length();
        int[]fre=new int[26];
        for(int u=0;u<n;u++){
            int s=a.charAt(u)-'a';
            fre[s]++;
            
        }
        int min=Integer.MAX_VALUE;
        int[]cou=new int[n1];
        for(int u=0;u<n1;u++){
            int r=b.charAt(u)-'a';
            int s=fre[r];
            if(s<min){
                min=s;
            }
            
        }
        System.out.print(min);
    }
}