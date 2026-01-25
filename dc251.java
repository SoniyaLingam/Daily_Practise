Question:Flowchart

import java.util.*;
public class dc251 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = 0;
        while(a <= b){
            d = a;
            while(d > 0){
                if(d % 10 == c){
                    System.out.print(a + " ");
                    break;
                } else {
                    d = d / 10;
                }
            }
            a += 1;
        }
        s.close();
    }
}

Time complexity: O((b - a + 1) * log n)
Space complexity: O(1)
