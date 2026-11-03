
#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);

    char a[100];
    int b = 0;

    // Convert decimal to binary
    while (n > 0) {
        a[b++] = (n % 2) + '0';
        n /= 2;
    }

    a[b] = '\0';

    // Reverse the binary string
    for (int i = 0; i < b / 2; i++) {
        char temp = a[i];
        a[i] = a[b - i - 1];
        a[b - i - 1] = temp;
    }

    // Print binary string
    printf("%s\n", a);

    // Print middle pattern
    for (int c = 1; c < b - 1; c++) {
        printf("%c", a[c]);

        for (int j = 0; j < b - 2; j++) {
            printf("*");
        }

        printf("%c\n", a[b - c - 1]);
    }

    // Print reversed binary string
    for (int i = b - 1; i >= 0; i--) {
        printf("%c", a[i]);
    }

    printf("\n");

    return 0;
}
