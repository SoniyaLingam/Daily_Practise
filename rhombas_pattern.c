
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int a = n - 2;
    int b = n - 1;
    int c = 1, d = 1;

    // First row
    for (int i = 0; i < n - 1; i++) {
        printf("- ");
    }

    for (int i = 0; i < n; i++) {
        printf("* ");
    }
    printf("\n");

    // Middle rows
    while (c < n - 1) {

        int first = 1;

        for (int i = 0; i < n - c - 1; i++) {
            if (!first) printf(" ");
            printf("-");
            first = 0;
        }

        if (!first) printf(" ");
        printf("*");
        first = 0;

        for (int x = d; x < d + a; x++) {
            printf(" %d", x);
        }

        printf(" *\n");

        d += a;
        c++;
    }

    // Last row
    for (int i = 0; i < n; i++) {
        printf("* ");
    }

    return 0;
}
