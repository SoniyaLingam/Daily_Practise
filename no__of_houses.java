import java.util.*;
class no__of_houses{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int[]arr=new int[n];
        for(int u=0;u<n;u++){
            int c=0;
            String s=sc.next();
            int l=s.length();
            for(int uo=0;uo<l;uo++){
                char a=s.charAt(uo);
                if(a=='-'){
                    c++;
                }
            }
            if(c>=max){
                max=c;
            }
            arr[u]=c;
            
        }
        for(int u=0;u<n;u++){
            if(arr[u]==max){
                System.out.print(u+1+" ");
            }
        }
        
    }
}