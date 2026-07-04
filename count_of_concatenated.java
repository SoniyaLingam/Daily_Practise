import java.util.*;
class count_of_concatenated{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        String[]arr=new String[n];
        for(int u=0;u<n;u++){
            arr[u]=sc.next();
        }
        int c=0;
        for(int u=0;u<n;u++){
            String a=arr[u];
            for(int j=0;j<n;j++){
                if(u==j){
                    continue;
                }
                String co="";
                co=a+arr[j];
                int k=Integer.parseInt(co);
                if(k%x==0){
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}