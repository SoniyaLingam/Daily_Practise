
#include <stdio.h>

int main() {
    int a, b = 0, c, d;

    scanf("%d", &a);

    for (int i = 0; i < a; i++) {
        scanf("%d", &c);

        d = c % 10;

        if (d < 5) {
            b += c - d;
        } else {
            b += c + (10 - d);
        }
    }

    printf("%d\n", b);

    return 0;
}
