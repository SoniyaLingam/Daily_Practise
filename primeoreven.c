
#include <stdio.h>

int is_prime_fast(int a) {
    if (a <= 1) {
        return 0;
    }

    for (int b = 2; b * b <= a; b++) {
        if (a % b == 0) {
            return 0;
        }
    }

    return 1;
}

int main() {
    int c;
    scanf("%d", &c);

    if (c % 2 == 0 || is_prime_fast(c)) {
        printf("valid");
    } else {
        printf("invalid");
    }

    return 0;
}
