import java.util.Scanner;
public class week{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n%7;
        if(a==0)System.out.print("Sunday");
        else if(a==1)System.out.print("Monday");
        else if(a==2)System.out.print("Tuesday");
        else if(a==3)System.out.print("Wednesday");
        else if(a==4)System.out.print("thursday");
        else if(a==5)System.out.print("fri");
        else{
            System.out.print("sat");
        }
    }
}