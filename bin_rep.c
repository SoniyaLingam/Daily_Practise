
#include <stdio.h>

int main() {
    char a[1000];
    scanf("%999s", a);

    for (int i = 0; a[i] != '\0'; i++) {
        int n = a[i] - '0';

        for (int j = 3; j >= 0; j--) {
            printf("%d", (n >> j) & 1);
        }

        printf("\n");
    }

    return 0;
}
