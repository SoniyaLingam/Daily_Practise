A numeric string N is given as input.

The program must repeatedly transform the string using the following rule:

🔁 Transformation Rule
Start from the rightmost digit
Take digits in pairs
Replace each pair with their sum
If a single digit is left (odd length), carry it as it is
🔄 Repeat
Continue the process on the newly formed string
Stop when the string becomes a single digit
📤 Output
Print each intermediate result (including the original number) on a new line
📌 Input Format
A string N consisting only of digits
📌 Output Format
Each step of transformation printed line by line
🔍 Example

Input:

227734

Output:

227734
4147
511
25
7




import java.util.*;
public class digitcompress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        while(true){
            System.out.println(a);
            if(a.length()==1)break;
            int s=a.length()-1;
            String res="";
            while(s>=0){
                if(s==0){
                    res=res+a.charAt(s);
                    s--;
                }
                else{
                    int d=(a.charAt(s)-'0')+(a.charAt(s-1)-'0');
                    res=d+res;
                    s-=2;
                }
                
            }
            a=res;
            
        }
        
    }
}

 Time complexity: O(n log n)
 Space complexity: O(n)