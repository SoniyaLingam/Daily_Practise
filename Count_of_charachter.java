import java.util.*;
class Count_of_charachter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        int c=0;
        for(int u=0;u<n;u++){
            char ch=s.charAt(u);
            if(ch==a){
                int j=u;
                char ch1=s.charAt(j);
                while(ch1!=b){
                    ch1=s.charAt(j+1);
                    c++;
                    j++;
                }
                break;
            }
        }
        System.out.print(c-1);
    }
}