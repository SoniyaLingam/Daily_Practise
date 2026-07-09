class Solution {
    public String largestOddNumber(String num) {
        int n=Integer.parseInt(num);
        int max=0;
        int b=n;
        while(b>0){
            if((b%10)%2!=0 && (b%10)>max){
                max=b%10;
            }
            b/=10;
        }
        StringBuilder sb=new StringBuilder();
        if(max==0){
            return "";
        }else{
            sb.append(max);
        }
        return sb.toString();
    }
}