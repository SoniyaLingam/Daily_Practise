import java.util.*;
class digits_count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int u=1;u<=n;u++){
            sb.append(u);
        }
        System.out.print(sb.length());
    }
}