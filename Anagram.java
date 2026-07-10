import java.util.*;
class Anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().toLowerCase().trim();
        String b=sc.nextLine().toLowerCase().trim();
        int[]fre=new int[26];
        int co=0;
        if(a.length()==b.length()){
            for(int u=0;u<a.length();u++){
                int c=a.charAt(u)-'a';
                fre[c]++;
            }
            for(int u=0;u<b.length();u++){
                int d=b.charAt(u)-'a';
                if(fre[d]>0){
                    co++;
                    fre[d]--;
                }
            }
        }
        else{
            System.out.print("NO");
            return;
        }
        if(co==a.length()){
            System.out.print("YES");
            return;
        }else{
            System.out.print("NO");
            return;
        }
    }
}