The program must accept a string S representing a file system as the input.
The program must print the absolute path to each file in the given file system.

If there is no file, then the program must print -1 as the output.

The string S contains the names of directories, sub-directories, and files, where:

\n indicates a new line

\t indicates one level of sub-directory

Boundary Conditions
8 ≤ Length of S ≤ 1000

Input Format

The first line contains S.

Output Format

The line(s), each containing the absolute path to the file
OR the first line contains -1 if no file exists.

Example Input/Output 1
Input:
MyDir\n\tPhotos\n\t\tmyphoto.jpeg\n\t\tMiniProject\n\tDocuments\n\t\tIDProof\n\t\t\tMyAadhaar.pdf

Output:
MyDir\Photos\myphoto.jpeg
MyDir\Documents\IDProof\MyAadhaar.pdf

Example Input/Output 2
Input:
Hector\n\tAndroid\n\tJava\n\t\tNetBeans\n\t\tEclipse\n\tCodeBlocks\n\t\tSampleProject\n\tGeany

Output:
-1

import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] b=a.split("\\\\n");
        Map<Integer,String>map=new HashMap<>();
        boolean f=false;
        for(String part:b){
            int l=0;
            while(part.startsWith("\\t")){
                l++;
                part=part.substring(2);

            }
            map.put(l,part);
            StringBuilder s=new StringBuilder();
            if(part.contains(".")){
                f=true;
                for(int u=0;u<=l;u++){
                    s.append(map.get(u));
                    if(u!=l){
                        s.append("\\");
                    }
                }
                System.out.println(s.toString());
            }
        }
        
        if(!f){
            System.out.print("-1");
        }
    }
}

- Time complexity: O(N)
- Space complexity: O(N)