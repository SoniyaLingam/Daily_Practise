The program must accept a string S containing only lowercase alphabets as input.

The program must find the unique alphabets present in the string and print them as alphabet ranges in sorted order.

A range consists of consecutive alphabets in alphabetical order.

Boundary Conditions
1 ≤ Length of S ≤ 100
Input Format

The first line contains the string S.

Output Format

Print the ranges of alphabets in sorted order, each range on a new line.

If a group of alphabets is consecutive, print them in the format:

start:end

If only one alphabet exists in a range, print it as:

a:a
Example 1
Input
fhjgjpqrtsifif
Output
f:j
p:t
Explanation

Unique alphabets in the string:

f g h i j p q r s t

Grouped into consecutive ranges:

f g h i j → f:j
p q r s t → p:t
Example 2
Input
abbackxxyzzponm
Output
a:c
k:k
m:p
x:z
Explanation

Unique sorted alphabets:

a b c k m n o p x y z

Ranges formed:

a b c → a:c
k → k:k
m n o p → m:p
x y z → x:z


import java.util.*;
public class ratiochar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Set<Character>set=new HashSet<>();
        for(char c:a.toCharArray()){
            set.add(c);
        }
        List<Character>list=new ArrayList<>(set);
        Collections.sort(list);
        char strt=list.get(0);
        char la=list.get(0);
        for(int u=1;u<list.size();u++){
            char c=list.get(u);
            if(c==la+1){
                la=c;
            }
            else{
                System.out.println(strt + " : " + la);
                strt=c;
                la=c;
            }
        }
        System.out.println(strt + " : " + la);
    }
}


Time complexity: O(n log n)
Space complexity: O(n)