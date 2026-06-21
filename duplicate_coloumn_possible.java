import java.util.*;
class duplicate_coloumn_possible{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int u=0;u<r;u++){
            for(int j=0;j<c;j++){
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        for(int u:map.values()){
            if(u>c){
                System.out.print("NO");
                return;
            }
            
        }
        System.out.print("YES");
        
       
    }
}