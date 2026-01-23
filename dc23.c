The function/method replaceWithNextDigit accepts an argument N representing an integer value.
The function/method replaceWithNextDigit must print the output based on the following conditions.
For each digit D in the integer N, the program must form a new integer by replacing the digit with its next digit. For the digit 9, consider 0 as the next digit.
Then the program must print the resulting integers in sorted order.
Your task is to implement the function replaceWithNextDigit so that the program runs successfully.
IMPORTANT: Do not write the main() function as it is already defined.
Example Input/Output 1:

Input:
12543

Output:
12544 12553 12643 13543 22543

Explanation:

For the 1st digit:
12543 becomes 22543

For the 2nd digit:
12543 becomes 13543

For the 3rd digit:
12543 becomes 12643

For the 4th digit:
12543 becomes 12553

For the 5th digit:
12543 becomes 12544

So the resulting five integers are printed in sorted order:
12544 12553 12643 13543 22543

void replaceWithNextDigit(int N)
{
    char s[20];
    sprintf(s, "%d", N);
    int len = strlen(s);

    int res[20], k = 0;

    for(int i = 0; i < len; i++)
    {
        char temp[20];
        strcpy(temp, s);

        temp[i] = (s[i] == '9') ? '0' : s[i] + 1;
        res[k++] = atoi(temp);
    }

    // sort results
    for(int i = 0; i < k - 1; i++)
        for(int j = i + 1; j < k; j++)
            if(res[i] > res[j])
            {
                int t = res[i];
                res[i] = res[j];
                res[j] = t;
            }

    for(int i = 0; i < k; i++)
        printf("%d ", res[i]);
}

Time Complexity:O(d2)
Space Complexity:O(d)


