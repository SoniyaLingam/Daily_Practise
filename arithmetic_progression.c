
#include <stdio.h>

int main() {
    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);

    for (int i = a; i <= c; i += b) {
        printf("%d ", i);
    }

    return 0;
}
