import java.util.*;
class grade_marks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=80 && n<=100){j.java
            System.out.print("S");
        }
        else if(n>=60 && n<80){
            System.out.print("A");
        }
        else if(n>=50 && n<60){
            System.out.print("B");
        }
        else if(n<50){
            System.out.print("C");
        }
    }
}