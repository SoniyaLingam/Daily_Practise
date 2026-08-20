import java.util.*;

public class addOperators_striver{

    public static List<String> addOperators(String num, int target) {

        List<String> result = new ArrayList<>();

        backtrack(num, target, 0, "", 0, 0, result);

        return result;
    }

    public static void backtrack(
            String num,
            int target,
            int index,
            String expression,
            long currentValue,
            long previousValue,
            List<String> result) {

        // All digits have been used
        if (index == num.length()) {

            if (currentValue == target) {
                result.add(expression);
            }

            return;
        }

        // Try different numbers starting from index
        for (int i = index; i < num.length(); i++) {

            // Do not allow numbers like 05, 012, etc.
            if (i > index && num.charAt(index) == '0') {
                break;
            }

            // Take digits from index to i
            String currentNumberString =
                    num.substring(index, i + 1);

            long currentNumber =
                    Long.parseLong(currentNumberString);

            // First number
            if (index == 0) {

                backtrack(
                        num,
                        target,
                        i + 1,
                        currentNumberString,
                        currentNumber,
                        currentNumber,
                        result
                );

            } else {

                // Try +
                backtrack(
                        num,
                        target,
                        i + 1,
                        expression + "+" + currentNumberString,
                        currentValue + currentNumber,
                        currentNumber,
                        result
                );

                // Try -
                backtrack(
                        num,
                        target,
                        i + 1,
                        expression + "-" + currentNumberString,
                        currentValue - currentNumber,
                        -currentNumber,
                        result
                );

                // Try *
                backtrack(
                        num,
                        target,
                        i + 1,
                        expression + "*" + currentNumberString,
                        currentValue - previousValue
                                + previousValue * currentNumber,
                        previousValue * currentNumber,
                        result
                );
            }
        }
    }

    public static void main(String[] args) {

        // Test input
        String num = "123";
        int target = 6;

        List<String> result = addOperators(num, target);

        System.out.println("Input: num = " + num);
        System.out.println("Target: " + target);
        System.out.println("Output: " + result);
    }
}