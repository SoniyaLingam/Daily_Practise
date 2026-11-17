
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, x;
    scanf("%d %d", &n, &x);

    int b[n];
    int min = __INT_MAX__;

    for (int i = 0; i < n; i++) {
        scanf("%d", &b[i]);

        int diff = abs(x - b[i]);

        if (diff < min) {
            min = diff;
        }
    }

    for (int i = 0; i < n; i++) {
        if (abs(x - b[i]) == min) {
            printf("%d ", b[i]);
        }
    }

    return 0;
}
