import java.util.*;
class queries_of_library{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int u=0;u<n;u++){
            int b=sc.nextInt();
            if(b>0){
                map.put(b,map.getOrDefault(b,0)+1);
            }else if(b<0){
                b=Math.abs(b);
                map.put(b,map.getOrDefault(b,0)-1);
            }
            
        }
        List<Integer>li=new ArrayList<>();
        int max=0;
        for(int p:map.values()){
            if(p>0){
                if(p>max){
                    max=p;
                }
            }
        }
        for(Integer q:map.keySet()){
            if(map.get(q)==max){
               li.add(q);
            }
        }
        Collections.sort(li);
        for(int u=li.size()-1;u>=0;u--){
            System.out.print(li.get(u)+" ");
            
        }
        
        
    }
}