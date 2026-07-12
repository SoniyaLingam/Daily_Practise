import java.util.*;
class group_of_led{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]arr=s.split(" ");
        int n=arr.length;
        int c=0;
        for(int u=0;u<n;u++){
            String t=arr[u];
            for(int j=u+1;j<n;j++){
                if(t.equals(arr[j])){
                    c++;
                }
            }
        }
        System.out.print(n+c);
    }
}