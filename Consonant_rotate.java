import java.util.*;
class Consonant_rotate{
    public static char[] rot(char[]arr,int g,int b){
        g=g%b;
        char[]res=new char[b];
        for(int u=0;u<b;u++){
            res[u]=arr[(u+g)%b];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int g=sc.nextInt();
        int n=s.length();
        List<Character>li=new ArrayList<>();
        for(int u=0;u<n;u++){
            char a=s.charAt(u);
            if(a!='a' && a!='e' && a!='i' && a!='o'&& a!='u'){
                li.add(a);
            }
        }
        int b=li.size();
        char[]arr=new char[li.size()];
        for (int i = 0; i < li.size(); i++) {
            arr[i] = li.get(i);
        }
        char[]ress=rot(arr,g,b);
        int k=0;
        for(int u=0;u<n;u++){
            char bo=s.charAt(u);
            if(bo!='a' && bo!='e' && bo!='i' && bo!='o'&& bo!='u'){
                System.out.print(ress[k]);
                k++;
            }else{
                System.out.print(bo);
            }
        }
    }
}