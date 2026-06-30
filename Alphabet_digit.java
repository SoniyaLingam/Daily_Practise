import java.util.*;

class Alphabet_digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = 0;
        int n = s.length();

        while(i < n){

            if(Character.isLetter(s.charAt(i))){
                int start = i;
                StringBuilder sb=new StringBuilder();
                while(i < n && Character.isLetter(s.charAt(i))){
                    sb.append(s.charAt(i));
                    i++;
                }
                String pu=sb.toString();
                
                
                for(int u=1;u<pu.length()-1;u++){
                    
                    for(int j=0;j<pu.length();j++){
                        if(j==u){
                        
                            continue;
                        }else{
                            System.out.print(pu.charAt(j));
                        }
                    }
                        System.out.print(" ");
                }
                    
                
                
                    
                
            }

            else if(Character.isDigit(s.charAt(i))){
                int start = i;
                 StringBuilder sb=new StringBuilder();
                
                while(i < n && Character.isDigit(s.charAt(i))){
                    sb.append(s.charAt(i));
                    i++;
                }

               
                String pu=sb.toString();
                
                
                for(int u=1;u<pu.length()-1;u++){
                    
                    for(int j=0;j<pu.length();j++){
                        if(j==u){
                            
                            continue;
                        }else{
                            System.out.print(pu.charAt(j));
                        }
                    }
                        System.out.print(" ");
                }
            }

            
        }

        
    }
}