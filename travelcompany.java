A travel company receives N booking requests.
Each booking request contains:

Source city
Destination city
Number of persons

Each bus has a maximum of X seats.

📌 Task

The program must:

Accept N booking requests and the value of X
For each booking request:
If the number of seats remaining in the bus (for that source → destination) is greater than or equal to the number of persons:
Book the seats
Print: "Booked Successfully"
Otherwise:
Print: "Failed"
⚠️ Important Rule
Seat availability is tracked separately for each source-destination pair
Each route can have maximum X seats only
📥 Input Format
First line: Integer N (number of requests)
Second line: Integer X (maximum seats per route)

Next N lines:

source destination number_of_persons
📤 Output Format
For each request, print:
"Booked Successfully" OR
"Failed"
🧠 Example
Input:
3 5
Chennai Bangalore 2
Chennai Bangalore 3
Chennai Bangalore 2
Output:
Booked Successfully
Booked Successfully
Failed




import java.util.*;

public class travelcompany {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

       
        for (int i = 0; i < N; i++) {

            String src = sc.next();
            String dest = sc.next();
            int count = sc.nextInt();

            String key = src + "-" + dest;

            int used = 0;
            if (map.containsKey(key)) {
                used = map.get(key);
            }

            
            if (used + count <= X) {
                map.put(key, used + count);
                System.out.println("Booked Successfully");
            } else {
                System.out.println("Failed");
            }
        }
    }
}

Time complexity:O(N)
Space complexity:O(N)