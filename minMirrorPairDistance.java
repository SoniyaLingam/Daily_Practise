class minMirrorPairDistance {
    public int reverse(int j){
        int r=0;
        while(j>0){
            
            r=r*10+j%10;
            j/=10;
        }
        return r;
    }
    
    public int minMirrorPairDistance(int[] nums) {
        
       int min=Integer.MAX_VALUE;
       for(int u=0;u<nums.length;u++){
        for(int j=u+1;j<nums.length;j++){
            if(nums[j]==reverse(nums[u])){
                min=Math.min(min,j-u);
            }
        }
       }
       return min==Integer.MAX_VALUE?-1:min;
    }
}

Note:Time Limit exceeded as solved by brute force