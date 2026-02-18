Max Call Duration - Call Logs

The program must accept the outgoing call logs of a mobile number as the input.
Each call log contains the mobile number, call start time, and end time.

The program must print the mobile number having the maximum total call duration.

If two or more mobile numbers have the same maximum total call duration,
the program must print them in the order of their occurrence.

Boundary Condition(s):

2 ≤ N ≤ 50

Input Format:

The first line contains N.

The next N lines, each contains:

mobile_number start_time end_time


separated by a space.

Time is given in HH:MM:SS format.

Output Format:

Print the mobile number(s) having the maximum total call duration.

Example Input:
5
9876543210 07:08:00 07:09:32
9998887775 10:50:00 10:50:10
9876543210 10:50:45 10:55:00
9998887775 13:23:10 13:24:58
9998887775 17:05:27 17:06:40

Example Output:
9876543210



import java.util.*;
public class phon{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
        int n=sc.nextInt();
        for(int u=0;u<n;u++){
            String s=sc.next();
            String t1=sc.next();
            String t2=sc.next();
            String[] s1=t1.split(":");
            String[] s2=t2.split(":");
            int ss=Integer.parseInt(s1[0])*3600+Integer.parseInt(s1[1])*60+Integer.parseInt(s1[2]);
            int es=Integer.parseInt(s2[0])*3600+Integer.parseInt(s2[1])*60+Integer.parseInt(s2[3]);
            int d=es-ss;
            map.put(s,map.getOrDefault(s,0)+d);

        }
        int max=0;
        for(int u:map.values()){
            if(u>max){
                max=u;
            }

        }
        for(String key:map.keySet()){
            if(map.get(key)==max){
                System.out.print(key);
            }
        }
    }}
Time complexity: O(n)
Space complexity: O(m)