
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for (int a = 1; a <= n; a++) {
        int num = a * a;
        int binary[32], i = 0;

        while (num > 0) {
            binary[i++] = num % 2;
            num /= 2;
        }

        for (int j = i - 1; j >= 0; j--) {
            printf("%d", binary[j]);
        }

        printf(" ");
    }

    return 0;
}
