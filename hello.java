import java.util.Scanner;
public class hello{
    
    public static boolean ispalindrome(String n){
            int l=0,r=n.length()-1;
            while(l<r){
                if(n.charAt(l)!=n.charAt(r)){
                    return false;
                
                }
                l++;
                r--;

            }
            return true;
            
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        boolean found=false;
        String n1="";
        for(int u=0;u<t.length();u++){
            for(int j=u+1;j<=t.length();j++){
                String n=t.substring(u,j);
                if(n.length()>1 && ispalindrome(n)){
                    found=true;
                    if (n1.length()<n.length()) {
                        n1=n;
                        
                    }
                }
            }
        }
        if(found){
            System.out.print(n1);
        }
        else{
            System.out.print("palindrome doesn't exist");
        }
    }
}