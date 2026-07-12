import java.util.*;
class oddmanout{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        List<Integer>lie=new ArrayList<>();
        List<Integer>lio=new ArrayList<>();
        for(int u=0;u<n;u++){
            arr[u]=sc.nextInt();
            if(arr[u]%2==0){
                lie.add(arr[u]);
            }else{
                lio.add(arr[u]);
            }
        }
        if(lie.size()>lio.size()){
            for(int u=0;u<lio.size();u++){
                System.out.print(lio.get(u));
                return;
            }
        }else{
            for(int u=0;u<lie.size();u++){
                System.out.print(lie.get(u));
                return;
            }
        }
        
    }
}