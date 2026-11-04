
#include <stdio.h>
#include <string.h>

int main() {
    char a[1000];
    scanf("%999s", a);

    int b = strlen(a);
    int c = b / 2;

    // Print upper half
    for (int d = 0; d < c; d++) {
        printf("%c", a[d]);

        for (int j = 0; j < c - d - 1; j++) {
            printf("*");
        }

        printf("%c\n", a[b - d - 1]);
    }

    // Print middle character
    printf("%c\n", a[c]);

    // Print lower half
    for (int d = c + 1; d < b; d++) {
        printf("%c", a[b - d - 1]);

        for (int j = 0; j < d - c - 1; j++) {
            printf("*");
        }

        printf("%c\n", a[d]);
    }

    return 0;
}
