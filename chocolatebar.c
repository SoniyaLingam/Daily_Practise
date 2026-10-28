
#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    while (c && a >= 5) {
        a -= 5;
        c--;
    }

    printf("%d\n", (a <= b) ? a : -1);

    return 0;
}
