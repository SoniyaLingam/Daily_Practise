import java.util.*;
class replace_vowels_consonants{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int u=0;u<n;u++){
            char a=s.charAt(u);
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
                sb.append((char)(a+1));
            }else{
                if(a<'e'){
                    sb.append('e');
                }else if(a>'e' && a<'i'){
                    sb.append('i');
                }else if(a>'i' && a<'o'){
                    sb.append('o');
                }else if(a>'o' && a<'u'){
                    sb.append('u');
                }else if(a>'u' && a<='z'){
                    sb.append('a');
                }
            }
        }
        String t=sb.toString();
        System.out.print(t);
        
    }
}