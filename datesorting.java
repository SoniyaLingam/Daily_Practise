The program must read N date strings and sort them in chronological order.

Each date is written using three components separated by -, but the order of the components can vary.

The components are:

Day (1–31)

Month (Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec)

Year (4-digit number)

Your task is to:

Identify the day, month, and year from each input date.

Convert the month name to its numeric value for comparison.

Sort all the dates in ascending order of year → month → day.

Print the sorted dates in the format:

DD-MMM-YYYY
Input Format

The first line contains an integer N.

The next N lines each contain a date string.

Output Format

Print the N dates in chronological order, each on a new line, in the format:

DD-MMM-YYYY
Constraints
1 ≤ N ≤ 100
Example Input
4
12-Mar-2021
Mar-18-1999
2015-Apr-30
2012-11-Sep
Example Output
18-Mar-1999
11-Sep-2012
30-Apr-2015
12-Mar-2021
Explanation

The dates are converted internally as:

Input	Parsed
12-Mar-2021	Day=12 Month=3 Year=2021
Mar-18-1999	Day=18 Month=3 Year=1999
2015-Apr-30	Day=30 Month=4 Year=2015
2012-11-Sep	Day=11 Month=9 Year=2012

Sorting by year → month → day gives the final output.


import java.util.*;
public class datesorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine().trim());
        List<String[]>list=new ArrayList<>();
        String[]months={"Jan","Feb","Mar","Apr","May","Jun",
                           "Jul","Aug","Sep","Oct","Nov","Dec"};
       
        for(int u=0;u<n;u++){
            String[] parts=sc.nextLine().trim().split("-");
            int d=0,m=0,y=0;
            String dx="",mx="",yx="";
            for(String x:parts){
                if(x.matches("\\d+")){
                    if(x.length()==4){
                        y=Integer.parseInt(x);
                        yx=x;
                    }else{
                        d=Integer.parseInt(x);
                        dx=x;
                    }
                }
                else{
                    for(int j=0;j<12;j++){
                        if(months[j].equalsIgnoreCase(x)){
                            m=j+1;
                            mx=x;
                            break;
                        }
                    }
                }
            }
            list.add(new String[]{String.valueOf(d),String.valueOf(m),String.valueOf(y),dx,mx,yx});
        }
            list.sort((a,b)->{
                int yo=Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
                if(yo!=0)return yo;
                int mo=Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
                if(mo!=0)return mo;
                return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
        });
            for(String[] y:list){
                System.out.println(y[3] + "-" + y[4] + "-" + y[5]);
            }
            
    }  
        
    }

    Time complexity is approximately O(n log n).
    Total space complexity is O(n)