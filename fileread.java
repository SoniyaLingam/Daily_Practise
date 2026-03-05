The program must accept the name of a text file as input.

The file contains multiple lines, and each line may contain both words and integer values separated by spaces.

The program must remove all integer values from the file content and print only the string (word) values.

The output must display the file name followed by the modified content where all integers are removed.

Input Format

A single line containing the file name.

Example:

numbers.txt
Output Format

Print the file name followed by a colon.

Then print the content of the file with all integers removed, maintaining the original order of the words.

Example Input
numbers.txt
Content of the file numbers.txt
One 2 3 4 Five
6 Seven 8 Nine Ten
Eleven 12 13
Fourteen Fifteen
Example Output
numbers.txt:
One Five
Seven Nine Ten
Eleven
Fourteen Fifteen

import java.util.*;
import java.io.*;

public class fileread {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println(fileName + ":");

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(" ");

                for (String word : parts) {

                    if (!word.matches("\\d+")) {
                        System.out.print(word + " ");
                    }
                }

                System.out.println();
            }

            br.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}