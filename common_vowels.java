import java.util.*;
class common_vowels{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int n1=a.length();
        int n2=b.length();
        for(int u=0;u<n1;u++){
            char c=a.charAt(u);
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                continue;
            }
            for(int j=0;j<n2;j++){
                char d=b.charAt(j);
                if(d!='a' && d!='e' && d!='i' && d!='o' && d!='u'){
                continue;
                }
                if(c==d){
                    System.out.print(c);
                    break;
                }
            }
        }
    }
}