class Solution_leetcode{
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[]res=new int[n];
        
        for(int u=0;u<n;u++){
            int sum=0;
            for(int j=0;j<u;j++){
                sum+=nums[j];
            }
            res[u]=sum;
        }
        int[]rev=new int[n];
       
        
        for(int u=n-1;u>=0;u--){
            int sum=0;
            for(int j=n-1;j>u;j--){
                sum+=nums[j];
            }
            rev[u]=sum;
        }
        int[]result=new int[n];
        for(int u=0;u<n;u++){
            result[u]=Math.abs(res[u]-rev[u]);
        }
        return result;
    }
}