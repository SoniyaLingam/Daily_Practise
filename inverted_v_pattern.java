import java.util.*;
class inverted_v_pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int n=a.length();
        int n1=b.length();
        int ko=1;
        if((n==n1) && ((a.charAt(0)==b.charAt(n1-1))||(a.charAt(n-1)==b.charAt(0)))){
            if(a.charAt(0)==b.charAt(n1-1)){
                for(int u=0;u<n;u++){
                    for(int k=0;k<n-u-1;k++){
                        System.out.print("-");
                    }
                    System.out.print(b.charAt(n1-u-1));
                    if(u!=0){
                    for(int s=0;s<ko;s++){
                        System.out.print("-");
                    }
                    
                        System.out.print(a.charAt(u));
                    
                    ko+=2;
                }
                    System.out.println();
                }
            }
            if(b.charAt(0)==a.charAt(n1-1)){
                for(int u=0;u<n;u++){
                    for(int k=0;k<n-u-1;k++){
                        System.out.print("-");
                    }
                    System.out.print(a.charAt(n1-u-1));
                    if(u!=0){
                    for(int s=0;s<ko;s++){
                        System.out.print("-");
                    }
                    System.out.print(b.charAt(u));
                    ko+=2;
                }
                    System.out.println();
                }
            }
        }else{
            System.out.print("-1");
        }
        
        
    }
}