import java.util.*;

class Matrix_righttop_leftbottom{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int mid=n/2;

        HashMap<Integer,Integer> map=new HashMap<>();

        
        for(int i=0;i<(n+1)/2;i++){
            for(int j=mid;j<n;j++){
                
                map.put(arr[i][j],map.getOrDefault(arr[i][j],0)+1);
            }
        }

        

        int count=0;

        

        for(int i=mid;i<n;i++){
            for(int j=0;j<(n+1)/2;j++){

               

                if(map.getOrDefault(arr[i][j],0)>0){
                    count++;
                    map.put(arr[i][j],map.get(arr[i][j])-1);
                }
            }
        }

        System.out.println(+count);
    }
}
