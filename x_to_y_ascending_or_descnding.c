
#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);

    if (a <= b) {
        for (int c = a; c <= b; c++) {
            if (c % 2 == 0) {
                printf("%d ", c);
            }
        }
    } 
    else {
        for (int c = a; c >= b; c--) {
            if (c % 2 == 0) {
                printf("%d ", c);
            }
        }
    }

    return 0;
}
