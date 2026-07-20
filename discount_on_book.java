import java.util.*;
class discount_on_book{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=a*b;
        int c=0;
        if(a>=2 && a<=4){
            c=(int)(0.1*k);
            
        }
        else if(a==5){
            c=(int)(0.2*k);
            
        }
        else if(a>5){
            c=(int)(0.5*k);
        }
        System.out.print(k-c);
            
        
    }
}