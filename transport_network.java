import java.util.*;

class transport_network{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        int n = sc.nextInt();

        if (ch == 'O') {
            if (n == 1)
                System.out.println("Ola Auto");
            else if (n == 2)
                System.out.println("Ola Mini");
            else if (n == 3)
                System.out.println("Ola Micro");
            else if (n == 4)
                System.out.println("Ola Prime");
            else
                System.out.println("Invalid");
        } 
        else if (ch == 'U') {
            if (n == 1)
                System.out.println("Uber Auto");
            else if (n == 2)
                System.out.println("Uber Cab");
            else
                System.out.println("Invalid");
        } 
        else {
            System.out.println("Invalid");
        }
    }
}