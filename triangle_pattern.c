
#include <stdio.h>

int main() {
    int a, b, c = 1;

    scanf("%d %d", &a, &b);

    for (int d = 1; d <= a; d++) {
        for (int e = c; e < c + d; e++) {
            if (e % b != 0) {
                printf("%d ", e);
            } else {
                printf("* ");
            }
        }

        c += d;
        printf("\n");
    }

    return 0;
}
