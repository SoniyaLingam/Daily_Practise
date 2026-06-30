import java.util.*;

class Alphabet_digit_separation{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        List<String> letters = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        int i = 0;
        int n = s.length();

        while(i < n){

            if(Character.isLetter(s.charAt(i))){
                int start = i;

                while(i < n && Character.isLetter(s.charAt(i))){
                    i++;
                }

                letters.add(s.substring(start, i));
            }

            else if(Character.isDigit(s.charAt(i))){
                int start = i;

                while(i < n && Character.isDigit(s.charAt(i))){
                    i++;
                }

                numbers.add(s.substring(start, i));
            }

            
        }

        System.out.println(letters);
        System.out.println(numbers);
    }
}