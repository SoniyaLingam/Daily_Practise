import java.util.*;
class alphabets_integer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int n=sc.nextInt();
        int b = ((a -'a')%26)+'a';
        for(int u=0;u<n;u++){
            for(int j=0;j<n;j++){
                
                System.out.print((char)b+" ");
                b++;
                if(b>'z'){
                    b='a';
                }
                
            }
            System.out.println();
        }
        
    }
}