import java.util.*;

class digit_in_words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        HashMap<Character, String> map = new HashMap<>();

        map.put('0', "zero");
        map.put('1', "one");
        map.put('2', "two");
        map.put('3', "three");
        map.put('4', "four");
        map.put('5', "five");
        map.put('6', "six");
        map.put('7', "seven");
        map.put('8', "eight");
        map.put('9', "nine");

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            System.out.print(map.get(ch));

            if (i != n.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}